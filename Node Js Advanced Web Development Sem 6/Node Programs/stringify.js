let fs = require('fs')
let student = {
    name: "Vimal",
    cgpa: 7.41,
    address: 'prayagraj'
}
// console.log(student)
// console.log(JSON.stringify(student))
// let student1 = JSON.stringify(student)
// let student1 = JSON.stringify(student, ['name', 'cgpa'])
// let student1 = JSON.stringify(student, ['name', 'cgpa'], 10)
let student1 = JSON.stringify(student, null, 10)
// console.log(typeof student1)
fs.writeFile('text.txt', student1, function (err) {
    if (err) {
        return console.error("error writing into this file")
    }
    console.log("write operation completed")
})