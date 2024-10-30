package samuelecastaldo.s6l3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import samuelecastaldo.s6l3.entities.Autore;
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

    public Optional<Autore> findById(long id) {
        return this.autoreRepository.findById(id);
    }

}
