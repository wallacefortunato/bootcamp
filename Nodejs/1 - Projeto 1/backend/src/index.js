const express = require('express');
const { uuid } = require('uuidv4');

const app = express();

const URL = 'http://localhost:3333/projects';

/*
* A princípio, utilizarei um array para armazenar as informações dos projetos. Posteriormente,
* utilizarei um banco de dados para armazenar as informações. 
*/
const projects = [];

app.use(express.json());

app.get('/projects', (request, response) => {
  const { title, owner } = request.query;

  return response.json(projects);
});

app.post('/projects', (request, response) => {
  const { title, owner } = request.body;

  const project = { id: uuid(), title, owner };

  projects.push(project);

  return response.json(project);

});

app.listen (3333, ()=> {
  console.log('🚀 Back-end started at %s', URL);
});