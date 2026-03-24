import { useDispatch, useSelector } from "react-redux"
import { Decrement, Increment } from "../redux/CounterAction";


export default function Counter() {

      const dispatch =        useDispatch();

        const counter =        useSelector( (state)=> state.counter);  // useSelector help us to read data from store


    return (
      <div className='container mt-5'>
             <h2> Counter Application </h2>
             <div className="container">
                  <button className='btn btn-primary' onClick={()=> dispatch(Increment())  }  >Increment</button> 
          <b style={{fontSize:"30px"}} className="mx-3">{counter}</b>
                  <button className='btn btn-warning' onClick={()=> dispatch(Decrement())}>Decrement</button>
              </div> 
      </div>
    )
  }
  