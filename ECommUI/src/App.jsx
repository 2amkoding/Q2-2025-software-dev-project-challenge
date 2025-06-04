import { BrowserRouter, Routes, Route, NavLink } from 'react-router-dom'
import { Button } from './components/ui/button'
import CsvUploadForm from './components/CsvForm'
import Dashboard from './pages/Dashboard'

function App() {
  return (
    <BrowserRouter>
      <>
        {/* Navigation with shadcn/ui styling */}
        <nav className="border-b">
          <div className="container mx-auto px-4 py-3 flex justify-between items-center">
            <div className="font-bold text-xl">E-Commerce Analytics</div>
            <ul className="flex space-x-2">
              <li>
                <NavLink to="/">
                  {({ isActive }) => (
                    <Button
                      variant={isActive ? "default" : "ghost"}
                    >
                      Dashboard
                    </Button>
                  )}
                </NavLink>
              </li>
              <li>
                <NavLink to="/csv-upload">
                  {({ isActive }) => (
                    <Button
                      variant={isActive ? "default" : "ghost"}
                      asChild={false}
                    >
                      CSV Upload
                    </Button>
                  )}
                </NavLink>
              </li>
            </ul>
          </div>
        </nav>

        {/* Main Content */}
        <main className="container mx-auto px-4 py-6">
          <Routes>
            <Route path="/" element={<Dashboard />} />
            <Route path="/csv-upload" element={<CsvUploadForm />} />
          </Routes>
        </main>
      </>>
    </BrowserRouter>
  )
}

export default App
