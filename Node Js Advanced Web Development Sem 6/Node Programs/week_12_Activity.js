const express = require('express');
const app = express();
const bodyParser = require('body-parser');
const mongoose = require('mongoose');
mongoose.connect("mongodb://localhost:27017/St_details")
const productSchema = new mongoose.Schema({
    name: String,
    marks: Number
});
const Students = mongoose.model('student_details', productSchema);
app.use(bodyParser.urlencoded({ extended: false }));

app.get('/', function (req, res) {
    res.sendFile(__dirname + "/" + "week_12_Activity.html");
});
app.post('/register', function (req, res) {
    details = {
        name: req.body.name,
        marks: req.body.marks
    };
    let data = new Students(details);
    data.save()
        .then((doc) => {
            console.log(doc);
            res.send("Done")
        })
        .catch((err) => {
            console.log(err);
            res.send("Error")
        });
});

app.listen(2000, function () {
    console.log('Server is running on port 2000');
});
