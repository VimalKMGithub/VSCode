package Access;

// There are only two type of access modifiers for classes: public and default (package-private) for top level classes
// If we don't specify any access modifier, it will be default (package-private) by default
class Vimal {
    // default access modifier (package-private) means it is visible for classes in
    // this package only
}

// public access modifier means it is visible everywhere in the project
// a java file can have only one public class and the name of the file should be
// the same as the name of the public class
public class TopClass {
}
