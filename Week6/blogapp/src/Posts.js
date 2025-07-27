

import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }


  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((res) => res.json())
      .then((data) => {
        const formattedPosts = data.map(p => new Post(p.userId, p.id, p.title, p.body));
        this.setState({ posts: formattedPosts });
      })
      .catch((error) => {
        console.error('Fetch failed:', error);
        this.setState({ hasError: true });
      });
  };


  componentDidMount() {
    this.loadPosts();
  }


  componentDidCatch(error, info) {
    alert("Something went wrong while loading posts.");
    console.log("Error details:", error, info);
    this.setState({ hasError: true });
  }

  render() {
    if (this.state.hasError) {
      return <h3>Oops! An error occurred while loading posts.</h3>;
    }

    return (
      <div>
        <h2>📄 Blog Posts</h2>
        {this.state.posts.map(post => (
          <div key={post.id} style={{ border: '1px solid #ccc', marginBottom: '10px', padding: '10px' }}>
            <h4>{post.title}</h4>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
