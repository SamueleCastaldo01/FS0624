package castaldosamuele.S7L1.services;

import castaldosamuele.S7L1.entities.Dipendente;
import castaldosamuele.S7L1.exceptions.UnauthorizedException;
import castaldosamuele.S7L1.payloads.UserLoginDTO;
import castaldosamuele.S7L1.tools.JWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private DipendenteService dipendenteService;

    @Autowired
    private JWT jwt;

    public String checkCredentialsAndGenerateToken(UserLoginDTO body) {
        //controllo nel db le credenziali. Se esito positivo restituisce il token
        Dipendente found = this.dipendenteService.findByEmail(body.email());
        if(found.getPassword().equals(body.password())) {
            String accessToken = jwt.CreateToken(found);
            return accessToken;
        } else {
            throw new UnauthorizedException("credenziali errate!");
        }
    }
}
