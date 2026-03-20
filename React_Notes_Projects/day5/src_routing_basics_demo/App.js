import { BrowserRouter, Link, NavLink, Route, Routes } from 'react-router-dom';
import './App.css';
import Home from './Home';
import About from './About';
import Service from './Service';
import Error from './Error';
import { Contact } from './Contact';
import { Navigation } from './Navigation';

function App() {
  return (
    <>
    
    
      <BrowserRouter>

         <center>
            <Link style={{margin:"0px 50px"}} to="/"> Home </Link>    
            <Link style={{margin:"0px 50px"}} to="/about"> About </Link>    
            <Link style={{margin:"0px 50px"}} to="/service"> Service </Link> 
            <NavLink style={ {margin: "0px 50px"} }  to="/contact">Contact Us</NavLink>
            </center>
            <hr/>    
      
        <Routes>

            <Route  exact path="/"  element = { <Home/>}></Route>
            <Route path='/about' element={<About/>}></Route>
            <Route path="/contact" element={<Contact />}> </Route>
            <Route path='/service' element={<Service/>}></Route>
            <Route path='/navigate' element={<Navigation/>}></Route>
            <Route path='*' element={<Error/>}></Route>



        </Routes>
      
      
      </BrowserRouter>
    
    
    
    </>

  );
}

export default App;
