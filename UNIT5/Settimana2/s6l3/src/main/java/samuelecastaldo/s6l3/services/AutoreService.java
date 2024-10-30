package samuelecastaldo.s6l3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import samuelecastaldo.s6l3.entities.Autore;
import samuelecastaldo.s6l3.payloads.NewAutorePayload;
import samuelecastaldo.s6l3.repositories.AutoreRepository;

@Service
public class AutoreService {
    @Autowired
    private AutoreRepository autoreRepository;

    public Autore save(NewAutorePayload body) {
        Autore newAutore = new Autore(body.getNome(), body.getCognome(), body.getEmail(), body.getDataDiNascita());
        return this.autoreRepository.save(newAutore);
    }



}
