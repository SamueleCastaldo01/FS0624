package samuelecastaldo.S6L2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogposts")
public class ExampleController {

    @GetMapping
    // Per contattare questo endpoint dovrò mandare una GET a http://localhost:3001/examples
    public String getExample() {
        return "Ciao, io sono l'endpoint che risponde alle richieste GET";
    }




}
