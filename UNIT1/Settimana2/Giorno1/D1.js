/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/

/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
/*
number string e boolean, null undefined
number sono i numeri: possono essere sia positivi che negativi e decimali
string sono le parole le lettere
boolean assume sono due valori possibili true e false, molto usati come flag
null: valore nullo, messo a posta a valore nullo
undifined: valore non definito, ma verrà definito successivamente
*/


/* ESERCIZIO 2
 Crea una variable chiamata "myName" e assegna ad essa il tuo nome, sotto forma di stringa.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
 let myName = "Samuele"

/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(12 + 20)  // si lo so benissimo che bisogna mettere le varibili, ma sono PIGRO

/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
let x = 12

/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "myName" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
myName = "il tuo cognome"  //lol
const y = 10
// y= 1         //qui va in errore

/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(x - 4)

/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

/* SCRIVI QUI LA TUA RISPOSTA */
let name1 = "john";
let name2 = "John";
name1 == name2 ? console.log("sono uguali") : console.log("sono diversi")
name1.toLowerCase() == name2.toLowerCase() ? console.log("sono uguali") : console.log("sono diversi")  //sono entrami in minuscolo