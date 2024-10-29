package samuelecastaldo.S6L2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import samuelecastaldo.S6L2.service.BlogService;

@RestController
@RequestMapping("/blogposts")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping
    public String getExample() {
        return "Ciao, a tutti";
    }


}
