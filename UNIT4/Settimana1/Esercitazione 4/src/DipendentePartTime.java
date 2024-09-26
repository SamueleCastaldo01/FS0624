public class DipendentePartTime extends  DIpendente{

    private int oreDiLavoro;
    private double tariffaOraria;

    public DipendentePartTime(String matricola, double stipendio, String dipartimento, int oreDiLavoro, double tariffaOraria) {
        super(matricola, stipendio, dipartimento);
        this.oreDiLavoro = oreDiLavoro;
        this.tariffaOraria = tariffaOraria;
    }

    @Override
    public double calculateSalary() {
        return oreDiLavoro * tariffaOraria;
    }
}
