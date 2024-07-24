const divCard = document.getElementById("divCard");
const listaCarello = document.getElementById("listaCarello")
let carello = [];

function loadCarello() {  //recupera l'array dall'local storage
    const savedCarello = localStorage.getItem('carello');
    if (savedCarello) {
        carello = JSON.parse(savedCarello);
    }
    renderCarello()
}

// Chiama loadCarello all'inizio della tua applicazione
loadCarello();

const getBooks = function () {
    fetch('https://striveschool-api.herokuapp.com/books')
        .then((response) => {
            console.log(response);
            if (response.ok) {
                return response.json();
            } else {
                throw new Error('Qualcosa è andato storto nella chiamata di rete');
            }
        })
        .then((books) => {
            console.log(books);
            divCard.innerHTML = "";
            books.forEach((book, index) => {
                const cardHTML = `
                    <div id="book${index}" class="col-4 d-flex justify-content-center">
                        <div class="card mt-4" style="width: 18rem;">
                            <img src="${book.img}" class="card-img-top img-fluid imgCard" alt="${book.title}">
                            <div class="card-body">
                              <h5 class="card-title">${book.title}</h5>
                              <p class="card-text">$${book.price || 'No description available'}</p>
                              <p class="card-text">${book.category || 'No description available'}</p>
                              <a href="#" class="btn btn-success add-to-cart" data-title="${book.title}" data-price="${book.price}" data-category="${book.category}">Aggiungi al Carello</a>
                              <a href="#" class="btn btn-danger delete-card" data-index="${index}">Elimina</a>
                              <a href="#" class="btn btn-danger delete-carello" data-title="${book.title}">Remove Carello</a>
                            </div>
                        </div>
                    </div>
                `;
                divCard.innerHTML += cardHTML;
            });
        })
        .catch((err) => {
            console.log('ERRORE!', err);
        });
};

getBooks();


function deleteCard(index) {
    const id = `book${index}`;
    const idCard = document.getElementById(id);
        idCard.remove();

}

function addCarello(title, price, category) {
    // Crea un oggetto libro
    const book = {
        title: title,
        price: price,
        category: category
    };
    carello.push(book);
    renderCarello()
    localStorage.setItem('carello', JSON.stringify(carello));
}


function deleteCarello (title) {
    carello.forEach((book, index) => {
        if(book.title === title) {
            carello.splice(index, 1)
            renderCarello()
            localStorage.setItem('carello', JSON.stringify(carello));
            return
        }
    })
}



// Aggiungi gestori di eventi
document.addEventListener('click', function(event) {
    if (event.target.matches('.add-to-cart')) {
        event.preventDefault();
        const title = event.target.getAttribute('data-title');
        const price = event.target.getAttribute('data-price');
        const category = event.target.getAttribute('data-category');
        addCarello(title, price, category);
    }
    if (event.target.matches('.delete-card')) {
        event.preventDefault();
        const index = event.target.getAttribute('data-index');
        deleteCard(index);
    }
    if (event.target.matches('.delete-carello')) {
        event.preventDefault();
        const title = event.target.getAttribute('data-title');
        deleteCarello(title);
    }
});


function renderCarello() {
    let totale = 0;
    listaCarello.innerHTML = ""; // Pulisce il contenuto precedente del div

    if (carello.length === 0) {
        listaCarello.innerHTML = "<p>Il carrello è vuoto.</p>";
        return;
    }

    // Aggiungi intestazione e totale
    listaCarello.innerHTML = `
        <div class="position-sticky top-0 z-3 bg-light py-2">
            <h5>Carello</h5>
            <p class="text-black">Totale: <span id="totCarello">${totale.toFixed(2)}</span></p>
        </div>
    `;

    // Aggiungi elementi del carrello
    carello.forEach((book, index) => {
        totale += parseFloat(book.price);
        const carelloHTML = `
            <div class="card mt-4" style="width: 10rem;">
                <div class="card-body">
                  <h6 class="card-title">${book.title}</h6>
                  <p class="card-text">$${book.price}</p>
                  <p class="card-text">${book.category}</p>
                  <a href="#" class="btn btn-danger delete-carello" data-title="${book.title}">Remove Carello</a>
                </div>
            </div>
        `;
        listaCarello.innerHTML += carelloHTML;
    });

    // Aggiorna il totale
    document.getElementById('totCarello').textContent = totale.toFixed(2);
}
