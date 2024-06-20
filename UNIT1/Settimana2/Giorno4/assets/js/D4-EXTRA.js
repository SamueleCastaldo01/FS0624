// Esercizi aggiuntivi (facoltativi) per D4

/* EXTRA 1
 Scrivi una funzione chiamata "checkArray" che riceve un array di numeri casuali (creati con la funzione "giveMeRandom") e per ogni elemento stampa in console
 se il suo valore è maggiore di 5 o no.
 La funzione deve inoltre ritornare la somma di tutti i valori maggiori di 5.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("Esercizio1-----------------")
function giveMeRandom(n) {
    let nR = 0
    const array = []   
    let i = 0

    while (i < n) {
       nR = Math.floor(Math.random() * 11);
       if(array.includes(nR)) {     //va a vedere se il numero casuale è presente nell' array. Se si non fa nulla, quindi rifà il ciclo

       } else {                  //non è stato trovato e quindi lo va add aggiungere
       array[i] = nR
       i++
        }
    }
    return array
}


function checkArray(array) {
    let somma = 0
    for(let i = 0; i < array.length; i++) {
        if(array[i] > 5) {
            console.log(array[i] + " il suo valore è maggiore di 5")
            somma += array[i]
        } else {
            console.log(array[i] + " Il suo valore non è maggiore di 5")
        }
    } 
    return somma;
}

let array = giveMeRandom(3)
console.log("La somma totale dei numeri maggiori di 5 è " + checkArray(array))

/* EXTRA 2
 Nel tuo eCommerce disponi di un'array di oggetti chiamato "shoppingCart". Ognuno di questi oggetti ha le seguenti proprietà: "price", "name", "id" e "quantity".
 Crea una funzione chiamata "shoppingCartTotal" che calcola il totale dovuto al negozio (tenendo conto delle quantità di ogni oggetto).
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio2-----------------")
const shoppingCart = [
    { id: 1, name: "Prodotto A", price: 10.99, quantity: 2 },
    { id: 2, name: "Prodotto B", price: 5.99, quantity: 1 },
    { id: 3, name: "Prodotto C", price: 32.50, quantity: 3 },
    { id: 4, name: "Prodotto D", price: 15.75, quantity: 1 }
];

function shoppingCartTotal() {
    let total = 0

    for(i=0; i < shoppingCart.length; i++) {
        total = total + (shoppingCart[i].price * shoppingCart[i].quantity) 
    }
    return total
}
console.log(shoppingCartTotal())


/* EXTRA 3
 Nel tuo eCommerce disponi di un'array di oggetti chiamato "shoppingCart". Ognuno di questi oggetti ha le seguenti proprietà: "price", "name", "id" e "quantity".
 Crea una funzione chiamata "addToShoppingCart" che riceve un nuovo oggetto dello stesso tipo, lo aggiunge a "shoppingCart" e ritorna il nuovo numero totale degli elementi.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio3-----------------")

function addToShoppingCart(product) {
    shoppingCart.push(product);

    return shoppingCart.length;
}

let nuovoProdotto = { id: 4, name: "Prodotto E", price: 12.75, quantity: 1 };
console.log(addToShoppingCart(nuovoProdotto))

/* EXTRA 4
 Nel tuo eCommerce disponi di un'array di oggetti chiamato "shoppingCart". Ognuno di questi oggetti ha le seguenti proprietà: "price", "name", "id" e "quantity".
 Crea una funzione chiamata "maxShoppingCart" che riceve l'array "shoppingCart" e ritorna l'oggetto più costoso in esso contenuto.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio4-----------------")

function maxShoppingCart(shoppingCart) {
    let max = 0
    for(let i=0; i < shoppingCart.length; i++) {

        if(max < shoppingCart[i].price) {
            max = shoppingCart[i].price
        } else {

        }
    }
    return max
}
console.log(maxShoppingCart(shoppingCart))

/* EXTRA 5
 Nel tuo eCommerce disponi di un'array di oggetti chiamato "shoppingCart". Ognuno di questi oggetti ha le seguenti proprietà: "price", "name", "id" e "quantity".
 Crea una funzione chiamata "latestShoppingCart" che riceve l'array "shoppingCart" e ritorna l'ultimo elemento.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio5-----------------")

function latestShoppingCart(shoppingCart){
    return shoppingCart[shoppingCart.length - 1]
}
console.log(latestShoppingCart(shoppingCart))

/* EXTRA 6
 Crea una funzione chiamata "loopUntil" che riceve un numero intero come parametro con valore tra 0 e 9.
 La funzione è composta da un ciclo che stampa un numero casuale tra 0 e 9 finchè il numero casuale non è maggiore di x per tre volte di fila.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio6-----------------")



/* EXTRA 7
Crea una funzione chiamata "average" che riceve un array come parametro e ne ritorna la media aritmetica. La funzione salta automaticamente i valori non numerici nell'array.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio7-----------------")

function average(array) {
    let somma = 0
    let n = 0

    for(let i = 0; i < array.length; i++) {
        if(typeof array[i] === "number") {
            somma += array[i];
            n++                       //aggiorna il contatore per dividere
        }
    }
    return somma / n
}
let arr = [4, "bho", 2, 4, 5, 2, 56, "ciao"]
console.log(average(arr))

/* EXTRA 8
 Crea una funzione chiamata "longest" che trova la stringa più lunga all'interno di un array di stringhe fornito come parametro.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio8-----------------")

function longest(array) {
    let max = 0
    let stringa = "";
    for(let i = 0; i < array.length; i++) {
        if(array[i].length > max) {
            max = array[i].length
            stringa = array[i]
        }
    }
    return stringa
}
let arre = ["si esatto", "bho", "come stai bro", "ciao"]
console.log(longest(arre))

/* EXTRA 9
 Crea una funzione per creare un filtro anti-spam per la tua casella email. La funzione riceve un parametro stringa chiamato "emailContent", e torna un valore booleano.
 La funzione deve ritornare true se "emailContent" non contiene le parole "SPAM" o "SCAM".
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio9-----------------")

function filtroAntiSpam(emailContent) {
    // Convertiamo il contenuto dell'email a maiuscolo per rendere il controllo case-insensitive
    let contenutoUpperCase = emailContent.toUpperCase();

    if (contenutoUpperCase.includes("SPAM") || contenutoUpperCase.includes("SCAM")) {  //controllo
        return false;
    } else {
        return true;
    }
}

let email1 = "Questa è una email importante senza spam.";
console.log(filtroAntiSpam(email1));


/* EXTRA 10
 Scrivi una funzione che riceve una data come parametro, e calcola il numero di giorni passati da quella data.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio10-----------------")
function giorniPassati(dataIniziale) {
    let dataOggi = new Date();   //prendiamo la data odierna

    let differenzaMillisecondi = dataOggi - dataIniziale;  //differenza in millisecondi
    
    let differenzaGiorni = differenzaMillisecondi / (1000 * 60 * 60 * 24);  //conversione in giorni
    
    return Math.floor(differenzaGiorni);
}

let data = new Date("2023-01-01");
let giorniTrascorsi = giorniPassati(data);


/* EXTRA 11
 Scrivi una funzione chiamata "matrixGenerator" che riceve come parametri due numeri interi, "x" e "y".
 Il risultato deve essere una matrice di "x" volte "y", e i valori devono rispecchiare gli indici della posizione all'interno della matrice.
 Es.: x = 3, y = 2
 ["00","01","02"
 "10","11","12"]
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio11-----------------")

function matrixGenerator(y, x) {
    let matrice = [];


    for(let i = 0; i < x; i++) {
        let riga = [];                    //ogni volta completato una riga la va a ricreare vuota
        for(let j = 0; j < y; j++) {
            riga.push(i.toString() + j.toString());  //li trasformo in stringa e faccio la concatenazione
        }
        matrice.push(riga);    //inserisco la riga nella matrice
    }
    return matrice;          //ritorna la matrice
}

let matrice = matrixGenerator(4, 2);
console.log(matrice);
