package castaldosamuele.S7L1.services;

import castaldosamuele.S7L1.entities.Viaggio;
import castaldosamuele.S7L1.exceptions.NotFoundException;
import castaldosamuele.S7L1.payloads.NewViaggioDTO;
import castaldosamuele.S7L1.repositories.ViaggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViaggioService {

    @Autowired
    private ViaggioRepository viaggioRepository;

    //GET --------------------------------------------
    public List<Viaggio> findAll() {
        return this.viaggioRepository.findAll();
    }

    public Viaggio findById(long id) {
        return this.viaggioRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    //POST --------------------------------------------
    public Viaggio save(NewViaggioDTO body) {
        Viaggio newViaggio = new Viaggio(body.destinazione(), body.data(), body.stato());
        return this.viaggioRepository.save(newViaggio);
    }

    //PUT --------------------------------------------
    public Viaggio findByIdAndUpdate(long id, NewViaggioDTO body) {
        Viaggio found = this.findById(id);

        found.setDestinazione(body.destinazione());
        found.setStato(body.stato());
        found.setData(body.data());

        return this.viaggioRepository.save(found);
    }

    public Viaggio findByAndUpdateStato(long id, String newStato) {
        Viaggio found = this.findById(id);
        found.setStato(newStato);
        return this.viaggioRepository.save(found);
    }

    //DELETE --------------------------------------------
    public void findByIdAndDelete(long id) {
        Viaggio found = this.findById(id);
        this.viaggioRepository.delete(found);
    }
}