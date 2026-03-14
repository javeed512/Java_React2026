

// function Student(){

import { Fragment, StrictMode } from "react";


//     return <h1>Function Component executed..</h1>



// }

const Student=(props)=>{
    return  <div>
     

    
    <h1>MyName:  {props.myname}</h1>
    <h1>City:  {props.city}</h1>
    <h1>Pin:   {props.pin}</h1>
    </div>

}

export default Student;