

import { Component } from "react"

import User from "./User"
import Guest from "./Guest"

export default class App extends Component {
    state={
            name:"Javeed"
    }
    render() {
            return <>
            
            <User  uname={this.state.name}/>


            <Guest gname={this.state.name} />

            </>
                   
        
    }
}