const express = require('express');
const app = express();

const http = require('http').createServer(app);
const io = require('socket.io')(http)

app.get('/', (req, res) => {
    res.sendFile(__dirname + "/" + "socket1.html");
})

io.on('connect', (socket) => {
    setInterval(() => {
        socket.emit('myevent', 'Hey Harsh!');
    }, 3000);
})

http.listen(2000, () => {
    console.log("Server started on port 2000");
})