
import { Component } from "react";

 export class Student  extends   Component{



            constructor(props){

                    super(props);


                    this.state = {

                            id:101,
                            name:'king',
                            fee: this.props.fee


                    } ;



            }


    
            

        render(){

             

              return ( <div>
              
              <h1>Id : {this.state.id}</h1>  
              <h1>Name: {this.state.name}</h1>
              <h1>Fee:  {this.state.fee}</h1>
            

              </div>

              );
        }




}

