
import { Component } from "react";


export default class Customer extends Component {
	state={
		name: "Alan",
		id:101
	}
	handleClick=(id)=>
	{
		console.log(id);
	}
	//first handler
	handleArgument=()=>
	{

			
		this.handleClick(this.state.id)
	}
  render() {
	return (
	  <div>
		  <h1>Name: {this.state.name}</h1>
		  <button onClick={this.handleArgument}>clickMe</button>
	  </div>
	)
  }
}

