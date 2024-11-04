package castaldosamuele.S7L1.services;

import castaldosamuele.S7L1.entities.Dipendente;
import castaldosamuele.S7L1.exceptions.BadRequestException;
import castaldosamuele.S7L1.exceptions.NotFoundException;
import castaldosamuele.S7L1.payloads.NewDipendenteDTO;
import castaldosamuele.S7L1.repositories.DipendenteRepository;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class DipendenteService {

    @Autowired
    private DipendenteRepository dipendenteRepository;

    @Autowired
    private Cloudinary cloudinaryUploader;

    //GET --------------------------------------------
    public List<Dipendente> findAll() {
        return this.dipendenteRepository.findAll();
    }

    public Dipendente findById(long id) {
        return this.dipendenteRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    //POST --------------------------------------------
    public Dipendente save(NewDipendenteDTO body) {
        //controllo se ci sta già un altro con la stessa email
        this.dipendenteRepository.findByEmail(body.email()).ifPresent(
                user -> {
                    throw new BadRequestException("Email " + body.email() + " già in uso!");
                }
        );
        //controllo anche dell'username, deve essere univoco
        this.dipendenteRepository.findByUsername(body.username()).ifPresent(
                user -> {
                    throw new BadRequestException("Username " + body.username() + " è già in uso!");
                }
        );
        Dipendente newDipendente = new Dipendente(body.username(), body.nome(), body.cognome(), body.email(), body.avatarUrl(), body.password());
        return this.dipendenteRepository.save(newDipendente);
    }

    //PUT --------------------------------------------
    public Dipendente findByIdAndUpdate(long id, NewDipendenteDTO body) {
        Dipendente found = this.findById(id);

        if (!found.getEmail().equals(body.email())) {
            this.dipendenteRepository.findByEmail(body.email()).ifPresent(
                    user -> {
                        throw new BadRequestException("Email " + body.email() + " già in uso!");
                    }
            );
        }
        found.setUsername(body.username());
        found.setNome(body.nome());
        found.setCognome(body.cognome());
        found.setEmail(body.email());

        return this.dipendenteRepository.save(found);
    }

    //DELETE --------------------------------------------
    public void findByIdAndDelete(long id) {
        Dipendente found = this.findById(id);
        this.dipendenteRepository.delete(found);
    }

    public String uploadAvatar(MultipartFile file) {
        String url = null;
        try {
            url = (String) cloudinaryUploader.uploader().upload(file.getBytes(), ObjectUtils.emptyMap()).get("url");
        } catch (IOException e) {
            throw new BadRequestException("Ci sono stati problemi con l'upload del file!");
        }
        return url;
    }

    public Dipendente findByEmail(String email) {
        return this.dipendenteRepository.findByEmail(email).orElseThrow(() -> new NotFoundException("L'utente con email " + email + " non è stato trovato"));
    }

}
