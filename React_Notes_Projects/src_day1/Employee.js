


import { Component } from "react"

export class Employee  extends Component {

    render(){

            return (
            <div>
            <h1>HELLO WORLD</h1>

                <h2>Eid:  {this.props.eid}</h2>
                <h2>EName: {this.props.ename}</h2>
            

            </div>
            )

    }



}