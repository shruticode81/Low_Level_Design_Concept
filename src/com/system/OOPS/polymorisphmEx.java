package com.system.OOPS;



class Animal {
    void sayHello() {
        System.out.println("....");
    }
}

class Dog extends Animal {
    @Override
    void sayHello() {
        System.out.println("woff");
    }

    void eat() {
        System.out.println("eat biscuit");
    }
}
public class polymorisphmEx {
    public static void main(String args[]){
        Animal a = new Animal();

        a.sayHello();
        //upcasting
//        Dog d = new Animal();
        Animal d1 =  new Dog(); //upcasting
        Dog d2 = (Dog) d1; //(downcasting)

        d2.eat();
    }

}

