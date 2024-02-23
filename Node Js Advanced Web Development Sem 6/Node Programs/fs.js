
// let fss=require('fs');
// fss.readFile('text.txt',function(err,data){
//     if(err) return console.log("some error")
//     console.log(data.toString())
// })
// console.log("hey this end")


// let fs=require('fs')
// let data=fs.readFileSync('text.txt')
// console.log(data.toString())
// console.log("hey this end")

// const fs = require('fs');

// try {
//   let data = fs.readFileSync('text.txt');
//   console.log(data.toString());
//   console.log("File read successfully!");
// } catch (error) {
//   console.error("Error reading the file:", error.message);
// }
// console.log("Hey, this is the end.");

// let fs=require('fs')
// var data="this is node js class"
// fs.writeFile('text1.txt',data,function(err){
//   if (err) {
//     return console.error("error writing into this file")
//   }
//   console.log("write operation completed")
// })

// fs.readFile('text1.txt',function(err,data){
//   if (err) {
//     console.log("some error")
//   }
//   console.log(data.toString())
// })

// let fs = require('fs');
// var data = "this is node js class";

// fs.writeFile('test.txt', data, funxtion(err)
// {
//         if(err) return console.error("error"),

//         console.log("write operation")
//     })

// let fss = require('fs');

// fss.readFile('test.txt', 'utf-8', function (err, data) {
//     if (err) return console.log("some error");
//     // console.log(data.toString());
//     console.log(data);
// })
// console.log('ok');

// // write data to file named export.txt
// const data = 'Hello World!';
// const fs = require('fs');
// fs.writeFile('export.txt', data, (err) => {
//     if (err) {
//         console.error(err.message);
//         return;
//     }
//     console.log('File saved');
// });


// // append more data to this file
// const moreData = '\nHello again!';
// fs.appendFile('export.txt', moreData, (err) => {
//     if (err) {
//         console.error(err.message);
//         return;
//     }
//     console.log('File updated');
// });

// // rename file to export.md
// fs.rename('export.txt', 'export.md', (err) => {
//     if (err) {
//         console.error(err.message);
//         return;
//     }
//     console.log('File renamed');
// });


// // copy file to export-copy.md
// fs.copyFile('export.md', 'export-copy.md', (err) => {
//     if (err) {
//         console.error(err.message);
//         return;
//     }
//     console.log('File copied');
// });