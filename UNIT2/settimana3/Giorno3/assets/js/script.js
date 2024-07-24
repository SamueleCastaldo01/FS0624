const divCard = document.getElementById("divCard")

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
        divCard.innerHTML = ""
          books.forEach((book) => {
            const cardHTML = `
            <div class="col-4 d-flex justify-content-center">
                <div class="card mt-4" style="width: 18rem;">
                    <img src="${book.img}" class="card-img-top img-fluid imgCard" alt="${book.title}">
                    <div class="card-body">
                      <h5 class="card-title">${book.price}</h5>
                      <p class="card-text">${book.category || 'No description available'}</p>
                      <a href="#" class="btn btn-primary">Go somewhere</a>
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
}

getBooks();