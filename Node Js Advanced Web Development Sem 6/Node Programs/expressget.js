// const express = require('express');
// const app = express();
// const fs = require('fs');
// app.get('/', function (req, res) {
//     res.sendFile(__dirname + "/" + "form1.html");
// })
// // app.get('/hello', function (req, res) {
// //     res.send('Again Hello World!')
// // })
// app.get('/register', function (req, res) {
//     details = {
//         name: req.query.name,
//         email: req.query.email,
//         gender: req.query.gender,
//         address: req.query.address
//     }
//     fs.writeFile("details.txt", JSON.stringify(details), function (err) {
//         if (err) {
//             return res.send("error writing into this file")
//         }
//         res.send("Done")
//     })
//     // res.send(details)
// })
// app.listen(2000);




const express = require('express');
const app = express();
const fs = require('fs');
const bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({ extended: false }));
app.get('/', function (req, res) {
    res.sendFile(__dirname + "/" + "form1.html");
})
// app.get('/hello', function (req, res) {
//     res.send('Again Hello World!')
// })
app.post('/register', function (req, res) {
    details = {
        name: req.body.name,
        email: req.body.email,
        gender: req.body.gender,
        address: req.body.address
    }
    fs.writeFile("details.txt", JSON.stringify(details), function (err) {
        if (err) {
            return res.send("error writing into this file")
        }
        res.send("Done")
    })
    // res.send(details)
})
app.listen(2000);