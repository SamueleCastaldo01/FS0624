

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
    }
}

const form1 = document.getElementById("form1");

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

    // Visualizziamo l'oggetto Pet nella console
    console.log("Ecco il mio elemento:", pet);

});