// let fs = require('fs');
// fs.open('text.txt', 'r', function (err, fd) {
//     if (err) return console.log("error in opening file")
//     console.log("file opened")
//     let buffer = Buffer.alloc(21)
//     fs.read(fd, buffer, 0, 4, 5, function (err, bytesRead, buffer) {
//         if (err) return console.log(err)
//         console.log(buffer.toString())
//         console.log("Total bytes read: " + bytesRead)
//     })
//     fs.close(fd, function (err) {
//         if (err) return console.log(err)
//         console.log("file closed")
//     })
// });



let fs = require('fs');
fs.open('text.txt', 'r+', function (err, fd) {
    if (err) return console.log("error in opening file")
    console.log("file opened")
    let data = "hello world"
    fs.write(fd, data, function (err, written) {
        if (err) console.log("error writing");
        console.log('Written: ' + written + ' bytes');
    })
    fs.close(fd, function (err) {
        if (err) return console.log(err)
        console.log("file closed")
    })
});