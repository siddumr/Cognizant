// src/App.js
import React, { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  const [userRole, setUserRole] = useState("guest"); // Options: guest, blogger, student
  const [showCourses, setShowCourses] = useState(true);

  const books = [
    { title: "Atomic Habits", author: "James Clear" },
    { title: "Deep Work", author: "Cal Newport" }
  ];

  const blogs = [
    { title: "Why React is Awesome", category: "Programming" },
    { title: "Top 10 Productivity Hacks", category: "Lifestyle" }
  ];

  const courses = ["React Basics", "Node.js Crash Course", "Frontend with Tailwind"];

  let mainContent;

  // Element variable for rendering based on role
  if (userRole === "guest") {
    mainContent = <p>Welcome Guest! Please login to see more content.</p>;
  } else if (userRole === "blogger") {
    mainContent = (
      <>
        <BlogDetails blogs={blogs} />
        <BookDetails books={books} />
      </>
    );
  } else if (userRole === "student") {
    mainContent = <CourseDetails showCourses={showCourses} courses={courses} />;
  }

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>🧠 Blogger App Dashboard</h1>

      <div>
        <label>Select Role: </label>
        <select value={userRole} onChange={(e) => setUserRole(e.target.value)}>
          <option value="guest">Guest</option>
          <option value="blogger">Blogger</option>
          <option value="student">Student</option>
        </select>
      </div>

      {userRole === "student" && (
        <div>
          <button onClick={() => setShowCourses(!showCourses)}>
            {showCourses ? "Hide Courses" : "Show Courses"}
          </button>
        </div>
      )}

      <hr />

      {/* Main content based on role */}
      {mainContent}
    </div>
  );
}

export default App;
