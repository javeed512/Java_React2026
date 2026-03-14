import logo from './logo.svg';
import './App.css';
import Button from './Button';

import Student from './Student';
import { Employee } from './Employee';

function App() {
  return (
    <div className="cls1">

      <h1 >WELCOME FRIENDS</h1>
      <Button  name="Button1"></Button>
     <Student></Student>

     <Button name="Reset"></Button>

     <Employee  eid="101" ename="king"></Employee>


    </div>
  );
}

export default App;
