// let fs = require('fs');
// let reader = fs.createReadStream('text.txt', { start: 3, end: 7 });
// reader.on('data', function (chunk) {
//     message = chunk;
//     // console.log(message.toString());
// })
// reader.on('end', function () {
//     console.log(message.toString());
//     console.log("finished reading");
// })
// reader.on('error', function (err) {
//     // if (err) return console.error("error reading");
//     console.error("error reading");
// })



// let fs = require('fs');
// let writer = fs.createWriteStream('text.txt')
// let data = "Today is friday"
// writer.write(data)
// writer.end();
// writer.on('finish', function () {
//     console.log("finished writing");
// })
// writer.on('error', function (err) {
//     console.log(err)
// });



// const fs = require('fs');
// const readline = require('readline').createInterface({
//     input: process.stdin,
//     output: process.stdout
// });

// function promptUser() {
//     readline.question('Enter data to write to the file: ', (data) => {
//         writeFile(data);
//     });
// }

// function writeFile(data) {
//     const writeStream = fs.createWriteStream('text.txt');
//     writeStream.on('error', (err) => {
//         console.error('Error writing to file:', err);
//         process.exit(1);
//     });
//     writeStream.write(data, (err) => {
//         if (err) {
//             console.error('Error writing data:', err);
//             process.exit(1);
//         } else {
//             console.log('Data written successfully!');
//             readFile();
//         }
//     });
// }

// function readFile() {
//     const readStream = fs.createReadStream('text.txt');
//     readStream.on('error', (err) => {
//         console.error('Error reading from file:', err);
//         process.exit(1);
//     });
//     let data = '';
//     readStream.on('data', (chunk) => {
//         data += chunk.toString();
//     });
//     readStream.on('end', () => {
//         console.log('Read data from file:', data);
//         readline.close();
//     });
// }

// promptUser();










