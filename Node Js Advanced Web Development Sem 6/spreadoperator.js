// console.log(Math.min(8, 4, 5, 6, 7));
// const temperatures = [7, 5, 6, 9];
// console.log(Math.min(...temperatures));

// const courses1 = ["HTML", "CSS", "JavaScript"];
// const courses2 = ["Node js", "Java"];
// // const courses = [courses1, courses2];
// const courses = [...courses1, ...courses2];
// console.log(courses);

// Copying an array
// let fruits = ['Apple', 'Orange', 'Banana'];
// let newFruitArray = [...fruits];
// console.log(newFruitArray); // ['Apple','Orange','Banana']

// Concatenating arrays
// let arr1 = ['A', 'B', 'C'];
// let arr2 = ['X', 'Y', 'Z'];
// let result = [...arr1, ...arr2];
// console.log(result)

// copy concept
// const o = ["HTML", "CSS", "JavaScript"];
// const c = o; //now use c=[...o]
// c.push("Node js");
// console.log(c);
// console.log(o);

// Spreading elements together with an individual element
// let fruits1 = ['Apple', 'Orange', 'Banana'];
// let newFruits = ['Cherry', ...fruits1];
// console.log(newFruits);

// Spread operator with objects
let book = {
  bookname: "Harry Potter and the Prisoner of Azkaban",
  publisher: "Bloomsburry",
  numberOfCopies: 100
}
let updatebook = {
  bookname1: "The shining",
  publisher1: "Stephen King",
  numberOfCopies1: 200
}
const myUpdatedBook = { ...book, ...updatebook }
console.log(myUpdatedBook);

// add numbers of the array
function sum(x, y, z) {
  return x + y + z;
}
const numbers = [1, 2, 3];
console.log(sum(...numbers));