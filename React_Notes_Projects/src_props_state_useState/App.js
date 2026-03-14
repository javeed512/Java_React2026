
import './App.css';
import { Counter } from './Counter';
import { Student } from './Student';


function App(props) {

     


  return (
    <div className="cls1">

      <h1 >WELCOME FRIENDS</h1>
      <h2>  { props.name} </h2>
      
      <Student  fee={500}></Student>

      <Counter></Counter>

    </div>
  );
}

export default App;
