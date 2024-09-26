public class DipendenteFullTime extends DIpendente {

    public DipendenteFullTime(String matricola, double stipendio, String dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return stipendio;  //stipendio fisso mensile
    }

}
