/*---------------------- Array destructuring-----------------------*/
// without destructuring
// var foo = ["One", "Two", "Three"]
// var one   = foo[0];
// var two   = foo[1];
// var three = foo[2];
// console.log(one);
// console.log(two);
// console.log(three);


// with destructuring
// var foo = ["One", "Two", "Three"]
// var [one, two, three] = foo;
// console.log(one);
// console.log(two);
// console.log(three);


// Skipping Items in an Array
// var foo = ["One", "Two", "Three", "four"]
// var [one,,three] = foo;
// var [one,,,four] = foo;
// console.log(one);
// console.log(three);
// console.log(four);

/*---------------------- Object destructuring-----------------------*/
// without destructuring
// let book={
// bookname : "Harry Potter and the Prisoner of Azkaban",
// publisher : "Bloomsburry",
// numberOfCopies :100
// }
// let bookname = book.bookname;
// let publisher = book.publisher;
// let numberOfCopies = book.numberOfCopies;
// console.log(bookname);
// console.log(publisher);
// console.log(numberOfCopies);


// with destructuring
// let book={
// bookname : "Harry Potter and the Prisoner of Azkaban",
// publisher : "Bloomsburry",
// numberOfCopies :100
// }
// let {bookname, publisher, numberOfCopies} = book;
// console.log(bookname);
// console.log(publisher);
// console.log(numberOfCopies);


// with destructuring(another way- different variable names)
// let book={
// bookname : "Harry Potter and the Prisoner of Azkaban",
// publisher : "Bloomsburry",
// numberOfCopies :100
// }
// let {bookname:nameofbook, publisher:publisherofbook, numberOfCopies:totalcopies} = book;
// console.log(nameofbook);
// console.log(publisherofbook);
// console.log(totalcopies);