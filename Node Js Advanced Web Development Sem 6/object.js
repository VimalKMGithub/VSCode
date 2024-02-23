//object literal
/*When you have a small number of properties that can be defined at the time of object creation.*/
    // let student = {
    //     name:"Rakesh",
    //     roll:19,
    //     marks:34,
    //     intro: function(){
    //         //  console.log(this.name + ", bearing roll no. "+this.roll+" has scored "+ this.marks);   
    //         console.log(`${this.name} bearing roll no. ${this.roll} has scored ${this.marks}`); 
    //     }
    // }
    // console.log(student.name);
    // console.log(student.roll);
    // console.log(student.marks);
    // student.intro();

    // let student = {}
    // student.name="Rakesh",
    // student.roll = 19,
    // student.marks=34,
    // student.intro=function(){
    //         //  console.log(this.name + ", bearing roll no. "+this.roll+" has scored "+ this.marks);   
    //         console.log(`${this.name} bearing roll no. ${this.roll} has scored ${this.marks}`); 
    //     }
    // console.log(student["name"]);
    // console.log(student.roll);
    // console.log(student.marks);
    // student.intro();

//Object constructor
/*When you need to create an object dynamically, adding properties and methods after the initial object creation.*/
    // let student = new Object();
    // student.name="Rakesh",
    // student.roll = 19,
    // student.marks=34,
    // student.intro=function(){
    //         //  console.log(this.name + ", bearing roll no. "+this.roll+" has scored "+ this.marks);   
    //         console.log(`${this.name} bearing roll no. ${this.roll} has scored ${this.marks}`); 
    //     }
    // console.log(student["name"]);
    // console.log(student.roll);
    // console.log(student.marks);
    // student.intro();

//Object.create()
/*When you want to create an object with a specific prototype or when implementing prototypal inheritance.*/
    // let studentPrototype={
    //     cgpa:9
    // }
    // let student = Object.create(studentPrototype);
    // student.name="Rakesh";
    // student.roll = 19;
    // student.marks=34;
    // console.log(student.name);
    // console.log(student.roll);
    // console.log(student.marks);
    // console.log(student.cgpa);

//Constructor function
/*Similar to classes, used for creating constructor functions with methods. Can be an alternative to classes, especially in older JavaScript code.*/
    // function Student(name, roll, marks){
    //     this.name = name;
    //     this.roll = roll;
    //     this.marks = marks;
    // }
    // let student = new Student('Rakesh', 19, 34);
    // let student1 = new Student('Ajay', 10, 37);
    // console.log(student.name);
    // console.log(student.roll);
    // console.log(student.marks);
    // console.log(student1.name);
    // console.log(student1.roll);
    // console.log(student1.marks);

// class
/*When you prefer a more structured and class-based syntax. Useful for creating constructor functions with methods.*/
    // class Student{
    //     constructor(name, roll,  marks){
    //     this.name = name;
    //     this.roll = roll;
    //     this.marks = marks;
    //     }
    // }
    // let student = new Student('Rakesh', 19, 34);
    // console.log(student.name);

    // class Student{
    //     name = '';
    //     roll = '';
    //     marks = '';
    // }
    // let student = new Student();
    // student.name = 'Rakesh';
    // student.roll = 19;
    // student.marks = 34;
    // console.log(student);

//Factory functions
/*When you want to create and return new objects with encapsulated logic.*/
    // function Student(name, roll, marks){
    //     return{
    //     name : name,
    //     roll : roll,
    //     marks : marks
    //     }
    // }
    // let student = Student('Rakesh', 19, 34)
    // console.log(student.name)
    // console.log(student.roll)
    // console.log(student.marks)
    
// Object.assign()
/*When you want to copy properties from one or more source objects into a target object.*/
    // let studentInfo={
    //     name:"Rakesh",
    //     roll:19,
    //     marks:34
    // }
    // let studentMethods={
    //     intro:function(){
    //         console.log(`${this.name} bearing roll no. ${this.roll} has scored ${this.marks}`); 
    //     }
    // }
    // let student = Object.assign({}, studentInfo, studentMethods);
    // console.log(student);