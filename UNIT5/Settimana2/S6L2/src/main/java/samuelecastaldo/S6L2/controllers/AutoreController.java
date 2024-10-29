package samuelecastaldo.S6L2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import samuelecastaldo.S6L2.entities.Autore;
import samuelecastaldo.S6L2.payloads.NewAutorePayload;
import samuelecastaldo.S6L2.service.AutoreService;
import samuelecastaldo.S6L2.service.AutoreService;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AutoreController {

    @Autowired
    private AutoreService autoreService;

    @GetMapping
    public List<Autore> getAutore() {
        return this.autoreService.findAll();
    }

    @GetMapping("/{id}")
    public Autore findAutoreById(@PathVariable int id) {
        return this.autoreService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Autore createAutore(@RequestBody NewAutorePayload body) {
        return this.autoreService.saveAutore(body);
    }

    @PutMapping("/{id}")
    public Autore findAutoreByIdAndUpdate(@PathVariable int id, @RequestBody NewAutorePayload body) {
        return this.autoreService.findByIdAndUpdate(id, body);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findByAutoreByIdAndDelete(@PathVariable int id) {
        this.autoreService.findByIdAndDelete(id);
    }

}
