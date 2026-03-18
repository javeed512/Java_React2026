import React, { Component } from 'react'


import { RegistrationForm } from './RegistrationForm';

export default class App extends Component {
        constructor(props)
        {
                super(props);
                this.state={
                        value:""
                }
                //create ref
                this.textInput=React.createRef();

        }
        handleSubmit=(e)=>
        {
               e.preventDefault();
               //set the data of text field to state.
               this.setState({value:this.textInput.current.value});
        }
       
        componentDidMount=()=>
        {
           this.textInput.current.focus();
        }
        render() {
                return (
                        <div>
                           <h1>You Enter Name : {this.state.value}</h1>
                           <form onSubmit={this.handleSubmit}>
                              Name : <input type="text" ref={this.textInput}/>
                              <input type="submit" value="submit"/>
                           </form>

                  <br/>

                    <RegistrationForm></RegistrationForm>

                        </div>
                )
        }
}
