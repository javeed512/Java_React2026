import './App.css';

import { useState , useRef } from 'react';

function App() {
  

const [name,setName]=useState("");
 const ref=useRef();

  const handleClick=()=>
  {
    //renders the output
   // setName("Alan");
    
    //not renders the output

    ref.current = "Kelvin";
    console.log(ref.current)
  }

  const  fetch = () =>{

      alert(ref.current)

      setName(ref.current)

  }


  return (
    <div>
      <h1>Name : {name}</h1>
      <button onClick={handleClick}>clickMe</button>

      <button onClick={fetch }>Fetch</button>
    </div>
  )




}

export default App;
