
import React, { useState } from "react";
import GuestView from "./GuestView";
import UserView from "./UserView";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);


  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

 
  let authButton;
  if (isLoggedIn) {
    authButton = <button onClick={handleLogout}>Logout</button>;
  } else {
    authButton = <button onClick={handleLogin}>Login</button>;
  }

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>✈️ Welcome to Ticket Booking App</h1>


      {authButton}

      <hr />


      {isLoggedIn ? <UserView /> : <GuestView />}
    </div>
  );
}

export default App;
