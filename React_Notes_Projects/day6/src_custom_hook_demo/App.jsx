import { func } from "prop-types";
import useCustomCounter from "./useCustomCounter";




export function  App(){



    // using and assigning custom hook to the data variable

           const data  = useCustomCounter();   // calling custom hook

        console.log(data)

      return (


            <>
            
                <h1>Count: {data.count}</h1>

                <button type="button" onClick={data.handleIncrement}> Increment</button>
            
            </>


      )



}