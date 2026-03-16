import Address from './Address';
import './App.css';
import Products from './Products';

function App() {
  return (
    <div className="cls1">

      <h1 >WELCOME FRIENDS</h1>
      
      <Products city="Delhi" >

          <Address></Address>
          <h1>Hello world</h1>

      </Products>

    </div>
  );
}

export default App;
