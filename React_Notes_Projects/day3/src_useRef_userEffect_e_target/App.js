

import {useState,useRef,useEffect} from 'react';
function App()
{
 const [inputValue , setInputValue]=useState("");
 const count=useRef(0);

 useEffect(()=>
 {
   count.current=count.current+1;
 })

//const fun = (e)=>setInputValue(e.target.value);

  return (
    <div>
      <input type="text" value={inputValue} onChange={(e)=>{
                            setInputValue(e.target.value); 
                            console.log(e);
                            }
                             }/>
      <h1>Count Render :{count.current}</h1>
    </div>
  )

}
export default App;
