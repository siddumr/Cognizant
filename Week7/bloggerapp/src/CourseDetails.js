


const CourseDetails = ({ showCourses, courses }) => {

  return (
    <div>
      <h2>🎓 Available Courses</h2>
      {showCourses && (
        <ul>
          {courses.map((course, i) => (
            <li key={i}>{course}</li>
          ))}
        </ul>
      )}
      {!showCourses && <p>Courses are hidden for now.</p>}
    </div>
  );
};

export default CourseDetails;
