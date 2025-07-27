
import React from 'react';
import './my-style.css';

const CalculateScore = () => {
 
  const name = "Siddarthan";
  const school = "Cognizant Public School";
  const totalMarks = 450;
  const goal = 500;

  const average = totalMarks / 5; 

  return (
    <div className="score-card">
      <h2>Student Score Summary</h2>
      <p><strong>Name:</strong> {name}</p>
      <p><strong>School:</strong> {school}</p>
      <p><strong>Total Marks:</strong> {totalMarks}</p>
      <p><strong>Goal:</strong> {goal}</p>
      <p><strong>Average Score:</strong> {average}</p>
    </div>
  );
};

export default CalculateScore;
