const nome = document.getElementById("name");  //input
const nomeValore = document.getElementById("nomeValore")  //p nome 
const contatore = document.getElementById("contatore")  //p contatore

let contValue = sessionStorage.getItem("contatore") || 0; //vado a predere il valore attuale, altrimenti inizia da 0
let nomeP = localStorage.getItem("nome") || "";  //controllo


function saveButton() {
    const nameValue = nome.value; //va a prendere il valore
    localStorage.setItem("nome", nameValue)   //lo salva localmente
    nomeValore.innerText = nameValue;
    nome.value = ""
}

function deleteButton() {
    localStorage.setItem("nome", ""); //andiamo a metterlo vuoto
    nomeValore.innerText = ""
}


//contatore
function startCounter() {
    nomeValore.innerText = nomeP; //p nome dell'input
    contatore.innerText = contValue; // p contatore

    intervalId = setInterval(() => {
        contValue++;                 //aggiorna
        contatore.innerText = contValue;   //DOM
        sessionStorage.setItem("contatore", contValue);  //aggiorna lo storage
    }, 1000); // Aggiorna ogni secondo (1000 millisecondi)
}


// Avvia il contatore non appena la pagina è completamente caricata
window.onload = startCounter;
