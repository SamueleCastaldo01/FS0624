package samuelecastaldo.s6l3.payloads;

import samuelecastaldo.s6l3.entities.Autore;

public class NewBlogPayload {
    private String categoria;
    private String titolo;
    private String contenuto;
    private int tempoDiLettura;
    private long autoreId;

    public NewBlogPayload(String categoria, String titolo, String contenuto, int tempoDiLettura, long autoreId) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
        this.autoreId = autoreId;
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

    public long getAutoreId() {
        return autoreId;
    }

    public void setAutoreId(long autoreId) {
        this.autoreId = autoreId;
    }

    @Override
    public String toString() {
        return "NewBlogPayload{" +
                "categoria='" + categoria + '\'' +
                ", titolo='" + titolo + '\'' +
                ", contenuto='" + contenuto + '\'' +
                ", tempoDiLettura=" + tempoDiLettura +
                '}';
    }
}
