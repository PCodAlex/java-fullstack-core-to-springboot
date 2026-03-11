import axios from "axios";

const API = axios.create({
  baseURL: "http://localhost:5678/api",
});

export default API;
