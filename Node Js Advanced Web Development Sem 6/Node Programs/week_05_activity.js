// const http = require('http');
// const fs = require('fs');
// const path = require('path');

// const server = http.createServer((req, res) => {
//     if (req.url === '/lpuadmissions') {
//         const filePath = path.join(__dirname, 'form.html');
//         fs.readFile(filePath, 'utf8', (err, data) => {
//             if (err) {
//                 res.writeHead(404, { 'Content-Type': 'text/plain' });
//                 res.end('Form not found');
//             } else {
//                 res.writeHead(200, { 'Content-Type': 'text/html' });
//                 res.end(data);
//             }
//         });
//     } else {
//         res.writeHead(404, { 'Content-Type': 'text/plain' });
//         res.end('Page not found');
//     }
// });
// const PORT = 2000;
// server.listen(PORT, () => {
//     console.log(`Server running at http://localhost:${PORT}`);
// });










// let http = require('http');
// let fs = require('fs');
// const server = http.createServer((req, res) => {
//     if (req.url == '/lpuadmissions') {
//         fs.readFile('form.html', (err, data) => {
//             if (err) {
//                 res.write("file not found")
//                 res.end();
//             }
//             else {
//                 res.write(data)
//                 res.end();
//             }
//         });
//     }
//     else {
//         res.write("Page not found")
//         res.end();
//     }

// });
// server.listen(2000, function () {
//     console.log("Server is running")
// })










// let http = require('http');
// let fs = require('fs');
// let server = http.createServer((req, res) => {
//     if (req.url == '/lpuadmissions') {
//         fs.readFile('form.html', (err, data) => {
//             if (err) {
//                 res.write("file not found")
//                 res.end();
//             }
//             else {
//                 res.write(data)
//                 res.end();
//             }
//         });
//     }
//     else {
//         res.write("Page not found")
//         res.end();
//     }
// });
// server.listen(2000, function () {
//     console.log("Server is running")
// })









const http = require('http');
const fs = require('fs');
const server = http.createServer((req, res) => {
    if (req.url === '/lpuadmissions') {
        fs.readFile('./form.html', (err, data) => {
            if (err) {
                res.end('Form not found');
            } else {
                res.end(data);
            }
        });
    } else {
        res.end('Page not found');
    }
});

server.listen(2000, 'localhost', () => {
    console.log('Server listening on port 2000');
});