/* ESERCIZIO 1
 Scrivi un algoritmo per trovare il più grande tra due numeri interi.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("esercizio 1--------------")
let n1 = 10
let n2 = 11

if(n1 > n2) {
  console.log(n1 + " è più grande di " + n2)
} else {
  console.log(n1 + " è più piccolo di " + n2)
}

/* ESERCIZIO 2
  Scrivi un algoritmo che mostri "not equal" in console se un numero intero fornito è diverso da 5.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("esercizio 2--------------")
let nN = 10
if (nN != 5) {
  console.log(nN + " not equal")
}

/* ESERCIZIO 3
  Scrivi un algoritmo che mostri "divisibile per 5" in console se un numero fornito è perfettamente divisibile per 5 (suggerimento: usa l'operatore modulo)
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("esercizio 3--------------")
let nN3 = 25

if (nN3 % 5 == 0) {
  console.log(nN3 + " è divisile per 5")
} else {
  console.log(nN3 + " non è divisibile per 5")
}

/* ESERCIZIO 4
  Scrivi un algoritmo per verificare che, dati due numeri interi, il valore di uno di essi sia 8 oppure se la loro addizione/sottrazione sia uguale a 8.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("esercizio 4--------------")
nN41 = 18
nN42 = 10

if((nN41 == 8 || nN42 == 8)  || (nN41 + nN42 == 8 || nN41 - nN42 == 8) ) {
  console.log("Sono entrato")
} else {
  console.log("non sono entrato")
}

/* ESERCIZIO 5
  Stai lavorando su un sito di e-commerce. Stai salvando il saldo totale del carrello dell'utente in una variabile "totalShoppingCart".
  C'è una promozione in corso: se il totale del carrello supera 50, l'utente ha diritto alla spedizione gratuita (altrimenti la spedizione ha un costo fisso pari a 10).
  Crea un algoritmo che determini l'ammontare totale che deve essere addebitato all'utente per il checkout.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("esercizio 5--------------")
let totalShoppingCart = 49

if( totalShoppingCart >= 50) {
  console.log("La spedizione è gratuita " + totalShoppingCart)
} else {
  totalShoppingCart += 10
  console.log("La spedizione costa 10 euro in più " + totalShoppingCart)
}

/* ESERCIZIO 6
  Stai lavorando su un sito di e-commerce. Oggi è il Black Friday e viene applicato il 20% su ogni prodotto.
  Modifica la risposta precedente includendo questa nuova promozione nell'algoritmo, determinando come prima se le spedizioni sono gratuite oppure no e e calcolando il totale.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("esercizio 6--------------")
totalShoppingCart = totalShoppingCart * 0.20   //qui esegue lo sconto
if( totalShoppingCart >= 50) {
  console.log("La spedizione è gratuita " + totalShoppingCart)
} else {
  totalShoppingCart += 10
  console.log("La spedizione costa 10 euro in più " + totalShoppingCart)
}

/* ESERCIZIO 7
  Crea tre variabili, e assegna un valore numerico a ciascuna di esse.
  Utilizzando un blocco condizionale, crea un algoritmo per ordinarle secondo il loro valore, dal più alto al più basso.
  Alla fine mostra il risultato in console.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("esercizio 7--------------")
let n71 = 23
let n72 = 45
let n73 = 25
let max
let min

if (n71 > n72) {
  max = n71
  min = n72
} else {
  max = n72
  min = n71
}

if(max > n73) {
  console.log(max)
  if(n73 > min) {
    console.log(n73)
    console.log(min)
  } else {
    console.log(min)
    console.log(n73)
  }
} else {
  console.log(n73)
  console.log(max)
  console.log(min)
}

/* ESERCIZIO 8
  Crea un algoritmo per verificare che un valore fornito sia un numero oppure no (suggerimento: cerca su un motore di ricerca "typeof").
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("esercizio 8--------------")
nN8 = 2

if(typeof nN8 === 'number') {
  console.log("è un numero")
} else {
  console.log("non è un numero")
}

/* ESERCIZIO 9
  Crea un algoritmo per controllare se un numero fornito sia pari o dispari (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("esercizio 9--------------")
nN9 = 10

if (nN9 %2 == 0) {
  console.log("è un numero pari")
} else {
  console.log("non è un numero pari")
}

/* ESERCIZIO 10
  Modifica la logica del seguente algoritmo in modo che mostri in console il messaggio corretto in ogni circostanza.
  let val = 7
  if (val < 10) {
      console.log("Meno di 10");
    } else if (val < 5) {
      console.log("Meno di 5");
    } else {
      console.log("Uguale a 10 o maggiore");
    }
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("esercizio 10--------------")   // non ho capito cosa chiede bene l'esercizio
let val = 4
if (val < 10 && val > 5) {
    console.log("Meno di 10");
  } else if (val < 5) {
    console.log("Meno di 5");
  } else {
    console.log("Uguale a 10 o maggiore");
  }


/* ESERCIZIO 11
  Fornito il seguente oggetto, scrivi del codice per aggiungere una proprietà "city", il cui valore sarà "Toronto".
*/

const me = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css'],
  city : 'Toronto'
}

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("esercizio 11--------------")
console.log(me)


/* ESERCIZIO 12
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere la proprietà "lastName".
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("esercizio 12--------------")
delete me.lastName
console.log(me)

/* ESERCIZIO 13
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere l'ultimo elemento della proprietà "skills".
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("esercizio 13--------------")
me.skills.pop()
console.log(me)

/* ESERCIZIO 14
  Scrivi del codice per creare un array inizialmente vuoto. Riempilo successivamente con i numeri da 1 a 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("esercizio 14--------------")
let array = []
array[0] = 1
array[1] = 2
array[2] = 3
array[3] = 4
array[4] = 5
array[5] = 6
array[6] = 7
array[7] = 8
array[8] = 9
array[9] = 10

console.log(array)

//Seconda soluzione
console.log("seconda soluzione-----------")
let array1 = []

for (let n=0; n<10; n++) {
  array1[n] = n +1;
}

console.log(array1)

/* ESERCIZIO 15
  Scrivi del codice per sostituire l'ultimo elemento dell'array, ovvero il valore 10, con il valore 100.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("esercizio 15--------------")
array1[array1.length - 1] = 100
console.log(array1) 