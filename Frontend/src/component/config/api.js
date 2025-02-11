import axios from "axios"

export const API_URL = process.env.REACT_APP_API_URL;

console.log(API_URL); // Should print "http://localhost:8080"


// export const API_URL="http://online-food-ordering-latest.onrender.com"

export const api=axios.create({
    baseURL:API_URL,
    headers:{
        "Content-Type":"application/json",
    }
})
