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










// const fs = require('fs');

// function readFileAndWriteUpperCase() {
//     const readStream = fs.createReadStream('text.txt');
//     const writeStream = fs.createWriteStream('output.txt');

//     readStream.on('error', (err) => {
//         console.error('Error reading from input.txt:', err);
//         process.exit(1);
//     });

//     writeStream.on('error', (err) => {
//         console.error('Error writing to output.txt:', err);
//         process.exit(1);
//     });

//     let data = '';
//     readStream.on('data', (chunk) => {
//         data += chunk.toString();
//     });

//     readStream.on('end', () => {
//         const uppercasedData = data.toUpperCase();
//         writeStream.write(uppercasedData);
//         console.log('Successfully converted and wrote data to output.txt!');
//     });
// }

// readFileAndWriteUpperCase();