import logo from './logo.svg';
import './App.css';
import { Mynav } from './components/MyNav';
import { Myfooter } from './components/Myfooter';
import { Welcome } from './components/Welcome';
import { BookList } from './components/BookList';
import CommentArea from './components/CommentArea';
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
 
        <BookList arrayBooks={scifiBook}/>



      <Myfooter />
    </div>
  );
}

export default App;
