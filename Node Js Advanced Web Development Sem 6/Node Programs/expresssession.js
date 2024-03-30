const express = require('express');
const app = express();
const expressSession = require('express-session');
app.use(expressSession({
    secret: 'key',
    resave: true,
    saveUninitialized: true,
    cookie: { maxAge: 15000 }
}))
app.get('/', function (req, res) {
    if (req.session.views) {
        req.session.views++;
        res.send("visiting " + req.session.views + " times")
    } else {
        req.session.views = 1;
        res.send("visiting first time")
    }
});
app.listen(2000)