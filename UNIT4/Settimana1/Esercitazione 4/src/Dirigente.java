public class Dirigente extends  DIpendente{
   private double bonusPercentuale;

    public Dirigente(String matricola, double stipendio, String dipartimento, double bonusPercentuale) {
        super(matricola, stipendio, dipartimento);
        this.bonusPercentuale = bonusPercentuale;
    }

    @Override
    public double calculateSalary() {
        return stipendio + (stipendio * bonusPercentuale * 100);
    }
}
