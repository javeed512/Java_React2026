import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'

import Student from './Student.jsx'
import { Employee } from './Employee.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
      
        <Student  myname="King"  city="Hyderabad"  pin="500020"></Student> <br />

        <Employee  eid='101'   ename ='tom'></Employee>
      
  </StrictMode>
)
