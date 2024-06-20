/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log("Esercizio1-------------------")
function area(l1, l2) {
    return l1 * l2;
}
console.log(area(10, 20))

/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare
 la loro somma moltiplicata per tre.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio2-------------------")
function crazySum(n1, n2) {
    if(n1 === n2) {
        return (n1 + n2) *3;
    } else {
        return n1 +n2
    }
}

console.log(crazySum(10, 10))

/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia maggiore di 19.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio3-------------------")
function crazyDiff(n1) {
    if(n1 > 19) {
        console.log(Math.abs(n1 -19))
        return Math.abs(n1 -19) * 3
    } else {
        return Math.abs(n1 -19)
    }
}

console.log(crazyDiff(22))
//qui dato che mi servivano due return e non si possono usare, dovevo creare una variabile globale e usarla all'interno della funzione


/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro, e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio4-------------------")
function boundary(n1) {
    if((n1 >= 20 && n1<= 100) || n1 === 400) {
        return true
    } else {
        return false
    }
}

console.log(boundary(23))


/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio5-------------------")
function epify(s) {
    if (s.startsWith("EPICODE")) {
        return s;
    } else {
        return "EPICODE " + s;
    }
}

console.log(epify("EPICODE Ciao come stai"))

/* ESERCIZIO 6
 Scrivi una funzione di nome "check3and7" che accetta un numero positivo come parametro. La funzione deve controllare che il parametro sia un multiplo
 di 3 o di 7. (Suggerimento: usa l'operatore modulo)
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio6-------------------")
function check3and7(n1) {
    if(n1 % 3 == 0 || n1 % 7 == 0) {
        return true
    } else {
        return false
    }
}

console.log(check3and7(7))

/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio7-------------------")
function reverseString(s) {
    return s.split('').reverse().join('');     // prima divide tutte le lettere tramite split, poi reverse metodo di un array, e infine join per unire i caratteri
}

console.log(reverseString("EPICODE"))

/* ESERCIZIO 8
 Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa formata da diverse parole.
 La funzione deve rendere maiuscola la prima lettera di ogni parola contenuta nella stringa.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio8-------------------")
function upperFirst(s) {
    return s.replace(/\b\w/g, c => c.toUpperCase());   //va all'inizio di ogni parola con carattere alfabetico
}
               //questo metodo non va bene devo, fare lo split e tutto il resto
console.log(upperFirst("Ciao a tutti, felice di essere ancora vivo"))

/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro una stringa. La funzione deve creare una nuova stringa senza il primo e l'ultimo carattere
 della stringa originale.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio9-------------------")
function cutString(s) {
    return s.substring(1, s.length -1)
}

console.log(cutString("EPICODE"));

/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come parametro un numero n e ritorna un'array contenente n numeri casuali inclusi tra 0 e 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log(" ")
console.log("Esercizio10-------------------")
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
console.log(giveMeRandom(5));
