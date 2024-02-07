// a=12;
// c=23;
// d=90;
// console.log(a);
// try {
//     console.log(b);  
// } catch (error) {
//    console.log("Handled :"+error); 
// }
// // finally{
// // console.log(b=89);
// // }

// console.log(c);
// console.log(d);

try{
    if(9>8){
        throw "thrown";
    }
}
catch(error){
    console.log("caught : "+error);
}