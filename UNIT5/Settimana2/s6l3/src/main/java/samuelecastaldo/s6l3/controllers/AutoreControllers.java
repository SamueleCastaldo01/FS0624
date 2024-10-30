package samuelecastaldo.s6l3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import samuelecastaldo.s6l3.entities.Autore;
import samuelecastaldo.s6l3.payloads.NewAutorePayload;
import samuelecastaldo.s6l3.services.AutoreService;

@RestController
@RequestMapping("/autore")
public class AutoreControllers {
    @Autowired
    AutoreService autoreService;

    @GetMapping
    // Per contattare questo endpoint dovrò mandare una GET a http://localhost:3001/examples
    public String getExample() {
        return "Ciao, io sono l'endpoint che risponde alle richieste GET";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Autore save(@RequestBody NewAutorePayload body) {
        return this.autoreService.save(body);
    }



}
