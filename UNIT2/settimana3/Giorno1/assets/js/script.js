

const User = function (_firstName, _lastName, _age, _location) {
    this.firstName = _firstName
    this.lastName = _lastName
    this.age = _age
    this.location = _location
    this.confEta = function (otherUser) {
        if (this.age > otherUser.age) {
            console.log(this.firstName + " " + this.lastName + " è più vecchio di " + otherUser.firstName + " " + otherUser.lastName)
        } else {
            console.log( otherUser.firstName + " " + otherUser.lastName + " è più vecchio di " + this.firstName + " " + this.lastName )
        }
    }
}

const u1 = new User ("Samuele", "Castaldo", "23", "Napoli");
const u2 = new User ("Antonio", "Angelino", "21", "Napoli");
console.log(u1)
u1.confEta(u2)



//Secondo Esercizio
// Creare la classe Pet
class Pet {
    constructor(petName, ownerName, species, breed) {
        this.petName = petName;
        this.ownerName = ownerName;
        this.species = species;
        this.breed = breed;
        this.stessoPadrone = function () {
            let flag = false;
            arrayPet.forEach((pet) => {
                if(this.ownerName === pet.ownerName && this.petName !== pet.petName) {
                    flag = true
                    return
                } else {
                }
            })
            return flag;
        }
    }
}

const arrayPet = []

const form1 = document.getElementById("form1");
const lista = document.getElementById("lista")

form1.addEventListener('submit', function (e) {
    e.preventDefault();

    // Recuperiamo i dati
    const petNameInput = document.getElementById("petName");
    const ownerNameInput = document.getElementById("ownerName");
    const speciesInput = document.getElementById("species");
    const breedInput = document.getElementById("breed");

    // Recuperiamo i valori
    const petNameValue = petNameInput.value;
    const ownerNameValue = ownerNameInput.value;
    const speciesValue = speciesInput.value;
    const breedValue = breedInput.value;

    // Creiamo un oggetto Pet
    const pet = new Pet(petNameValue, ownerNameValue, speciesValue, breedValue);
    console.log(pet.stessoPadrone())
    arrayPet.push(pet)


    updatePetList()

    // Ripuliamo gli input
    petNameInput.value = "";
    ownerNameInput.value = "";
    speciesInput.value = "";
    breedInput.value = "";
});


function updatePetList() {
    lista.innerHTML = ''
    arrayPet.forEach((pet, index) => {
        const petDiv = document.createElement('div');
        petDiv.innerHTML = `
        <div class= "row">
        <div class = "col-3"><b>Nome</b></div>
        <div class = "col-3"><b>Nome Proprietario</b></div>
        <div class = "col-3"><b>Specie</b></div>
        <div class = "col-3"><b>razza</b></div>
        </div>
        <div class = "row">
            <div class= "col-3">
                <p>${pet.petName}</p>
            </div>
            <div class= "col-3">
                <p>${pet.ownerName}</p>
            </div>
            <div class= "col-3">
                <p>${pet.species}</p>
            </div>
            <div class= "col-3">
            <p>${pet.breed}</p>
            </div>
        </div>`;
        lista.appendChild(petDiv);
    })
}