package castaldosamuele.S7L1.controllers;

import castaldosamuele.S7L1.entities.Viaggio;
import castaldosamuele.S7L1.exceptions.BadRequestException;
import castaldosamuele.S7L1.payloads.NewViaggioDTO;
import castaldosamuele.S7L1.payloads.UpdateStatoDTO;
import castaldosamuele.S7L1.services.ViaggioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/viaggio")
public class ViaggioController {

    @Autowired
    ViaggioService viaggioService;

    @GetMapping
    public List<Viaggio> findAll() {
        return this.viaggioService.findAll();
    }

    @GetMapping("/{id}")
    public Viaggio findById(@PathVariable long id) {
        return this.viaggioService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Viaggio save(@RequestBody @Validated NewViaggioDTO body, BindingResult validationResult) {
        if (validationResult.hasErrors()) {
            String message = validationResult.getAllErrors().stream().map(objectError -> objectError.getDefaultMessage())
                    .collect(Collectors.joining(". "));
            throw new BadRequestException("Ci sono stati errori nel payload! " + message);
        }

        return this.viaggioService.save(body);
    }

    @PutMapping("/{id}")
    public Viaggio findByIdAndUpdate(@PathVariable long id, @RequestBody @Validated NewViaggioDTO body, BindingResult validationResult) {
        if (validationResult.hasErrors()) {
            validationResult.getAllErrors().forEach(System.out::println);
            throw new BadRequestException("Ci sono stati errori nel payload!");
        }
        // Ovunque ci sia un body bisognerebbe validarlo!
        return this.viaggioService.findByIdAndUpdate(id, body);
    }

    @PutMapping("/{id}/stato")
    public Viaggio updateStato(@PathVariable long id, @RequestBody @Validated UpdateStatoDTO body, BindingResult validationResult) {
        if (validationResult.hasErrors()) {
            String message = validationResult.getAllErrors().stream().map(objectError -> objectError.getDefaultMessage())
                    .collect(Collectors.joining(". "));
            throw new BadRequestException("Ci sono stati errori nel payload! " + message);
        }
        String stato = body.stato();
        return viaggioService.findByAndUpdateStato(id, stato);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findByIdAndDelete(@PathVariable long id) {
        this.viaggioService.findByIdAndDelete(id);
    }
}
