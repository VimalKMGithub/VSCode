const fs = require('fs');

try {
  let data = fs.readFileSync('text.txt');
  console.log(data.toString());
  console.log("File read successfully!");
} catch (error) {
  console.error("Error reading the file:", error.message);
}
console.log("Hey, this is the end.");