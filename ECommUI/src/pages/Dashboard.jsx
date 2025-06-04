import React from 'react';

export default function Dashboard() {
  return (
    <div className="p-4">
      <h1 className="text-2xl font-bold mb-4">Dashboard</h1>
      <p>Welcome to the E-Commerce Analytics Dashboard</p>
      
      {/* Add your dashboard content here */}
      <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4 mt-6">
        <div className="bg-white p-4 rounded shadow">
          <h2 className="text-lg font-semibold mb-2">Sales Overview</h2>
          <p>No data available yet. Upload CSV data to see analytics.</p>
        </div>
        <div className="bg-white p-4 rounded shadow">
          <h2 className="text-lg font-semibold mb-2">Customer Insights</h2>
          <p>No data available yet. Upload CSV data to see analytics.</p>
        </div>
        <div className="bg-white p-4 rounded shadow">
          <h2 className="text-lg font-semibold mb-2">Product Performance</h2>
          <p>No data available yet. Upload CSV data to see analytics.</p>
        </div>
      </div>
    </div>
  );
}

