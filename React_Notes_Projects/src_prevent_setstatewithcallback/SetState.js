import { Component } from "react";


export class  SetState  extends Component{


    state = {


            id:111,
            name:"javeed",
            city:"hyderbad"


    }


     updateStateEvent =  ()=>{

            this.setState( {"id":999 , "name":"javeed sir"} )


     }




        render(){

                return(


                    <>
                    
                        <h1>Id: {this.state.id}  {this.state.name}    {this.state.city}</h1>
                    
                        <button   onClick={ this.updateStateEvent } >Update Details</button>

                    </>

                )


        }






}