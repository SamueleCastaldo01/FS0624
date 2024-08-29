import { render, screen, fireEvent } from '@testing-library/react';
import App from './App';
import { BookList } from './components/BookList';
import scifiBook from './books/scifi.json'; 
import CommentArea from './components/CommentArea';


//Verifica che il componente Welcome venga montato correttamente.
test('welcome', () => {

  render(<App/>);
  
  const pWelcome = screen.getByTestId("welcome-message")

  expect(pWelcome).toBeInTheDocument();
})


//Verifica che vengano effettivamente renderizzate tante bootstrap cards quanti sono i libri nel file json utilizzato.
test('json', async() => {
  render(<BookList arrayBooks={scifiBook}/>)

  const cardImage = await screen.findAllByRole("img");

  expect(cardImage.length).toBe(scifiBook.length);
})


//Verifica che il componente CommentArea venga renderizzato correttamente.
test('commentArea', async() => {
  render(<BookList arrayBooks={scifiBook}/>)

  const cardImage = await screen.findAllByRole("img");
  fireEvent.click(cardImage[0]);
  const text = screen.getByLabelText(/commento/i)

  expect(text).toBeInTheDocument();
})


//Verifica, magari con più tests, che il filtraggio dei libri tramite navbar si comporti come previsto.



