const form1 = document.getElementById('form1')
const input = document.getElementById('inp')
const list = document.getElementById('list')
const array = []

//evento per inviare il form
form1.addEventListener('submit', (e) => {
    e.preventDefault();
    addTodo(input.value);    //va a richiamare la funzione di sotto
    input.value = '';
})


//Funzioni tramite array
//viene richiamata fal form, si occupa di inserire l'input
function addTodo(todoText) {
    if(todoText === "") {
        return
    }
    array.push(todoText)

    renderList();   //qui va ad aggiornare la lista nell' l'html, viene richiamata ogni volta che deve essere aggiornata
}

//aggiorna la lista nel html
function renderList() {
    // Pulisce la lista
    list.innerHTML = '';

    // Ricrea gli elementi della lista
    for (let i = 0; i < array.length; i++) {
        const divTodo = document.createElement('div');
        divTodo.classList.add('todo-item');

        const textTodo = document.createElement('p');
        textTodo.textContent = array[i];

        textTodo.addEventListener("click", () => {
            if(textTodo.style.textDecoration === "line-through") {
                textTodo.style.textDecoration = 'none'
            } else {
                textTodo.style.textDecoration = "line-through"
            }
        })
            
        const deleteButton = document.createElement('button');
        deleteButton.classList.add('delete-button');
        deleteButton.innerHTML = '<i class="fas fa-trash-alt"></i>';
        deleteButton.onclick = function () {
            deleteTodo(i);
        };

        divTodo.appendChild(deleteButton);
        divTodo.appendChild(textTodo);
        list.appendChild(divTodo);
    }
}

//funzione per eliminare un elemento all'interno di un array
function deleteTodo(index) {
    array.splice(index, 1);
    renderList();
}



/* 
// Funzione per aggiungere un nuovo elemento alla todo list
function addTodo(todoText) {
    const todoItem = document.createElement('div'); //crea un div per ogni elemento
    todoItem.classList.add('todo-item');

    const todoTextElement = document.createElement('p');  //crea un paragrafo per ogni elemento
    todoTextElement.textContent = todoText;

    //evento per la sbarra del testo
    todoTextElement.addEventListener('click', () => {
        const isCompleted = todoTextElement.style.textDecoration === 'line-through'; //qui va a fare la verifica riporta true e false

        if (isCompleted) {    //faccio la verifica, se è già barrato allora deve passare a non barrato
            todoTextElement.style.textDecoration = '';
        } else {               //viceversa
            todoTextElement.style.textDecoration = 'line-through';
        }
    });
    
    
    const deleteButton = document.createElement('button');  //crea un bottone per ogni elemento
    deleteButton.classList.add('delete-button');
    deleteButton.innerHTML = '<i class="fas fa-trash-alt"></i>';

    //evento per cancellare il div, l'elemento
    deleteButton.addEventListener('click', () => {    //qui nel caso in cui viene premuto il bottone delete
        list.removeChild(todoItem);
    });

    todoItem.appendChild(deleteButton);      //aggiunge il bottone al div
    todoItem.appendChild(todoTextElement);   //aggiunge il paragrafo al div

    list.appendChild(todoItem);             //aggiunge il div appena creato al div list dell'html
}
    */


//idea per prendere tramite array.
//quello di creare un array. Ed ogni volta che viene chiamata la funzione per aggiungere deve prendere il valore dell'input e metterlo in questo array
//poi devo creare la funzione button delete dove va a prendere l'id indice dell'array per cancellare, e anche per mettere la linea
//bisogna mettere onclick del button con il suo indice nel button, per chiamare la funzione per elimnare quel'indice specifico
//dovrei fare un ciclo for oppure un foreach per prendere gli elementi del array e falli visualizzare all'interno del'html
//posso vedere anche il codie del prof per prendere spunto