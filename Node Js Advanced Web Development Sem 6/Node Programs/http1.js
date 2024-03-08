let http = require('http');
let server = http.createServer(function (req, res) {
    if (req.url == '/admin') {
        res.write("Welcome admin")
    } else if (req.url == '/user') {
        res.write("Welcome user")
    } else {
        res.write("Page you are looking for does not exist")
    }
    res.end()
})
server.listen(2000, function () {
    console.log("Server is running")
})