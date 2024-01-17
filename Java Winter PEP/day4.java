import java.lang.reflect.Constructor;

public class day4 {

}

// abstract class Fruit{
// Fruit(){
// System.out.println("Inside Fruit abstract class ");
// }
// abstract void printName();
// void taste(){
// System.out.println("The fruit is tasty...");
// }
// }

// class Apple extends Fruit{
// void printName(){
// System.out.println("The fruit is Apple");
// }

// public static void main(String[] args) {
// Fruit obj = new Apple();
// obj.printName();
// obj.taste();
// }
// }

// interface A{
// void a();
// void b();
// void c();
// }

// abstract class B implements A{
// public void c(){
// System.out.println("Inside c");
// }
// }

// class C extends B{
// public void a(){
// System.out.println("Inside a");
// }
// public void b(){
// System.out.println("Inside b");
// }
// }

// class Test{
// public static void main(String[] args) {
// A a = new C();
// a.a();
// a.b();
// a.c();
// }
// }

// interface print{
// void print();
// }

// interface show{
// void show();
// }

// class possible implements print,show{
// public void print(){
// System.out.println("print implemented");
// }
// public void show(){
// System.out.println("show implemented");
// }

// public static void main(String[] args) {
// possible p = new possible();
// p.print();
// p.show();
// }
// }

// interface Draw{
// void Draw();

// default void method1(){
// System.out.println("default method");
// }
// default void method2(){
// System.out.println("default method");
// }
// }

// class square implements Draw{
// public void Draw(){
// System.out.println("Drawing Square");
// }
// }

// class Test{
// public static void main(String[] args) {
// Draw d = new square();
// d.Draw();
// d.method1();
// }
// }

// interface Draw{
// void Draw();

// static void method1(){
// System.out.println("default method");
// }
// }

// class square implements Draw{
// public void Draw(){
// System.out.println("Drawing Square");
// }
// }

// class Test{
// public static void main(String[] args) {
// Draw d = new square();
// d.Draw();
// Draw.method1();
// }
// }

// class parent{}

// class child extends parent{}

// class test{
// parent p = new child(); //upcasting
// }

// class fruit{
// void taste(){
// System.out.println("fruit tastes good");
// }
// }

// class apple extends fruit{
// void taste(){
// System.out.println("apple taste good");
// }

// public static void main(String[] args) {
// fruit f = new fruit();
// f.taste();
// }
// }

// class fruit{
// int nof = 100;
// }

// class apple extends fruit{
// int nof = 50;

// public static void main(String[] args) {
// fruit f = new apple();
// System.out.println(f.nof);
// }
// }

// -----------Binding----------------------

// class Dog{
// int data = 2; // type of int
// private void bark(){
// System.out.println("dog is barking");
// }
// public static void main(String[] args) {
// Dog d = new Dog();
// d.bark();
// }
// }

// class AddNums{
// static int add(int a , int b){
// return (a+b);
// }
// static int add(int a , double b ){
// return (int)(a+b);
// }
// }
// class test{
// public static void main(String[] args) {
// System.out.println(AddNums.add(1, 1));
// System.out.println(AddNums.add(1, 1.0));
// }
// public static void main(String args) {
// System.out.println("hi");
// }
// public static void main() {
// System.out.println("hello");
// }
// }

// class AddNums{
// void add(int a , long b){
// System.out.println(a+b);
// }
// void add(int a , int b , int c ){
// System.out.println(a+b+c);
// }
// }
// class test{
// public static void main(String[] args) {
// AddNums add = new AddNums();
// add.add(1, 1);
// add.add(1, 1,1);
// }
// }

// class Employee{
// float salary = 40000;
// }
// class Programmer extends Employee{
// int bonus = 10000;
// public static void main(String[] args) {
// Programmer p = new Programmer();
// System.out.println(p.salary);
// System.out.println(p.bonus);
// }
// }

// class Animal{
// void eat(){

// }
// }

// class Dog extends Animal{
// void bark(){

// }
// }

// class Puppy extends Dog{
// void weep(){

// }
// }

class GrandFather {

}

class Father extends GrandFather {

}

class Son extends Father {

}

class Daughter extends Father {

}