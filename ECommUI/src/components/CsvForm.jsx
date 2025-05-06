import React from "react";
import { useForm } from "react-hook-form";
import { Input } from "./ui/input";
import { Button } from "./ui/button";
import { Label } from "./ui/label";


export default function CsvUploadForm() {
    const { register, handleSubmit } = useForm()

    const onSubmit = (data) => {
        console.log("Uploaded file:", data.file[0])
    }

    return (
        <form onSubmit={handleSubmit(onSubmit)} className="space-y-4 max-w-md mx-auto mt-10">
            <div>
                <Label htmlFor="file">Upload CSV file</Label>
                <Input type="file" id="file" {...register("file")} />
            </div>

            <Button type="submit">Submit</Button>

        </form>
    )
}