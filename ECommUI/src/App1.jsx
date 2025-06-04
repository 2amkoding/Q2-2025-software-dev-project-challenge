import { useState } from 'react'
import { BrowserRouter, Routes, Route, Link, NavLink } from 'react-router-dom'
import { InputFile } from './features/csvForm/InputFile'
import CsvUploadForm from './components/CsvForm'
import Dashboard from './pages/Dashboard'

function App() {
  //note: Try using Fragments '<>' instead of adding additional divs

  return (
    <BrowserRouter>
      <>
        {/* Navigation */}
        <nav className="bg-gray-800 p-4">
          <div className="container mx-auto flex justify-between items-center">
            <div className="text-white font-bold text-xl">E-Commerce Analytics</div>
            <ul className="flex space-x-4">
              <li>
                <NavLink 
                  to="/" 
                  className={({ isActive }) => 
                    isActive 
                      ? "text-white bg-gray-900 px-3 py-2 rounded" 
                      : "text-gray-300 hover:text-white px-3 py-2 rounded hover:bg-gray-700"
                  }
                >
                  Dashboard
                </NavLink>
              </li>
              <li>
                <NavLink 
                  to="/csv-upload" 
                  className={({ isActive }) => 
                    isActive 
                      ? "text-white bg-gray-900 px-3 py-2 rounded" 
                      : "text-gray-300 hover:text-white px-3 py-2 rounded hover:bg-gray-700"
                  }
                >
                  CSV Upload
                </NavLink>
              </li>
            </ul>
          </div>
        </nav>

        {/* Main Content */}
        <main className="container mx-auto mt-4">
          <Routes>
            <Route path="/" element={<Dashboard />} />
            <Route path="/csv-upload" element={<CsvUploadForm />} />
          </Routes>
        </main>
      </>
    </BrowserRouter>
  )
}

export default App
