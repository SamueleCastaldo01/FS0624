package castaldosamuele.S7L1.controllers;

import castaldosamuele.S7L1.entities.Prenotazione;
import castaldosamuele.S7L1.exceptions.BadRequestException;
import castaldosamuele.S7L1.payloads.NewPrenotazioneDTO;
import castaldosamuele.S7L1.services.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/prenotazione")
public class PrenotazioneController {

    @Autowired
    PrenotazioneService prenotazioneService;

    @GetMapping
    public List<Prenotazione> findAll() {
        return this.prenotazioneService.findAll();
    }

    @GetMapping("/{id}")
    public Prenotazione findById(@PathVariable long id) {
        return this.prenotazioneService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Prenotazione save(@RequestBody @Validated NewPrenotazioneDTO body, BindingResult validationResult) {
        if (validationResult.hasErrors()) {
            String message = validationResult.getAllErrors().stream().map(objectError -> objectError.getDefaultMessage())
                    .collect(Collectors.joining(". "));
            throw new BadRequestException("Ci sono stati errori nel payload! " + message);
        }

        return this.prenotazioneService.save(body);
    }

    @PutMapping("/{id}")
    public Prenotazione findByIdAndUpdate(@PathVariable long id, @RequestBody @Validated NewPrenotazioneDTO body, BindingResult validationResult) {
        if (validationResult.hasErrors()) {
            validationResult.getAllErrors().forEach(System.out::println);
            throw new BadRequestException("Ci sono stati errori nel payload!");
        }
        // Ovunque ci sia un body bisognerebbe validarlo!
        return this.prenotazioneService.findByIdAndUpdate(id, body);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findByIdAndDelete(@PathVariable long id) {
        this.prenotazioneService.findByIdAndDelete(id);
    }
}
