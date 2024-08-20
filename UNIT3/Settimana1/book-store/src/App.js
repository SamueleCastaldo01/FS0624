import logo from './logo.svg';
import './App.css';
import { Mynav } from './components/MyNav';
import { Myfooter } from './components/Myfooter';
import { Welcome } from './components/Welcome';
import { AllTheBooks } from './components/AllTheBooks';

function App() {
  return (
    <div className="App">
      <Mynav />

      <Welcome />
      <AllTheBooks />

      <Myfooter />
    </div>
  );
}

export default App;
