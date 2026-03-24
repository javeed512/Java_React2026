import { useState } from "react";


// Custom hook or function
function  useCustomCounter(){

        const [count,setCount] = useState(0);


        const handleIncrement = ()=>{



                setCount(count + 1);

        }


        return {

                count,
                handleIncrement
        }



}

export default useCustomCounter;