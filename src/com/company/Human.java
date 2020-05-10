package src.com.company;
public class Human {
    int age;
String name;


Human () {
    this.age = 18;
    this.name = "Kostya";

}
Human (String name) {
    this.name = name;
    age = 32;

}

Human (int age, String name) {
    this.name = name;
    this.age = age;
}


public void Object() {
    System.out.println (name);
    System.out.println (age);
}

public static void main(String[] args) {
    Human unknown = new Human();
    Human neighbor = new Human ("Timofey");
    Human classmate = new Human (17, "Yana");

unknown.Object();
neighbor.Object();
classmate.Object();

}
}