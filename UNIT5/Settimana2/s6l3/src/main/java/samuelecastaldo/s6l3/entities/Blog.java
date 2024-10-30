package samuelecastaldo.s6l3.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue
    private long id;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    @Column(name = "tempo_di_lettura")
    private int tempoDiLettura;
    @ManyToOne
    @JoinColumn(name = "autore_id")
    private Autore autore;

    public Blog() {}

    public Blog(String categoria, String titolo, int tempoDiLettura, String contenuto, Autore autore) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.tempoDiLettura = tempoDiLettura;
        this.contenuto = contenuto;
        this.cover = "hhtps://picsum.photos/200/300";
        this.autore = autore;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public int getTempoDiLettura() {
        return tempoDiLettura;
    }

    public void setTempoDiLettura(int tempoDiLettura) {
        this.tempoDiLettura = tempoDiLettura;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", categoria='" + categoria + '\'' +
                ", titolo='" + titolo + '\'' +
                ", cover='" + cover + '\'' +
                ", contenuto='" + contenuto + '\'' +
                ", tempoDiLettura=" + tempoDiLettura +
                ", autore=" + autore +
                '}';
    }
}
