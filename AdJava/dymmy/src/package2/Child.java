package package2;

import package1.Parent;

public class Child extends Parent {

    public static void main(String[] args) {

        Child obj = new Child();

        System.out.println("===== Child.java =====");
        System.out.println();

        // PRIVATE
        System.out.println("Private:");
        System.out.println("Accessible: NO");
        System.out.println("Reason: Private members are accessible only inside Parent class.");
        // System.out.println(obj.privateVar);
        System.out.println();

        // DEFAULT
        System.out.println("Default:");
        System.out.println("Accessible: NO");
        System.out.println("Reason: Default members are accessible only within the same package.");
        // System.out.println(obj.defaultVar);
        System.out.println();

        // PROTECTED
        System.out.println("Protected:");
        System.out.println("Accessible: YES");
        System.out.println("Reason: Child is a subclass of Parent.");
        System.out.println("Value: " + obj.protectedVar);
        System.out.println();

        // PUBLIC
        System.out.println("Public:");
        System.out.println("Accessible: YES");
        System.out.println("Reason: Public members are accessible from anywhere.");
        System.out.println("Value: " + obj.publicVar);
    }
}
