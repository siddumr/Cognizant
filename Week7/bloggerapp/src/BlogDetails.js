

const BlogDetails = ({ blogs }) => {
  return (
    <div>
      <h2>📝 Latest Blog Posts</h2>
      {blogs.length === 0 ? (
        <p>No blogs available at the moment.</p>
      ) : (
        <ul>
          {blogs.map((blog, idx) => (
            <li key={idx}>
              <strong>{blog.title}</strong> - {blog.category}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
};

export default BlogDetails;
