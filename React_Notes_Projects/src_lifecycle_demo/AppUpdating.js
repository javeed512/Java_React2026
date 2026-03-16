
import { Component } from "react";


export default class AppUpdating extends Component {

  constructor(props) {
    console.log("App-constructor called");
    super(props);

    //initialize the state
    this.state =
    {
        color:"green"
    };

    console.log('props ', props.favcolor)
    console.log('state ', this.state.color)
  }
  static getDerivedStateFromProps(props, state) {
    console.log("App-getDerivedStatedFromProps called") 
    // update the state or null to update nothing.
    return {color: props.favcolor};
  }
  changeColor = () => {

        console.log(' setState ' , this.state.color)

    this.setState({color: this.state.color});
  }
  shouldComponentUpdate(nextProps,nextState)
  {
    console.log("App- shouldcomponentupdate called");
    return true;
  }
   //this method runs before update
   getSnapshotBeforeUpdate(prevProps,prevState)
   {
       console.log("App - get snap shot before update ");
       console.log(prevProps,prevState);
       return true;
   }

   //this method runs after update
   componentDidUpdate(prevProps,prevState,snapshot)
   {
       console.log("App - component did update ");
       console.log(prevProps,prevState,snapshot);
   }
  render() {
    console.log("App-render called");
    return (
      <div>
      <h1>My Favorite Color is {this.state.color}</h1>
      <button type="button" onClick={this.changeColor}>Change color</button>
      </div>
    );
  }
}
