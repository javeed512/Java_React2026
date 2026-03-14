import { Component } from "react";


export class  Employee  extends  Component{




    render(){


            return <div>
                <h1>Employee Class Component</h1>
                <h2>Eid: {this.props.eid}</h2>
                <h2>Ename: {this.props.ename}</h2>
                
                </div>


    }




}