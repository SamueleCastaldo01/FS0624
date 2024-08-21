import logo from './logo.svg';
import './App.css';
import { Mynav } from './components/MyNav';
import { Myfooter } from './components/Myfooter';
import { Welcome } from './components/Welcome';
import { SingleBook } from './components/singleBook';
import { BookList } from './components/BookList';
import fantaBook from './books/fantasy.json'; 
import historyBook from './books/history.json'; 
import horrorBook from './books/horror.json'; 
import romanceBook from './books/romance.json'; 
import scifiBook from './books/scifi.json'; 

function App() {
  return (
    <div className="App">
      <Mynav />

      <Welcome />

            <SingleBook title="ciao" 
            img="https://www.rainews.it/cropgd/806x453/dl/img/2022/05/29/1653823199609_amajesticoilpaintingofaraccoonqueen.jpg"
             price="10" asin="23423234"/>
 
        <BookList arrayBooks={scifiBook}/>



      <Myfooter />
    </div>
  );
}

export default App;
