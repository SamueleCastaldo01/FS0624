console.log("ciao")

//Il compilatore TS (perché è necessario? e come si usa?)
/*
TypeScript è un estensione di JS, aggiungendo a JS la tipizzazione
Il problema è che i browser non posso eseguire direttamente TS, hanno bisogno di JS
Quindi il compilatore mi permette di verificare che il mio codice sia scritto correttamente
e poi subito dopo andrà a creare un nuovo o aggiornare il file js, che sarebbe la conversione del file TS
Comando:
tsc nomefile.ts
*/
//----------------------------------------------
//La Type Inference
/*
consiste al compilatore di capire automaticamente il tipo di una variabile, funzione, proprietà dell'oggetto ...
*/
//----------------------------------------------
//Il tipo ‘any’
/*
Quando asegnamo una variabile di tipo any, permette alla variabile di poter cambiare il suo tipo
Proprio come avviene in JS
*/
//----------------------------------------------
//Il tipo Union
/*
serve per indicare che quella variabile può essere un determinato tipo
esempio: let valore: string | number;
valore può essere sia di tipo string che di tipo number
si usa tramite l'operatore |. Viene spesso usato anche per dichiarare gli array
*/
//----------------------------------------------
//Le Interfaces in TS
/*
Serve per tipizzare un oggetto. Quindi obblighiamo all'utente nel momento in cui va ad creare un oggetto
di usare quelle determinate proprietà rispettando il tipo
L'oggetto che è di tipo dell'interface che abbiamo creato precedentemente, deve rispettare la sua forma.
Su una qualsiasi proprietà dell'interface possiamo mettere anche il ?: per indicare che non è obbligatorio scriverla nell'oggetto
*/
//----------------------------------------------
//I generics
/*
ci permette di creare componenti riutilizzabili e tipizzati.
In questo modo possiamo creare funzioni classi interfacce o anche tipi, che funzionano con qualsiasi dato, mantenendo la sicurezza del dato
Possono creare funzioni che non sono legati a un tipo specifico, ma che possono essere utilizzati con diversi tipi.
In questo modo non dobbiamo duplcare il codice. 
*/



//appunti miei
/* 
E possibile tipizzare sia le variabili, ma anche i parametri delle funzioni, obbligando a dover inserire quel tipo di dato
per gli array posso mettere più tipi tra i loro elementi 
const array : (string | number) [] = ["", 10, 12, "Ciao"]

oggetti
*/

