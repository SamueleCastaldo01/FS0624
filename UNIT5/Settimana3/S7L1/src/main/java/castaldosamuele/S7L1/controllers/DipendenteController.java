package castaldosamuele.S7L1.controllers;

import castaldosamuele.S7L1.entities.Dipendente;
import castaldosamuele.S7L1.exceptions.BadRequestException;
import castaldosamuele.S7L1.payloads.NewDipendenteDTO;
import castaldosamuele.S7L1.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dipendente")
public class DipendenteController {

    @Autowired
    DipendenteService dipendenteService;

    @GetMapping
    public List<Dipendente> findAll() {
        return this.dipendenteService.findAll();
    }

    @GetMapping("/{id}")
    public Dipendente findById(@PathVariable long id) {
        return this.dipendenteService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Dipendente save(@RequestBody @Validated NewDipendenteDTO body, BindingResult validationResult) {
        if (validationResult.hasErrors()) {
            String message = validationResult.getAllErrors().stream().map(objectError -> objectError.getDefaultMessage())
                    .collect(Collectors.joining(". "));
            throw new BadRequestException("Ci sono stati errori nel payload! " + message);
        }

        return this.dipendenteService.save(body);
    }

    @PutMapping("/{id}")
    public Dipendente findByIdAndUpdate(@PathVariable long id, @RequestBody @Validated NewDipendenteDTO body, BindingResult validationResult) {
        if (validationResult.hasErrors()) {
            validationResult.getAllErrors().forEach(System.out::println);
            throw new BadRequestException("Ci sono stati errori nel payload!");
        }
        // Ovunque ci sia un body bisognerebbe validarlo!
        return this.dipendenteService.findByIdAndUpdate(id, body);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findByIdAndDelete(@PathVariable long id) {
        this.dipendenteService.findByIdAndDelete(id);
    }

    @PatchMapping("/{id}/avatar")
    public String uploadAvatar(@RequestParam("avatar") MultipartFile file) {
        return this.dipendenteService.uploadAvatar(file);
    }
}
