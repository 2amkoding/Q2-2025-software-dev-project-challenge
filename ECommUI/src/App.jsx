import { useState } from 'react'
import { InputFile } from './features/csvForm/InputFile'
import CsvUploadForm from './components/csvForm'

function App() {

//note: Try using Fragments '<>' instead of adding additional divs

  return (
    <div>
      <CsvUploadForm />
    </div>
    )
}

export default App
