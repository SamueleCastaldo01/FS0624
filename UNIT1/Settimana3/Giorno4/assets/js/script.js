const tombola = [
    { id: 1, flag: false, nome: "L'Italia" },
    { id: 2, flag: false, nome: "A Mamma" },
    { id: 3, flag: false, nome: "A Gatta" },
    { id: 4, flag: false, nome: "O Puorc" },
    { id: 5, flag: false, nome: "A Mano" },
    { id: 6, flag: false, nome: "Chella Ca Guarda 'Nterra" },
    { id: 7, flag: false, nome: "O Vase" },
    { id: 8, flag: false, nome: "A Maronna" },
    { id: 9, flag: false, nome: "A Figliata" },
    { id: 10, flag: false, nome: "E Fasule" },
    { id: 11, flag: false, nome: "E Suricille" },
    { id: 12, flag: false, nome: "E Surdate" },
    { id: 13, flag: false, nome: "Sant'Antonio" },
    { id: 14, flag: false, nome: "O 'Mbriaco" },
    { id: 15, flag: false, nome: "'O Guaglione" },
    { id: 16, flag: false, nome: "O Culo" },
    { id: 17, flag: false, nome: "'A Disgrazzia" },
    { id: 18, flag: false, nome: "'O Sanghe" },
    { id: 19, flag: false, nome: "'A Resata" },
    { id: 20, flag: false, nome: "'A Festa" },
    { id: 21, flag: false, nome: "'A Femmena Annurata" },
    { id: 22, flag: false, nome: "'O Pazzo" },
    { id: 23, flag: false, nome: "'O Scemo" },
    { id: 24, flag: false, nome: "'E Guardie" },
    { id: 25, flag: false, nome: "Natale" },
    { id: 26, flag: false, nome: "Nanninella" },
    { id: 27, flag: false, nome: "'O Cantero" },
    { id: 28, flag: false, nome: "'E Zzizze" },
    { id: 29, flag: false, nome: "'O Pate D'e Criature" },
    { id: 30, flag: false, nome: "'E Palle D'o Tenente" },
    { id: 31, flag: false, nome: "'O Padrone 'e Casa" },
    { id: 32, flag: false, nome: "'O Capitone" },
    { id: 33, flag: false, nome: "L'Anne 'e Cristo" },
    { id: 34, flag: false, nome: "'A Capa" },
    { id: 35, flag: false, nome: "L'Aucelluzziello" },
    { id: 36, flag: false, nome: "Le Castele" },
    { id: 37, flag: false, nome: "'O Monaco" },
    { id: 38, flag: false, nome: "'E Mmazzate" },
    { id: 39, flag: false, nome: "'A Funa Nganna" },
    { id: 40, flag: false, nome: "'A Paposcia" },
    { id: 41, flag: false, nome: "'O Curtiello" },
    { id: 42, flag: false, nome: "'O Caffè" },
    { id: 43, flag: false, nome: "'O Scartellato" },
    { id: 44, flag: false, nome: "'E Ccancelle" },
    { id: 45, flag: false, nome: "'O Vino Bbuono" },
    { id: 46, flag: false, nome: "'E Dennare" },
    { id: 47, flag: false, nome: "'O Muorto" },
    { id: 48, flag: false, nome: "'O Muorto Che Pparla" },
    { id: 49, flag: false, nome: "'O Piezz'e Carne" },
    { id: 50, flag: false, nome: "'O Pane" },
    { id: 51, flag: false, nome: "'O Ciardino" },
    { id: 52, flag: false, nome: "'A Mamma" },
    { id: 53, flag: false, nome: "'O Viecchio" },
    { id: 54, flag: false, nome: "'O Cappiello" },
    { id: 55, flag: false, nome: "'A Musica" },
    { id: 56, flag: false, nome: "'A Caruta" },
    { id: 57, flag: false, nome: "'O Scartellato" },
    { id: 58, flag: false, nome: "'O Paccotto" },
    { id: 59, flag: false, nome: "'E Pile" },
    { id: 60, flag: false, nome: "'O Lamento" },
    { id: 61, flag: false, nome: "'O Cacciatore" },
    { id: 62, flag: false, nome: "'O Muorto Acciso" },
    { id: 63, flag: false, nome: "'A Sposa" },
    { id: 64, flag: false, nome: "'A Sciamma" },
    { id: 65, flag: false, nome: "'O Chianto" },
    { id: 66, flag: false, nome: "'E Ddoie Zetelle" },
    { id: 67, flag: false, nome: "'O Totaro" },
    { id: 68, flag: false, nome: "'A Zuppa Cotta" },
    { id: 69, flag: false, nome: "Sott'e 'Ncopp" },
    { id: 70, flag: false, nome: "'O Palomm" },
    { id: 71, flag: false, nome: "L'Omm'e Merda" },
    { id: 72, flag: false, nome: "'A Maraviglia" },
    { id: 73, flag: false, nome: "'O Spitale" },
    { id: 74, flag: false, nome: "'A Grotta" },
    { id: 75, flag: false, nome: "Pulecenella" },
    { id: 76, flag: false, nome: "'A Funtana" },
    { id: 77, flag: false, nome: "'E Riavulille" },
    { id: 78, flag: false, nome: "'A Bella Figliola" },
    { id: 79, flag: false, nome: "'O Mariuolo" },
    { id: 80, flag: false, nome: "'A Vocca" },
    { id: 81, flag: false, nome: "'E Sciure" },
    { id: 82, flag: false, nome: "'A Tavula 'Mbriaca" },
    { id: 83, flag: false, nome: "'O Maletiempo" },
    { id: 84, flag: false, nome: "'E Rrobbe Rubbate" },
    { id: 85, flag: false, nome: "L'Aneme D'o Priatorio" },
    { id: 86, flag: false, nome: "'A Puteca" },
    { id: 87, flag: false, nome: "'E Perucchie" },
    { id: 88, flag: false, nome: "'E Casecavalle" },
    { id: 89, flag: false, nome: "'A Vecchia" },
    { id: 90, flag: false, nome: "'A Paura" }
];

