// Arrays
var trees = ['redwood', 'bay', 'cedar', 'oak', 'maple'];
console.log(0 in trees);        // returns true
console.log(3 in trees);        // returns true
console.log(6 in trees);        // returns false
console.log('bay' in trees);    // returns false (you must specify the index number,
                   // not the value at that index)
console.log('length' in trees); // returns true (length is an Array property)

// built-in objects
console.log('PI' in Math);          // returns true
var myString = new String('coral');
console.log('length' in myString);  // returns true

// Custom objects
var mycar = { make: 'Honda', model: 'Accord', year: 1998 };
console.log('make' in mycar);  // returns true
console.log('model' in mycar); // returns true

const details={
    bookname:"Harry Potter",
    publisher:"Bloomsburry",
    noofCopies:100
    }
console.log('bookname' in details); // returns true
console.log('publisher' in details); // returns true
console.log('author' in details); // returns false
console.log('Bloomsburry' in details); // returns false