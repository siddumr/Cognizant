

const UserView = () => {
  return (
    <div>
      <h2>🎫 Book Your Flight</h2>
      <p>You’re logged in. Select a flight to book your ticket.</p>
      <ul>
        <li>
          Flight: Indigo 6E - BLR to DEL - ₹3,200
          <button style={{ marginLeft: "10px" }}>Book</button>
        </li>
        <li>
          Flight: Air India AI - MAA to BOM - ₹4,150
          <button style={{ marginLeft: "10px" }}>Book</button>
        </li>
        <li>
          Flight: SpiceJet SG - HYD to GOA - ₹2,900
          <button style={{ marginLeft: "10px" }}>Book</button>
        </li>
      </ul>
    </div>
  );
};

export default UserView;
