

import React, { useRef } from "react";

export function RegistrationForm() {
  const formRef = useRef(null);
  
  const handleSubmit = (e) => {
    e.preventDefault();
    const form = formRef.current;
    
    const formData = {
      firstName: form.firstName.value,
      lastName: form.lastName.value,
      email: form.email.value,
      gender: form.gender.value,
      interests: Array.from(form.interests)
        .filter(checkbox => checkbox.checked)
        .map(checkbox => checkbox.value),
      country: form.country.value,
      comments: form.comments.value
    };
    
    console.log("Form submitted with:", formData);
    // Process the data
  };
  
  return (
    <form ref={formRef} onSubmit={handleSubmit}>
      <div>
        <label htmlFor="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" defaultValue="" />
      </div>
      
      <div>
        <label htmlFor="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" defaultValue="" />
      </div>
      
      <div>
        <label htmlFor="email">Email:</label>
        <input type="email" id="email" name="email" defaultValue="" />
      </div>
      
      <div>
        <p>Gender:</p>
        <label>
          <input type="radio" name="gender" value="male" defaultChecked />
          Male
        </label>
        <label>
          <input type="radio" name="gender" value="female" />
          Female
        </label>
        <label>
          <input type="radio" name="gender" value="other" />
          Other
        </label>
      </div>
      
      <div>
        <p>Interests:</p>
        <label>
          <input type="checkbox" name="interests" value="sports" />
          Sports
        </label>
        <label>
          <input type="checkbox" name="interests" value="music" />
          Music
        </label>
        <label>
          <input type="checkbox" name="interests" value="reading" />
          Reading
        </label>
      </div>
      
      <div>
        <label htmlFor="country">Country:</label>
        <select id="country" name="country" defaultValue="">
          <option value="" disabled>Select a country</option>
          <option value="usa">United States</option>
          <option value="canada">Canada</option>
          <option value="mexico">Mexico</option>
          <option value="other">Other</option>
        </select>
      </div>
      
      <div>
        <label htmlFor="comments">Comments:</label>
        <textarea 
          id="comments" 
          name="comments" 
          defaultValue=""
          rows="4"
        />
      </div>
      
      <button type="submit">Register</button>
    </form>
  );
}
