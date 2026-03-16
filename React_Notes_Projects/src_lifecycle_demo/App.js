import React, { Component } from 'react'

export default class App extends Component {

  constructor(props) {
    console.log("App-constructor called");
    super(props);

    //initialize the state
    this.state =
    {
        color:"green"
    };
  }
  static getDerivedStateFromProps(props, state) {
    console.log("App-getDerivedStatedFromProps called") 
    // update the state or null to update nothing.
    return {color: props.favcolor};
  }
  componentDidMount() {
    //get the data from server and set to state
    console.log("App-componentDidMount called");
   
  }
  render() {
    console.log("App-render called");
    return (
      <h1>My Favorite Color is {this.state.color}</h1>
    );
  }
}

