/*The following code shows examples of the && (logical AND) operator */
console.log(true && true);     // t && t returns true
console.log(true && false);    // t && f returns false
console.log(false && true);     // f && t returns false
console.log(false && (3 == 4)); // f && f returns false
console.log('Cat' && 'Dog');    // t && t returns Dog
console.log(false && 'Cat');    // f && t returns false
console.log('Cat' && false);    // t && f returns false

/*The following code shows examples of the || (logical OR) operator.*/
console.log(true || true);     // t || t returns true
console.log(false || true);     // f || t returns true
console.log(true || false);    // t || f returns true
console.log(false || (3 == 4)); // f || f returns false
console.log('Cat' || 'Dog');    // t || t returns Cat
console.log(false || 'Cat');    // f || t returns Cat
console.log('Cat' || false);    // t || f returns Cat

/*The following code shows examples of the ! (logical NOT) operator. */
console.log(!true);  // !t returns false
console.log(!false); // !f returns true
console.log(!'Cat'); // !t returns false