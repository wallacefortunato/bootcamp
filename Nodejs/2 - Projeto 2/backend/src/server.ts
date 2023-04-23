import express from 'express';

const app = express();

const URL = 'http://localhost:3333/';

app.get('/', (request, response) => {
  return response.json({ message: 'Hello World' });
});

app.listen(3333, () => {
  console.log('🚀 Back-end started at %s', URL);
});
