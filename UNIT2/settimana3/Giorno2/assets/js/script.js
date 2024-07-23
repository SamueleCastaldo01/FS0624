const nome = document.getElementById("name");
const nomeValore = document.getElementById("nomeValore")

const contatore = document.getElementById("contatore")
let contValue = sessionStorage.getItem("contatore") || 0; //vado a predere il valore attuale, altrimenti inizia da 0

let nomeP = localStorage.getItem("nome") || "";  //controllo
nomeValore.innerText = nomeP;

console.log(localStorage.getItem("nome"))

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
    intervalId = setInterval(() => {
        contValue++;                 //aggiorna
        contatore.innerText = contValue;   //DOM
        sessionStorage.setItem("contatore", contValue);  //aggiorna lo storage
    }, 1000); // Aggiorna ogni secondo (1000 millisecondi)
}


// Avvia il contatore non appena la pagina è completamente caricata
window.onload = startCounter;