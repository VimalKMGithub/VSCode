const http = require('http');
const fs = require('fs');

// Read data from the JSON file
const readDataFromFile = (callback) => {
    fs.readFile('data.json', (err, data) => {
        if (err) {
            callback(err, null);
            return;
        }
        try {
            const jsonData = JSON.parse(data);
            callback(null, jsonData);
        } catch (error) {
            callback(error, null);
        }
    });
};

// Create the HTTP server
const server = http.createServer((req, res) => {
    if (req.url === '/') {
        // Read data from the JSON file
        readDataFromFile((err, jsonData) => {
            if (err) {
                res.writeHead(500, { 'Content-Type': 'text/plain' });
                res.end('Internal Server Error');
                return;
            }
            // Prepare HTML response
            let htmlResponse = '<!DOCTYPE html><html><head><title>Student Data</title></head><body><h1>Student Data</h1><table border="1"><tr><th>Name</th><th>CGPA</th><th>Address</th></tr>';
            // Iterate through each student object and create table rows
            jsonData.forEach((student) => {
                htmlResponse += `<tr><td>${student.name}</td><td>${student.cgpa}</td><td>${student.address}</td></tr>`;
            });
            htmlResponse += '</table></body></html>';
            // Send HTML response
            res.writeHead(200, { 'Content-Type': 'text/html' });
            res.end(htmlResponse);
        });
    } else {
        // Handle other routes
        res.writeHead(404, { 'Content-Type': 'text/plain' });
        res.end('404 Not Found');
    }
});

// Start the server
const PORT = 3000;
server.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});








// const http = require('http');
// const fs = require('fs');

// const jsonData = fs.readFileSync('data.json');
// const data = JSON.parse(jsonData);


// const server = http.createServer((req, res) => {
//     res.writeHead(200, { 'Content-Type': 'text/html' });
//     res.write('<!DOCTYPE html>');
//     res.write('<html>');
//     res.write('<head>');
//     res.write('<title>JSON Data</title>');
//     res.write('<style>');
//     res.write('table { border-collapse: collapse; width: 50%; }');
//     res.write('th, td { border: 1px solid black; padding: 8px; text-align: left; }');
//     res.write('th { background-color: #f2f2f2; }');
//     res.write('</style>');
//     res.write('</head>');
//     res.write('<body>');
//     res.write('<h2>Student Data from JSON file:</h2>');
//     res.write('<table>');
//     res.write('<tr><th>Name</th><th>CGPA</th><th>Address</th></tr>');
//     data.forEach((item) => {
//         res.write(`<tr><td>${item.name}</td><td>${item.cgpa}</td><td>${item.address}</td></tr>`);
//     });
//     res.write('</table>');
//     res.write('</body>');
//     res.write('</html>');
//     res.end();
// });

// const PORT = 3002;
// server.listen(PORT, () => {
//     console.log(`Server is running at http://localhost:${PORT}`);
// });