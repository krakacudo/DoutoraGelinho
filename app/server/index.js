const express = require('express');
const path = require('path');
const app = express();

const port = 3000;

app.use(express.static(path.join(__dirname, '../public')));

app.use(express.static(path.join(__dirname, '../images')));

app.get('/', (_req, res) => {
    res.sendFile(path.join(__dirname, '../public', 'index.html'));
})

app.listen(port, () => {
    console.log(`Server listening in port ${port}`);
})
