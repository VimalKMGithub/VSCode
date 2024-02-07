//Symbol
let sym1 = Symbol()
let sym2 = Symbol('foo')
let sym3 = Symbol('foo')

// The above code creates three new Symbols. Note that Symbol("foo") does not coerce the string "foo" into a Symbol. It creates a new Symbol each time:
console.log(sym2===sym3)

// Symbol()
// Creates a new Symbol object. It is incomplete as a constructor because it does not support the syntax "new Symbol()".
const k1 = Symbol("First Name");
const k2 = Symbol("Last Name");
myobj = {};
myobj[k1] = "Olivia";
myobj[k2] = "Rose";
myobj["k2"] = "Mitchell";
console.log(myobj);
console.log(myobj[k1]);
console.log(myobj[k2]);
console.log(myobj.k2); // it is just like using myobj["k2"]


//Symbols are ignored in for in loop in browser
for(key in myobj)
{
    console.log(key, myobj[key])
}
