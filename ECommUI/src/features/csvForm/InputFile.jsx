import { Input } from "@/components/ui/input"
import { Label } from "@/components/ui/label"
 
export function InputFile() {
  return (
    <div className="grid w-full max-w-sm items-center gap-1.5">
      <Label htmlFor="csv">CSV File</Label>
      <Input 
        id="csv" 
        type="file" 
        accept=".csv"
      />
    </div>
  )
}