import logo from './logo.svg';
import './App.css';
import ButtonComponent from './components/ButtonComponent';
import ImageComponent from './components/ImageComponent';

function App() {
  return (
    <div className="App">
      <div className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Ciao come stai
        </a>
        <ButtonComponent nameButton="Ciao"/>
        <ButtonComponent nameButton="è si"/>
        <ImageComponent src="cuore.png"  alt="foto"/>
      </div>

     
    </div>
  );
}

export default App;
