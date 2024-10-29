package samuelecastaldo.S6L2.service;

import org.springframework.stereotype.Service;
import samuelecastaldo.S6L2.entities.Autore;
import samuelecastaldo.S6L2.exception.NotFoundException;
import samuelecastaldo.S6L2.payloads.NewAutorePayload;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AutoreService {
    private List<Autore> autoreList = new ArrayList<>();

    public List<Autore> findAll() {
        return this.autoreList;
    }

    public Autore findById(int autoreId) {
        Autore found = null;
        for (Autore autore : this.autoreList) {
            if(autore.getId() == autoreId) {
                found = autore;
            }
        }
        if(found == null) throw new NotFoundException(autoreId);
        return found;
    }

    public Autore findByIdAndUpdate(int id, NewAutorePayload body) {
        Autore found = null;
        for(Autore autore : this.autoreList) {
            if(autore.getId() == id) {
                found = autore;
                found.setNome(body.getNome());
                found.setCognome(body.getCognome());
                found.setEmail(body.getEmail());
                found.setDataDiNascita(body.getDataDiNascita());
            }
        }
        if (found == null) throw new NotFoundException(id);
        return found;
    }

    public Autore saveAutore(NewAutorePayload body) {
        Random rndm = new Random();
        Autore newAutore = new Autore(body.getNome(), body.getCognome(), body.getEmail(), body.getDataDiNascita());
        newAutore.setId(rndm.nextInt(1, 10000));
        this.autoreList.add(newAutore);
        return newAutore;
    }

    public void findByIdAndDelete(int id) {
        Autore found = null;
        for (Autore autore : this.autoreList) {
            if (autore.getId() == id) {
                found = autore;
            }
        }
        if (found == null) throw new NotFoundException(id);
        this.autoreList.remove(found);
    }
}
