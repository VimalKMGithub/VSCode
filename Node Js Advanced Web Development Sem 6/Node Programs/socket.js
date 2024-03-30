const express = require('express');
const app = express();
const http = require('http').createServer(app);
const io = require('socket.io')(http);
app.get('/', function (req, res) {
    res.sendFile(__dirname + "/" + "socket.html");
})
// io.on('connect', function (socket) {
//     console.log("A user connected")
//     socket.on('disconnect', function () {
//         console.log("A user disconnected")
//     })
// })
io.on('connect', function (socket) {
    socket.emit('myevent', 'hey client');
})
http.listen(2000);