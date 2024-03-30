const express = require('express');
const app = express();
const cookieParser = require('cookie-parser');
app.use(cookieParser());
app.get('/', function (req, res) {
    res.cookie('course', 'Nodejs')
    res.send('The cookie was successfully set.')
    console.log(req.cookies.course)
})
app.get('/clear', function (req, res) {
    res.clearCookie('course')
    res.send('The cookie was successfully cleared.')
})
app.listen(2000)