import express from "express";
import routes from "./routes"; //O routes se torna um middleware para o projeto.

const app = express();
const URL = "http://localhost:3333/";

app.use(express.json());
app.use(routes);

app.listen(3333, () => {
  console.log("🚀 Back-end started at %s", URL);
});
