var zlib = require('zlib');
var fs = require('fs');
var gzip = zlib.createGzip();
var r = fs.createReadStream('text.txt')
var w = fs.createWriteStream('text.txt.gz')
r.pipe(gzip).pipe(w)