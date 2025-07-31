
import React, { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {
  const [count, setCount] = useState(0);


  const increaseCounter = () => {
    setCount(prev => prev + 1);
    sayHello();
    showMessage();
  };

  const decreaseCounter = () => {
    setCount(prev => prev - 1);
  };

  const sayHello = () => {
    console.log("👋 Hello from React!");
  };

  const showMessage = () => {
    alert("🔔 Counter updated!");
  };

  const sayWelcome = (message) => {
    alert(`🌟 ${message}`);
  };

  const handleClick = (event) => {
    alert("🖱️ I was clicked! (Synthetic Event)");
    console.log("Synthetic Event Info:", event);
  };

  return (
    <div style={{ padding: "30px", fontFamily: "sans-serif" }}>
      <h1>🎯 Event Examples App</h1>

      <h2>Counter: {count}</h2>
      <button onClick={increaseCounter}>Increment</button>
      <button onClick={decreaseCounter} style={{ marginLeft: "10px" }}>Decrement</button>

      <hr />

      <button onClick={() => sayWelcome("Welcome to the event lab!")}>Say Welcome</button>

      <hr />

      <button onClick={handleClick}>Synthetic Event - Click Me</button>

      <hr />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
