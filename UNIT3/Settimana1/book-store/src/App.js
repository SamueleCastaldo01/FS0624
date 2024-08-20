import logo from './logo.svg';
import './App.css';
import { Mynav } from './components/MyNav';
import { Myfooter } from './components/Myfooter';
import { Welcome } from './components/Welcome';
import { AllTheBooks } from './components/AllTheBooks';
import fantaBook from './books/fantasy.json'; 

function App() {
  return (
    <div className="App">
      <Mynav />

      <Welcome />

      <div className='d-flex flex-wrap justify-content-between p-5'>
        {fantaBook.map((book) => {
          return (
            <AllTheBooks title={book.title} img={book.img} price={book.price}/>
          )
        })}
      </div>
     



      <Myfooter />
    </div>
  );
}

export default App;
