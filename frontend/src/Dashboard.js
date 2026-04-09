import React from 'react';
import Navbar from './Navbar';
import '../styles/Dashboard.css';

function Dashboard({ user, onLogout }) {
  return (
    <div>
      <Navbar onLogout={onLogout} />
      <div className="dashboard-container">
        <h1>Welcome, {user.username}!</h1>
        <p>This is your AI Mental Health Chatbot dashboard.</p>
        <p>You can integrate your chatbot here with live chat functionality.</p>
      </div>
    </div>
  );
}

export default Dashboard;