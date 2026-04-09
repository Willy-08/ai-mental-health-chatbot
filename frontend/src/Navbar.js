import React from 'react';
import '../styles/Dashboard.css';

function Navbar({ onLogout }) {
  return (
    <nav className="navbar">
      <h2>AI Chatbot Dashboard</h2>
      <button className="logout-btn" onClick={onLogout}>Logout</button>
    </nav>
  );
}

export default Navbar;