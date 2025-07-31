
import ListOfPlayers from "./components/ListOfPlayers";
import IndianPlayers from "./components/IndianPlayers";

function App() {
  const showPlayers = true;

  return (
    <div className="App">
      <h1>🏏 Cricket Team Dashboard</h1>
      {showPlayers ? <ListOfPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
