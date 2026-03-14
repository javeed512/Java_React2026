import { Component } from "react";




export class Student extends Component {


    constructor(props){

            super(props)

            this.state = {

                sid:101 ,
                sname: "king",
                fee : this.props.fee
            }



            console.log(this.props)
            console.log(this.state)

                

    }

        

    render(){

        this.state.sname = "spider man"

           return <>

             <h1>  {this.state.sname}</h1>

                <h1>Class Component with props and state</h1>

                <h2> {this.state.sname}</h2>
           
           </> 
          


    }





}