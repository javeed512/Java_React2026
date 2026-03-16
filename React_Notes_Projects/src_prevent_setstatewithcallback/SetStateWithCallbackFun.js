import { Component } from "react";



export class  SetStateWithCallbackFun  extends Component{



    state={
		name: "Alan",
		id:this.props.id
	}


    // handleClick = ()=>{

    //         this.setState( function(state,props) {

    //                 console.log(state.name , props.id)
    //             return {name:"Alan kelvin" , id: 601}

    //         } );

    // }


handleClick=()=>
	{
		this.setState((state,props)=>
        {

            console.log(state.name , props.id)
            return {name:"Alen Kelvin",id:601}
        });
	}



      render() {
	return (
	  <div>
            <h1>Id: {this.state.id}</h1>
		  <h1>Name: {this.state.name}</h1>
s		  <button onClick={this.handleClick}>clickMe</button>
	  </div>
	)
  }







}