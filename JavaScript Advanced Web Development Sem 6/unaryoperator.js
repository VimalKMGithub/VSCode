/*delete*/
//Using delete with user defined object
const book={
bookname : "Harry Potter and the Prisoner of Azkaban",
publisher : "Bloomsburry",
numberOfCopies :100
}

console.log(book.bookname); // returns Harry Potter and the Prisoner of Azkaban
console.log(delete book.bookname); //returns true
console.log(book.bookname); // returns undefined

console.log(delete book); // returns false, can only delete properties

//Using with non-configurable properties
console.log(delete Math.PI); // returns false (cannot delete non-configurable properties)


/*typeof*/
// var myFun = new Function('5 + 2');
// var func = new Function('msg');
// var shape = 'round';
// var size = 1;
// var foo = ['Apple', 'Mango', 'Orange'];
// var today = new Date();

// console.log(typeof myFun);       // returns "function"
// console.log(typeof func);        // returns "function"
// console.log(typeof shape);       // returns "string"
// console.log(typeof size);        // returns "number"
// console.log(typeof foo);         // returns "object"
// console.log(typeof today);       // returns "object"
// console.log(typeof doesntExist); // returns "undefined"
// console.log(typeof Date);           // returns "function"
// console.log(typeof date);           // returns "undefined"
