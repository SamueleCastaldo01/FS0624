package Esercizio3;

public class Main4 {
    public static void main(String[] args) {
        // Crea una nuova rubrica
        RubricaTelefonica rubrica = new RubricaTelefonica();

        // Inserisci alcuni contatti
        rubrica.inserisciContatto("Mario", "123456789");
        rubrica.inserisciContatto("Luca", "987654321");
        rubrica.inserisciContatto("Anna", "555123456");

        // Stampa la rubrica completa
        rubrica.StampaRubrica();
        System.out.println();

        // Trova il numero di telefono di Mario
        rubrica.trovaNumeroPerPersona("Mario");
        System.out.println();

        // Trova il numero di una persona non esistente
        rubrica.trovaNumeroPerPersona("Giulia");
        System.out.println();

        // Trova la persona che ha un determinato numero di telefono
        rubrica.trovaPersonaPerNumero("555123456");
        System.out.println();

        // Prova a cercare un numero che non esiste
        rubrica.trovaPersonaPerNumero("111111111");
        System.out.println();

        // Cancella il contatto di Luca
        rubrica.cancellaContatto("Luca");

        // Stampa la rubrica dopo aver cancellato Luca
        rubrica.StampaRubrica();

    }
}