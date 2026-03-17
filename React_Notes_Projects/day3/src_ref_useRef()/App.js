import {useRef} from 'react';
function App()
{
 const inputRef=useRef(null);

  const handleClick=()=>
  {
      inputRef.current.value="Alan";
      inputRef.current.focus();
      inputRef.current.style.color="red";
      inputRef.current.style.backgroundColor="yellow"
      
     // inputRef.current.style.display="none";

     console.log(inputRef)
  }


  return (
    <div>
     <input type="text" ref={inputRef}/>
     <button onClick={handleClick}>Handle Input</button>
    </div>
  )

}
export default App;

