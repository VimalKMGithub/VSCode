var express = require('express');
var app = express();
var http = require('http').createServer(app);
var io = require('socket.io')(http);
app.get('/', function (req, res) {
    res.sendFile(__dirname + "/" + "broadcast.html");
})
var clients = 0
io.on('connection', function (socket) {
    clients++
    // socket.broadcast.emit('broadcast', { msg: clients + ' clients connected!' });
    // socket.emit('broadcast', { msg: clients + ' clients connected!' });
    io.emit('broadcast', { msg: clients + ' clients connected!' });
    socket.on('disconnect', function () {
        clients--
        // socket.emit('broadcast', { msg: clients + ' clients connected!' });
        // socket.broadcast.emit('broadcast', { msg: clients + ' clients connected!' });
        io.emit('broadcast', { msg: clients + ' clients connected!' });
    })
})
http.listen(2000, function () {
    console.log('listening on 2000')
});