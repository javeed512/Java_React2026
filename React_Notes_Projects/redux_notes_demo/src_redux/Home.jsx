

import { useSelector } from "react-redux";


export function  Home(){


    const counter =        useSelector( (state)=> state.counter);


    return(

            <>
            
                <h1>Store value in Home : {counter} </h1>
            
            </>

    )




}