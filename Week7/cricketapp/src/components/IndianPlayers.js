const IndianPlayers = () => {
  const T20 = ["Kohli", "Surya", "Hardik", "Gill"];
  const Ranji = ["Jadeja", "Rahane", "Iyer"];


  const allPlayers = [...T20, ...Ranji];


  const oddPlayers = allPlayers.filter((_, idx) => idx % 2 === 0);
  const evenPlayers = allPlayers.filter((_, idx) => idx % 2 !== 0);

  return (
    <div>
      <h2>Merged Indian Players</h2>
      <ul>
        {allPlayers.map((p, idx) => <li key={idx}>{p}</li>)}
      </ul>

      <h3>Odd Team Players</h3>
      <ul>
        {oddPlayers.map((p, idx) => <li key={idx}>{p}</li>)}
      </ul>

      <h3>Even Team Players</h3>
      <ul>
        {evenPlayers.map((p, idx) => <li key={idx}>{p}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
