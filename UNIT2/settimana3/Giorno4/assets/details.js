 // Recupera i parametri dalla query string
 const addressBarParameters = new URLSearchParams(location.search);
 const eventId = addressBarParameters.get('eventId');
 const eventImg = addressBarParameters.get('eventImg');
 const namePh = addressBarParameters.get('name');
 const nameUrl = addressBarParameters.get('nameUrl');
 const divDetails = document.getElementById('divDetails');

 // Crea il contenuto HTML da inserire nel divDetails
 const content = `
     <div class="col-md-6">
         <div class="card mb-4 shadow-sm">
             <img src="${eventImg}" class="card-img-top" alt="Image">
             <div class="card-body">
                 <h5 class="card-title">Photo ID: ${eventId}</h5>
                 <p class="card-text">Photographer: ${namePh}</p>
                 <a href="${nameUrl}" class="btn btn-primary">Visit Photographer's Page</a>
             </div>
         </div>
     </div>
 `;

 // Inserisci il contenuto nel divDetails
 divDetails.innerHTML = content;