var { URL } = require('url');
var adr = 'http://localhost:8000/default.htm?name=Raj&Age=20';
var q = new URL(adr);// This line of code creates a new instance of the URL object by calling its constructor with the argument adr
console.log(q.protocol); // returns 'http:'
console.log(q.hostname); // returns 'localhost'
console.log(q.port); // returns '8000'
console.log(q.host); // returns 'localhost:8000'
console.log(q.pathname); // returns '/default.htm'
console.log(q.search); // returns '?name=Raj&Age=20'
console.log(q.href); // returns 'http://localhost:8000/default.htm?name=Raj&Age=20'
console.log(q.searchParams.get('name')); // returns 'Raj'
console.log(q.searchParams.get('Age')); // returns '20'