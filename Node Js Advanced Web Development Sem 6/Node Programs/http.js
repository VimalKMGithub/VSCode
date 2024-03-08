let http = require('http');
let server = http.createServer(function (req, res) {
    res.write("This is working")
    res.end()
})
server.listen(2000, function () {
    console.log("Server is running")
})