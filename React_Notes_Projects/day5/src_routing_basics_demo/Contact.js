import { BrowserRouter, useNavigate } from "react-router-dom";
import { Navigation } from "./Navigation";

import { Routes, Route  } from "react-router-dom";


export function  Contact(){

        const navigate =    useNavigate();


    const    handleClick = ()=> {

                navigate("/navigate");  // routing using  useNavigate() or routing using JS

        }


    return(<>
        <center>
        <h1>Contact Us</h1>


        <button  onClick={handleClick} >Navigate JS</button>
        </center>
    
    </>);



}