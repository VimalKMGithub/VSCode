const express = require('express');
const app = express();
const exprssSession = require('express-session');
app.use(exprssSession({
    secret:'key',
    resave: true,
    saveUninitialized: true
}))
const auth = function(req, res, next){
    if(req.session.user =='navneet'){
        next()
    }
    else{
        res.send('Please login to check your profile')
    }
}
app.get('/', function(req, res){
    res.sendFile(__dirname+"/"+"loginlogout.html")
})
app.get('/login', function(req, res){
    if(req.query.username!='navneet' || req.query.password!='123'){
        res.send('Login failed')
    }
    else if(req.query.username=='navneet' && req.query.password=='123'){
        req.session.user = 'navneet'
        res.send('Login successful')
    }
})
app.get('/logout', function(req, res){
    req.session.destroy()
    res.send("Logged out")
})
app.get('/profile', auth, function(req, res){
    res.send('The is your profile and you will see this only if you are logged in')
})
app.listen(2000);