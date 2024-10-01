package Esercizio3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private HashMap<String, String> rubrica;

    public RubricaTelefonica() {
        rubrica = new HashMap<>(); //vuota;
    }

    public void inserisciContatto(String nome, String telefono) {
        rubrica.put(nome, telefono);
    }

    public void cancellaContatto(String nome) {
        rubrica.remove(nome);
    }

    public void trovaPersonaPerNumero(String telefono) {
        for(Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                System.out.println("La persona con il numero " + telefono + " è: " + entry.getKey());
                return; // esce dal metodo se lo trova
            }
        }
        System.out.println("Numero non trovato nella rubrica.");
    }

    public void trovaNumeroPerPersona(String nome) {
        String numero = rubrica.get(nome);
        if(numero != null) {
            System.out.println(nome + " Trovato, ecco il suo numero: " + numero);
        } else {
            System.out.println("Non è stato trovato");
        }
    }

    public void StampaRubrica() {
        System.out.println("Ecco la tua rubrica: ");
        for(Map.Entry<String, String> entry : rubrica.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + " " + "numero: " + entry.getValue());
        }
    }

}
