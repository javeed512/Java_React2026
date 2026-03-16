import { Component } from "react";



export class Student extends Component{




        constructor(props){

            super(props);
           this.handleClickEvent =      this.handleClickEvent.bind(this);

           this.test = this.test.bind(this);


           this.state = {

                sid: this.props.id ,
                sname: "Javeed"


           }


        }


        handleClickEvent(){


                console.log("button is clicked event occur " , this);



        }


        add(x,y){


                console.log("Addition " , (x+y))

        }

        test(){


            this.add(4,5)  // here this keyword refers to the browser window by default

        }

        // using arrow function where this will be inherited automatic

        demo = ()=>{

                    console.log("button is clicked " , this);

        }




    render(){

            return(

                <>
                       <h1> {this.state.sid}</h1>
                       <h1> {this.state.sname} </h1>
                
                    <button  onClick={ this.handleClickEvent } >Click</button> <br />
                    <button onDoubleClick={this.test}>Test Add</button> <br></br>

                    <button   onClick={ this.demo}>Click With Arrow</button>
                
                </>


            );




    }






}