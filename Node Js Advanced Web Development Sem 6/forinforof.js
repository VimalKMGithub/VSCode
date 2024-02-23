/*iterate through an object using for loop*/
console.log("---------------iterate through an object using for loop------------------")
let book = {
    name: "C++",
    publisher: "Tata McGraw Hill",
    author: " E Balagurusamy"
}
for (let index = 0; index < Object.keys(book).length; index++) {
    const item = book[Object.keys(book)[index]];
    console.log(item);   
}

/*iterate through an object using for in loop*/
console.log("---------------iterate through an object using for in loop------------------")
for (let key in book){
// if(key =="publisher"){
//     break;
// }
    console.log(book[key]);
}

/*iterate through a string using for in loop*/
console.log("---------------iterate through a string using for in loop------------------")
myString = "Node js";
for (let char in myString){
    console.log(myString[char]);
}

/*iterate through an array using for loop*/
console.log("---------------iterate through an array using for loop----------------");
let courses = ["C++", "React js", "Node js", "JavaScript", "HTML"];
for (let index = 0; index < courses.length; index++) {
    const course = courses[index];
    console.log(course);   
}

/*iterate through an array using for of loop*/
console.log("-------------------iterate through an array using for of loop----------------")
for(let name of courses){
    console.log(name);
}

/*iterate through a string using for of loop*/
console.log("-----------------iterate through a string using for of loop----------------")
for(let name of myString){
    console.log(name);
}

/*Iterate through array of objects*/
const users = [  
    { id: 1, name: 'Marcus' },
    { id: 2, name: 'Norman' },
    { id: 3, name: 'Christian' }
  ]
  
  for (const user of users) {  
    // if (user.id === 2) {
    //   break            
    // }
    console.log(user)
  }
  
