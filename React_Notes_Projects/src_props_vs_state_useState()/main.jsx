import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import { Student } from './Student.jsx'
import { Counter } from './Counter.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
      
      <Student fee={9000}></Student>

      <Counter></Counter>
      
      
  </StrictMode>
)
