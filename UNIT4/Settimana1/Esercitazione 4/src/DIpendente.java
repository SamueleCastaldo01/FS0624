public abstract class DIpendente implements Checkable {
    protected String matricola;
    protected double stipendio;
    protected String dipartimento;

    private static final String[] DIPARTIMENTI_VALIDI = {"PRODUZIONE", "AMMINISTRAZIONE", "VENDITE"};

    public DIpendente(String matricola, double stipendio, String dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        if (isDipartimentoValido(dipartimento)) {
            this.dipartimento = dipartimento;
        } else {
            throw new IllegalArgumentException("Dipartimento non valido: " + dipartimento);
        }
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    //questo è un metodo per fare il controllo
    private boolean isDipartimentoValido(String dipartimento) {
        for (String dip : DIPARTIMENTI_VALIDI) {
            if (dip.equals(dipartimento)) {
                return true;
            }
        }
        return false;
    }

    //set per il dipartimento
    public void setDipartimento(String nuovoDipartimento) {
        if (isDipartimentoValido(nuovoDipartimento)) {
            this.dipartimento = nuovoDipartimento;
        } else {
            throw new IllegalArgumentException("Dipartimento non valido: " + nuovoDipartimento);
        }
    }

    //Deve essere implementato per forza dalle altri classi
    public abstract double calculateSalary();

    public void checkIn() {
        System.out.println("Il dipendente con matricola " + matricola + " ha iniziato il turno.");
    }

}
