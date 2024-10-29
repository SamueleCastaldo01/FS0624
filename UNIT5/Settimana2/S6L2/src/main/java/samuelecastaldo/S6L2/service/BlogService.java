package samuelecastaldo.S6L2.service;

import org.springframework.stereotype.Service;
import samuelecastaldo.S6L2.entities.Blog;
import samuelecastaldo.S6L2.exception.NotFoundException;
import samuelecastaldo.S6L2.payloads.NewBlogPayload;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogService {
    private List<Blog> blogList = new ArrayList<>();

    public List<Blog> findAll() {
        return this.blogList;
    }

    public Blog findById(int blogId) {
        Blog found = null;
        for (Blog blog : this.blogList) {
            if(blog.getId() == blogId) {
                found = blog;
            }
        }
        if(found == null) throw new NotFoundException(blogId);
        return found;
    }

    public Blog findByIdAndUpdate(int id, NewBlogPayload body) {
        Blog found = null;
        for(Blog blog : this.blogList) {
            if(blog.getId() == id) {
                found = blog;
                found.setCategoria(body.getCategoria());
                found.setContenuto(body.getContenuto());
                found.setTitolo(body.getTitolo());
                found.setTempoDiLettura(body.getTempoDiLettura());
            }
        }
        if (found == null) throw new NotFoundException(id);
        return found;
    }

    public Blog saveBlog(NewBlogPayload body) {
        Random rndm = new Random();
        Blog newblog = new Blog(body.getCategoria(), body.getTitolo(), body.getTempoDiLettura(), body.getContenuto());
        newblog.setId(rndm.nextInt(1, 10000));
        this.blogList.add(newblog);
        return newblog;
    }


}
