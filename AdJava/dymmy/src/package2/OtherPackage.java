package package2;

import package1.Parent;

public class OtherPackage {

    public static void main(String[] args) {

        Parent obj = new Parent();

        System.out.println("===== OtherPackage.java =====");
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
        System.out.println("Accessible: NO");
        System.out.println("Reason: OtherPackage is not a subclass of Parent and is in another package.");
        // System.out.println(obj.protectedVar);
        System.out.println();

        // PUBLIC
        System.out.println("Public:");
        System.out.println("Accessible: YES");
        System.out.println("Reason: Public members are accessible from anywhere.");
        System.out.println("Value: " + obj.publicVar);
    }
}
