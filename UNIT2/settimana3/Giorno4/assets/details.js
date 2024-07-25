// Recupera i parametri dalla query string
const addressBarParameters = new URLSearchParams(location.search);
const eventId = addressBarParameters.get('eventId');
const eventImg = addressBarParameters.get('eventImg');
const namePh = addressBarParameters.get('name');
const nameUrl = addressBarParameters.get('nameUrl');
const avgColor = addressBarParameters.get('avgColor'); // Assicurati che il parametro esista

const divDetails = document.getElementById('divDetails');
const bdyElements = document.getElementsByClassName('bdy');
const avgColorDiv = document.getElementById('avgColor');

// Verifica se i parametri sono stati correttamente recuperati
console.log('eventId:', eventId);
console.log('eventImg:', eventImg);
console.log('namePh:', namePh);
console.log('nameUrl:', nameUrl);
console.log('avgColor:', avgColor);

// Crea il contenuto HTML da inserire nel divDetails
const content = `
    <div class="col-md-6">
        <div class="card mb-4 shadow-sm">
            <img src="${eventImg}" class="card-img-top" alt="Image">
            <div class="card-body">
                <p>Average Color: ${avgColor}</p>
                <h5 class="card-title">Photo ID: ${eventId}</h5>
                <p class="card-text">Photographer: ${namePh}</p>
                <a href="${nameUrl}" class="btn btn-primary">Visit Photographer's Page</a>
            </div>
        </div>
    </div>
`;

// Inserisci il contenuto nel divDetails
divDetails.innerHTML = content;

// Imposta il colore di sfondo se avgColor è definito
if (avgColor) {
    // Aggiungi il prefisso "#" se non è già presente
    const isValidColor = avgColor.startsWith('#') ? avgColor : `#${avgColor}`;
    
    // Verifica se il valore è un colore valido (opzionale)
    if (/^#[0-9A-Fa-f]{6}$/.test(isValidColor)) {
        // Applica il colore di sfondo a tutti gli elementi con la classe 'bdy'
        for (let i = 0; i < bdyElements.length; i++) {
            bdyElements[i].style.backgroundColor = isValidColor;
        }
        // Aggiorna il contenuto del div avgColorDiv
        avgColorDiv.innerHTML = `Average Color: ${isValidColor}`;
    } else {
        console.error('Invalid color value:', avgColor);
    }
}
