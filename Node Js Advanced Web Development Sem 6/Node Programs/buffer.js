// const buf1=Buffer.from('buffer')
// const buf2=Buffer.from(buf1)
// console.log(buf1.toString())
// console.log(buf2)




// var buffer1 = Buffer.from('wow');
// var buffer2 = Buffer.alloc(7);
// buffer1.copy(buffer2);
// console.log("buffer2: " + buffer2.toString());




// // Create two `Buffer` instances.
// const buf1 = Buffer.alloc(26).fill('aquickbrownfoxjumpsoverthelazydog');
// const buf2 = Buffer.alloc(26).fill('?');
// buf1.copy(buf2, 8, 16, 20);
// console.log(buf2.toString('utf8', 0, 25));
// // Prints: ????????mpso?????????????





// const buf1 = Buffer.from('ABC');
// const buf2 = Buffer.from('414243', 'hex');
// const buf3 = Buffer.from('ABCD');
// console.log(buf1.equals(buf2));
// // Prints: true
// console.log(buf1.equals(buf3));
// // Prints: false






// var buffer1 = Buffer.from('Classofnodejs');
// var buffer2 = buffer1.slice(0, 7);
// console.log("buffer2 content: " + buffer2.toString());





// var buffer = Buffer.from('This is node.js class');
// console.log(buffer.length);





// const buf = Buffer.from('this is a buffer');
// console.log(buf.includes('this'));
// // Prints: true
// console.log(buf.includes('is'));
// // Prints: true
// console.log(buf.includes(Buffer.from('a buffer')));
// // Prints: true
// console.log(buf.includes(97));
// // Prints: true (97 is the decimal ASCII value for 'a')