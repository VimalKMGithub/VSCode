//rest operator with array
const [course1, ...restofcourses] = ['Node js', 'HTML', 'JavaScript', 'CSS'];
console.log(course1)
console.log(restofcourses)

//rest operator with object
const book={
bookname:'Node js basics',
publisher:'TMH',
CopiesBought:200,
CopiesLeft:100
}
const{bookname, publisher, ...Copies} = book;
console.log(Copies);
