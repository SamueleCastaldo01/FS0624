package samuelecastaldo.s6l3.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(long id) {super("Il record con id: " + " non è stato trovato");}
}
