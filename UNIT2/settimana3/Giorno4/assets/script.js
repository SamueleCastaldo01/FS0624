document.addEventListener('DOMContentLoaded', () => {
    const apiKey = 'xPRRlCvXicitrPjZiGnTp5NPsomUFHsm7ZqdANflgCeBqdLIDB2BKwbB';
    const loadImages = document.getElementById("loadImages");
    const loadSecondaryImages = document.getElementById("loadSecondaryImages");
    const rowCard = document.getElementById("rowCard");
    const inputSearch = document.getElementById("inputSearch")
    const buttonSearch = document.getElementById("buttonSearch")

    const url = 'https://api.pexels.com/v1/search?query=cars';
    const urlsecondary = 'https://api.pexels.com/v1/search?query=bike';


//********************************** */ Per il bottone primario
    function init() {
        fetch("https://api.pexels.com/v1/search?query=cats", {
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
                console.log(photo)
            });
        })
        .catch(error => {
            console.error('Error fetching photos:', error);
        });
    }
    init()


    //********************************** */ Per il bottone primario
    loadImages.addEventListener("click", () => {
        fetch(url, {
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
                console.log(photo)
            });
        })
        .catch(error => {
            console.error('Error fetching photos:', error);
        });
    });

    //********************************** Per il bottone secondario
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
    });



    //********************************** Evento per il punsate Hide
    rowCard.addEventListener("click", (event) => {
        if (event.target && event.target.classList.contains("buttonHide")) {  //un piccolo controllo
            const photoId = event.target.getAttribute('data-photo-id');  //vado a prendere l'id passatto come attributo
            const card = document.getElementById(photoId);
            card.style.display = 'none';   //infine cambio stile
        }
    });


        //********************************** search
    buttonSearch.addEventListener("click", () => {
        const valueInp = inputSearch.value
        console.log(valueInp)
        const urlciao = 'https://api.pexels.com/v1/search?query=' +valueInp
        fetch(urlciao, {
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
                console.log(photo)
            });
        })
        .catch(error => {
            console.error('Error fetching photos:', error);
        });
    })




    function createCard(photo) {
        return `
            <div class="col-md-4" id="${photo.id}">
              <div class="card mb-4 shadow-sm">
                <a href="./details.html?eventId=${photo.id}&eventImg=${photo.src.landscape}&name=${photo.photographer}&nameUrl=${photo.photographer_url}">
                    <img
                    src="${photo.src.landscape}"
                    class="bd-placeholder-img card-img-top"
                    />
                </a>
                <div class="card-body">
                  <a href="${photo.url}">
                    <h5 class="card-title">${photo.photographer}</h5>
                  </a>
                  <p class="card-text">
                    ${photo.alt}
                  </p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                      <button type="button" class="btn btn-sm btn-outline-secondary buttonHide" data-photo-id="${photo.id}">Hide</button>
                    </div>
                    <small class="text-muted">${photo.id}</small>
                  </div>
                </div>
              </div>
            </div>
        `;
    }
});