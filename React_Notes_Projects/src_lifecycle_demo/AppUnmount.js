
import { Component } from "react";


export default class AppUnmount extends Component {
 //this method will execute when component is mounted
 componentDidMount()
 {
     console.log("App Mounted");
 }
 //this method we will use to do something before component is remove
 componentWillUnmount()
 {
     console.log("App unmounted")
 }
 render() {
console.log("App render");
     return (
         <div>
             <h1>Hello App component</h1>                
         </div>
     )
 }

}