//variabili per il tombolone
const divTombolone = document.getElementById('divTombolone')
const randNumber = document.getElementById('randNumber')   //paragrafo
const randGenerate = document.getElementById('randGenerate')  //bottone
let numeroCasuale

//variabili per creare le cartelle
const divCartelle = document.getElementById('divCartelle')
const nCartelle = document.getElementById("nCartelle")  //input
const genCartelle = document.getElementById("genCartelle")  //bottone
let gCartelle = []   //mi serve per le cartelle, array di array di array di oggetti


showerTabbelone()

//generate numero casuale***************************************************************
function generaNumeroCasuale() {
    let index = 0

    if (tombola.every(obj => obj.flag === true)) {   //controllo per non fare andare in loop infinto il while
        console.log("il tombolone è stato riempito")
        return;   //controlla se tutti i flag sono true
    }

    do {
        numeroCasuale = Math.floor(Math.random() * 90) + 1;
        index = tombola.findIndex(obj => obj.id === numeroCasuale);  //vado a trovare l'indice

    } while (tombola[index].flag === true)   //fa il ciclo per trovare sempre un numero diverso


    tombola[index].flag = true                       //trasforma l'indice in vero

    //verifica del colore delle cartelle trasforma il flag in true per poi applicarci il colore
    for (let i = 0; i < gCartelle.length; i++) {
        for (let j = 0; j < gCartelle[i].length; j++) {
            if (gCartelle[i][j].id == numeroCasuale) {  //va a trovare l'indice per mettere il flag a true
                gCartelle[i][j].flag = true
                console.log(gCartelle[i][j].id)
            }
        }
    }

    randNumber.innerText = numeroCasuale;

    showerTabbelone()
    showerCartelle()
    console.log(gCartelle)
}

randGenerate.addEventListener('click', generaNumeroCasuale)


//******************************************************************************************************+ */
// Funzione per generare le cartelle, prende input il numero delle cartelle
function generaCartelle(numCartelle) {

    gCartelle = []

    //una cosa da aggiungere e che i numeri casuali all'interno non si devono ripetere per ogni cartella

    for (let i = 0; i < numCartelle; i++) {
        gCartelle.push([]);
        // Generazione caselle della cartella (esempio con 15 caselle per cartella)
        for (let j = 0; j < 15; j++) {
            let numeroCasuale = Math.floor(Math.random() * 90) + 1;
            gCartelle[i].push({ id: numeroCasuale, flag: false });
        }
        console.log(gCartelle)
    }
    showerCartelle()
}


//evento del form per generare le cartelle
genCartelle.addEventListener('click', function (event) { //si attiva dal form
    event.preventDefault();

    const numCartelle = parseInt(nCartelle.value);

    if (isNaN(numCartelle) || numCartelle <= 0) {  //controllo
        alert("Inserisci un numero valido di cartelle.");
        return;
    }

    generaCartelle(numCartelle);
});

//********************************************************************************************* */
//******************************************************************************************** */
function showerTabbelone() {
    divTombolone.innerHTML = '';

    //costruzione del tabellone
    for (let i = 0; i < tombola.length; i++) {
        const divNum = document.createElement('div')
        divNum.classList.add('divNum');
        const pNum = document.createElement('h4')
        const nameNum = document.createElement('p')

        pNum.textContent = tombola[i].id
        nameNum.textContent = tombola[i].nome

        if (tombola[i].flag == true) {
            divNum.style.borderColor = "#CB2376"
            pNum.style.color = '#CB2376'
            nameNum.style.color = '#CB2376'
        }

        divNum.appendChild(pNum);
        divNum.appendChild(nameNum);
        divTombolone.appendChild(divNum);
    }
}


//Mostra il tabbelone************************************************ */
function showerCartelle() {
    divCartelle.innerHTML = '';

    const cartel = [];

    for (let i = 0; i < gCartelle.length; i++) {
        const divCartella = document.createElement('div');
        divCartella.classList.add('cartella'); 

        const divNumeri = document.createElement('div'); // Div per contenere tutti i divNum
        divNumeri.classList.add('divNumeriCart'); // Classe per stile CSS

        for (let j = 0; j < gCartelle[i].length; j++) {
            const divNum = document.createElement('div')
            divNum.classList.add('divNumCart');
            const pNum = document.createElement('h4')

            pNum.textContent = gCartelle[i][j].id

            if (gCartelle[i][j].flag == true) {    //verifica il colore
                divNum.style.borderColor = "#CB2376"
                pNum.style.color = '#CB2376'
            }

            divNum.appendChild(pNum);
            divNumeri.appendChild(divNum);
        }
        divCartella.appendChild(divNumeri); // Aggiungi divNumeri alla cartella
        divCartelle.appendChild(divCartella); // Aggiungi la cartella al divCartelle
    }
}



