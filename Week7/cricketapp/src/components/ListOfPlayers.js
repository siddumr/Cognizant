
import React from "react";

const ListOfPlayers = () => {
 
  const players = [
    { name: "Virat", score: 85 },
    { name: "Rohit", score: 92 },
    { name: "Rahul", score: 67 },
    { name: "Pant", score: 45 },
    { name: "Bumrah", score: 7 },
    { name: "Jadeja", score: 33 },
    { name: "Shami", score: 61 },
    { name: "Gill", score: 89 },
    { name: "Surya", score: 48 },
    { name: "Hardik", score: 55 },
    { name: "Ashwin", score: 99 }
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, idx) => (
          <li key={idx}>{player.name} - {player.score} runs</li>
        ))}
      </ul>

      <h3>Players with Score Below 70</h3>
      <ul>
        {lowScorers.map((player, idx) => (
          <li key={idx}>{player.name} - {player.score} runs</li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
