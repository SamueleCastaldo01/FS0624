package castaldosamuele.S7L1.controllers;

import castaldosamuele.S7L1.entities.Dipendente;
import castaldosamuele.S7L1.exceptions.BadRequestException;
import castaldosamuele.S7L1.payloads.NewDipendenteDTO;
import castaldosamuele.S7L1.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
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
    @PreAuthorize("hasAuthority('ADMIN')") // <-- Solo gli ADMIN possono visualizzare la lista degli utenti in questa app
    public List<Dipendente> findAll() {
        return this.dipendenteService.findAll();
    }

    // /Me endpoints----------------------------------------------------------------
    @GetMapping("/me")
    public Dipendente getProfile(@AuthenticationPrincipal Dipendente currentAuthenticatedUser) {
        return currentAuthenticatedUser;
    }

    @PutMapping("/me")
    public Dipendente updateProfile(@AuthenticationPrincipal Dipendente currentAuthenticatedUser, @RequestBody @Validated NewDipendenteDTO body) {
        return this.dipendenteService.findByIdAndUpdate(currentAuthenticatedUser.getId(), body);
    }

    @DeleteMapping("/me")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProfile(@AuthenticationPrincipal Dipendente currentAuthenticatedUser) {
        this.dipendenteService.findByIdAndDelete(currentAuthenticatedUser.getId());
    }

    // il resto dei metodi----------------------------------------------------------------

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public Dipendente findById(@PathVariable long id) {
        return this.dipendenteService.findById(id);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
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
    @PreAuthorize("hasAuthority('ADMIN')")
    public Dipendente findByIdAndUpdate(@PathVariable long id, @RequestBody @Validated NewDipendenteDTO body, BindingResult validationResult) {
        if (validationResult.hasErrors()) {
            validationResult.getAllErrors().forEach(System.out::println);
            throw new BadRequestException("Ci sono stati errori nel payload!");
        }
        // Ovunque ci sia un body bisognerebbe validarlo!
        return this.dipendenteService.findByIdAndUpdate(id, body);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findByIdAndDelete(@PathVariable long id) {
        this.dipendenteService.findByIdAndDelete(id);
    }

    @PatchMapping("/{id}/avatar")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String uploadAvatar(@RequestParam("avatar") MultipartFile file) {
        return this.dipendenteService.uploadAvatar(file);
    }
}
