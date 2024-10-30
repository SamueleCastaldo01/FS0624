package samuelecastaldo.s6l3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import samuelecastaldo.s6l3.entities.Autore;
import samuelecastaldo.s6l3.entities.Blog;
import samuelecastaldo.s6l3.exceptions.NotFoundException;
import samuelecastaldo.s6l3.payloads.NewBlogPayload;
import samuelecastaldo.s6l3.repositories.AutoreRepository;
import samuelecastaldo.s6l3.repositories.BlogRepository;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Autowired
    AutoreService autoreService;

    public Blog save(NewBlogPayload body) {
        Autore autore = this.autoreService.findById(body.getAutoreId());
        Blog newBlog = new Blog(body.getCategoria(), body.getTitolo(), body.getTempoDiLettura(), body.getContenuto(), autore);
        return this.blogRepository.save(newBlog);
    }

    public Page<Blog> findAll(int page, int size, String sortBy) {
        if (size > 100) size = 100; // Limitiamo la size max a 100 così da client non possono inserire numeri troppo grandi
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        // Pageable ci consente di configurare come devono essere paginati i risultati passando numero di pagina, numero elementi pagina e criterio di ordinamento
        return this.blogRepository.findAll(pageable);
    }

    /*
    public List<Blog> findAll() {
        return this.blogRepository.findAll();
    } */

    public Blog findById(long id) {
        return this.blogRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    public Blog findByIdAndUpdate(long id, NewBlogPayload body) {
        Blog found = this.findById(id);
        if(found == null) throw new IllegalArgumentException("Errore");
        found.setTitolo(body.getTitolo());
        found.setCategoria(body.getCategoria());
        found.setContenuto(body.getContenuto());
        found.setTempoDiLettura(body.getTempoDiLettura());
        return this.blogRepository.save(found);
    }

    public void findByIdAndDelete(long id) {
        Blog found = this.findById(id);
        this.blogRepository.delete(found);
    }
}
