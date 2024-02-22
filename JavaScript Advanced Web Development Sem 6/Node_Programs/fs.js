
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

const fs = require('fs');

try {
  let data = fs.readFileSync('text.txt');
  console.log(data.toString());
  console.log("File read successfully!");
} catch (error) {
  console.error("Error reading the file:", error.message);
}
console.log("Hey, this is the end.");