package ECommerce;

public class Cliente {
    private long codiceCliente;
    private String nomeCognome;
    private String email;
    private String dataIscrizione;

    public Cliente(long codiceCliente, String nomeCognome, String email, String dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }


}
