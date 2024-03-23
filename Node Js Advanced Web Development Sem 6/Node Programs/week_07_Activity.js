// const express = require('express');
// const app = express();

// app.get('/', function (req, res) {
//     res.sendFile(__dirname + "/" + "form2.html");
// });

// app.get('/register', function (req, res) {
//     const first = parseFloat(req.query.first);
//     const second = parseFloat(req.query.second);
//     const result = first + second;

//     res.send("Sum of " + first + " and " + second + " is " + result);
// });

// app.listen(2000);













// // Import the Express module
// const express = require('express');

// // Create an Express application
// const app = express();

// // Define a route for the addition operation
// app.get('/add', (req, res) => {
//     // Get the two numbers from the request query parameters
//     const num1 = parseInt(req.query.num1);
//     const num2 = parseInt(req.query.num2);

//     // Add the two numbers together
//     const sum = num1 + num2;

//     // Send the sum back to the client as a response
//     res.send(`The sum of ${num1} and ${num2} is ${sum}`);
// });

// // Define a route for serving the HTML file
// app.get('/', (req, res) => {
//     // Send the HTML file to the client
//     res.sendFile(__dirname + '/form2.html');
// });

// // Start the server
// app.listen(3000, () => {
//     console.log('Server listening on port 3000');
// });












const express = require('express');
const path = require('path');
const app = express();

// Serve static files from the current directory
app.use(express.static(__dirname));

// Define route to render the HTML form
app.get('/', function (req, res) {
    res.sendFile('form2.html', { root: __dirname });
});

// Define route to handle addition
app.get('/add', function (req, res) {
    const first = parseFloat(req.query.first);
    const second = parseFloat(req.query.second);
    const result = first + second;

    res.send("Result of addition: " + result);
});

// Start the server
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});