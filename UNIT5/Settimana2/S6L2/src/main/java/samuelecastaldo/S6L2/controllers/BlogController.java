package samuelecastaldo.S6L2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import samuelecastaldo.S6L2.entities.Blog;
import samuelecastaldo.S6L2.payloads.NewBlogPayload;
import samuelecastaldo.S6L2.service.BlogService;

import java.util.List;

@RestController
@RequestMapping("/blogposts")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping
    public List<Blog> getBlogs() {
        return this.blogService.findAll();
    }

    @GetMapping("/{blogId}")
    public Blog findBlogById(@PathVariable int blogId) {
        return this.blogService.findById(blogId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Blog createBlog(@RequestBody NewBlogPayload body) {
        return this.blogService.saveBlog(body);
    }

    @PutMapping("/{id}")
    public Blog findBlogByIdAndUpdate(@PathVariable int id, @RequestBody NewBlogPayload body) {
        return this.blogService.findByIdAndUpdate(id, body);
    }


}
