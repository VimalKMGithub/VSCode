// Primitive data types:-
// String, number, boolean, NULL, Undefined,
// Symbol - ES6

// JS - Loosely typed language


//String data type
const courses = "Node js tutorial";
const courses1 = "67676767";
const courses2 = "Node js 'latest' tutorial";
const courses3 = 'Node js "latest" tutorial'; 
//const courses4 = "Node js "latest" tutorial";  // gives error
const courses5 = "Node js \"latest\" tutorial";
console.log(courses);
console.log(typeof courses);
console.log(courses1);
console.log(typeof courses1);
console.log(courses2);
console.log(typeof courses2);
console.log(courses3);
//console.log(courses4);
console.log(courses5);


//Number data types
const grades = -23.9;
console.log(grades);
console.log(typeof grades);


//BigInt
const grades1 = 8n+9n;
const grades2 = BigInt(2)
console.log(grades1);
console.log(grades2)
console.log(typeof grades1, typeof grades2);


//Boolean
const stat = false;
console.log(stat);
console.log(typeof stat);


//NULL
let total = null;
console.log(total);
console.log(typeof total);


//Undefined
let grace;
console.log(grace);
console.log(typeof grace);