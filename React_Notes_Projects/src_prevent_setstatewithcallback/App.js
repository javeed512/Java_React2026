
import './App.css';
import Customer from './Customer';
import { Employee } from './Employee';
import { Prevent } from './Prevent';
import { SetState } from './SetState';
import { SetStateWithCallbackFun } from './SetStateWithCallbackFun';
import { Student } from './Student';


function App() {
  return (
    <div className="cls1">

      <h1 >WELCOME FRIENDS</h1>
      
      <Student  id={101}></Student> 

      <Employee  ename="Dani"></Employee>


      <Prevent></Prevent>

      <Customer></Customer>

     <SetState></SetState>

     <SetStateWithCallbackFun  id={101}></SetStateWithCallbackFun>

    </div>
  );
}

export default App;
