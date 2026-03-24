
import { Component } from "react"

export default class User extends Component {
    render() {
        return (

                <>
                 <h1>State  value from parent to User</h1>
                <h1>{this.props.uname}</h1>

                </>
         
        )
    }
}