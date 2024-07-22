

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