
import React, { useState } from "react";

const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState(null);

  const handleConvert = (event) => {
    event.preventDefault();
    const euroRate = 0.011; 
    const converted = rupees * euroRate;
    setEuro(converted.toFixed(2));
  };

  return (
    <div>
      <h2>💱 Currency Convertor</h2>
      <form onSubmit={handleConvert}>
        <input
          type="number"
          placeholder="Enter amount in ₹"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
        />
        <button type="submit">Convert to Euro</button>
      </form>

      {euro !== null && (
        <p>€ {euro} EUR</p>
      )}
    </div>
  );
};

export default CurrencyConvertor;
