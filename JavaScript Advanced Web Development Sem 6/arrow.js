// Traditional Anonymous Function
// hello = function (){
//     console.log("Hi");
//   }
// hello();


// 1. Remove the word "function" and place arrow between the argument and opening body bracket
// hello = ()=>{
//     console.log("Hi");
//   }
// hello();


// 2. Remove the body braces
// hello = ()=>console.log("Hi");
// hello();


// With traditional functions, we need return statement
// hello = function (){
//     return "hi";
//   }
// console.log(hello());


// With arrow functions, we can omit return statement as return statement is implicit in arrow functions
// hello = ()=>"Hi";
// console.log(hello());