package samuelecastaldo.s6l3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import samuelecastaldo.s6l3.entities.Autore;
import samuelecastaldo.s6l3.payloads.NewAutorePayload;
import samuelecastaldo.s6l3.services.AutoreService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autore")
public class AutoreControllers {
    @Autowired
    AutoreService autoreService;

    @GetMapping
    public List<Autore> findAll() {
        return this.autoreService.findAll();
    }

    @GetMapping("/{id}")
    public Autore findById(@PathVariable long id) {
        return this.autoreService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Autore save(@RequestBody NewAutorePayload body) {
        return this.autoreService.save(body);
    }

    @PutMapping("{id}")
    public Autore findByIdAndUpdate(@PathVariable long id, @RequestBody NewAutorePayload body){
        return this.autoreService.findByIdAndUpdate(id, body);
    }

}
