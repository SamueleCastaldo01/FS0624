

const form1 = document.getElementById('form1')
const input = document.getElementById('inp')
const list = document.getElementById('list')

//evento per inviare il form
form1.addEventListener('submit', (e) => {
    e.preventDefault();
    addTodo(input.value);    //va a richiamare la funzione di sotto
    input.value = '';
})


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