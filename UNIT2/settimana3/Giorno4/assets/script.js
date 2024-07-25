const apiKey = 'xPRRlCvXicitrPjZiGnTp5NPsomUFHsm7ZqdANflgCeBqdLIDB2BKwbB';
const loadImages = document.getElementById("loadImages")
const loadSecondaryImages = document.getElementById("loadSecondaryImages")
const rowCard = document.getElementById("rowCard")

// L'endpoint dell'API di Pexels per ottenere le foto curate
const url = 'https://api.pexels.com/v1/search?query=cars';
const urlsecondary = 'https://api.pexels.com/v1/search?query=bike'


//per il bottone primario
loadImages.addEventListener("click", () => {
fetch(url, {
    headers: {
        'Authorization': apiKey
    }
})
.then(response => response.json())
.then(data => {
    // Processa i dati ricevuti
    const photos = data.photos;
    rowCard.innerHTML = '';
    
    photos.forEach(photo => {
        rowCard.innerHTML += createCard(photo);
    });
})
.catch(error => {
    console.error('Error fetching photos:', error);
});

})

// per il bottone secondario
loadSecondaryImages.addEventListener("click", () => {
    fetch(urlsecondary, {
        headers: {
            'Authorization': apiKey
        }
    })
    .then(response => response.json())
    .then(data => {
        const photos = data.photos;
        rowCard.innerHTML = '';
        
        photos.forEach(photo => {
            rowCard.innerHTML += createCard(photo);
        });
    })
    .catch(error => {
        console.error('Error fetching photos:', error);
    });
})



function createCard(photo) {
    return `
        <div class="col-md-4">
          <div class="card mb-4 shadow-sm">
            <img
              src="${photo.src.landscape}"
              class="bd-placeholder-img card-img-top"
            />
            <div class="card-body">
              <h5 class="card-title">${photo.photographer}</h5>
              <p class="card-text">
                ${photo.alt}
              </p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                  <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                </div>
                <small class="text-muted">9 mins</small>
              </div>
            </div>
          </div>
        </div>
    `;
}