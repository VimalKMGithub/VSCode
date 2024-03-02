// let zlib = require('zlib');
// let data = "This is a test";
// zlib.gzip(data, (err, buffer) => {
//     if (err) {
//         return console.log(err)
//     }
//     console.log(buffer.toString())
// })
// console.log("Data has been compressed")









let zlib = require('zlib');
let data = "This is a test";
zlib.gzip(data, (err, buffer) => {
    if (err) {
        return console.log(err)
    }
    console.log(buffer.toString())

    zlib.gunzip(buffer, (err2, buffer2) => {
        if (err) {
            return console.log(err2)
        }
        console.log(buffer2.toString())
    })
})