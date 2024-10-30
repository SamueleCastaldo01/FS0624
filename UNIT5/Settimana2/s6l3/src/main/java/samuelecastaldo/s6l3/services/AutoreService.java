package samuelecastaldo.s6l3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import samuelecastaldo.s6l3.entities.Autore;
import samuelecastaldo.s6l3.exceptions.NotFoundException;
import samuelecastaldo.s6l3.payloads.NewAutorePayload;
import samuelecastaldo.s6l3.repositories.AutoreRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AutoreService {
    @Autowired
    private AutoreRepository autoreRepository;

    public Autore save(NewAutorePayload body) {
        Autore newAutore = new Autore(body.getNome(), body.getCognome(), body.getEmail(), body.getDataDiNascita());
        return this.autoreRepository.save(newAutore);
    }


    public List<Autore> findAll() {
        return this.autoreRepository.findAll();
    }

    public Autore findById(long id) {
        return this.autoreRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    public Autore findByIdAndUpdate(long id, NewAutorePayload body) {
        Autore found = this.findById(id);
        if(found == null) throw new IllegalArgumentException("Errore");
        found.setNome(body.getNome());
        found.setCognome(body.getCognome());
        found.setEmail(body.getEmail());
        found.setDataDiNascita(body.getDataDiNascita());
        found.setAvatar("https://ui-avatars.com/api/?name=" + body.getNome() + "+" + body.getCognome());
        return this.autoreRepository.save(found);
    }

    public void findByIdAndDelete(long id) {
        Autore found = this.findById(id);
        this.autoreRepository.delete(found);
    }

}
