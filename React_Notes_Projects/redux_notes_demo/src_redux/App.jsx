import { configureStore } from "@reduxjs/toolkit";
import { CounterReducer } from "./redux/CounterReducer";

import { Provider } from "react-redux";

import Counter from "./components/Counter";

import { Home } from "./Home";

const store1 = configureStore({

        reducer:{ counter : CounterReducer}


});


export function App(){



    return(


                <>
                
                    <Provider store={store1}>

                        <Counter></Counter>
                        <Home></Home>

                    </Provider>



                
                
                
                </>


    )




}