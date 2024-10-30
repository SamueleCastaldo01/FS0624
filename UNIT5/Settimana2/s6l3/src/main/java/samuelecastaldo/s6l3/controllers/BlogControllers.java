package samuelecastaldo.s6l3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import samuelecastaldo.s6l3.entities.Blog;
import samuelecastaldo.s6l3.payloads.NewBlogPayload;
import samuelecastaldo.s6l3.services.BlogService;
import samuelecastaldo.s6l3.services.BlogService;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogControllers {
    @Autowired
    BlogService blogservice;

    /*
    @GetMapping
    public List<Blog> findAll() {
        return this.blogservice.findAll();
    } */

    @GetMapping
    public Page<Blog> findAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size,
                              @RequestParam(defaultValue = "id") String sortBy) {
        // Mettiamo dei valori di default per far si che non ci siano errori se il client non ci invia uno dei query parameters
        return this.blogservice.findAll(page, size, sortBy);
    }

    @GetMapping("/{id}")
    public Blog findById(@PathVariable long id) {
        return this.blogservice.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Blog save(@RequestBody NewBlogPayload body) {
        return this.blogservice.save(body);
    }

    @PutMapping("{id}")
    public Blog findByIdAndUpdate(@PathVariable long id, @RequestBody NewBlogPayload body){
        return this.blogservice.findByIdAndUpdate(id, body);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findByIDAndDelete(@PathVariable long id) {
        this.blogservice.findByIdAndDelete(id);
    }
}
