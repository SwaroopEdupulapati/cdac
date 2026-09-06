package package1;

public class SamePackage {

    public static void main(String[] args) {

        Parent obj = new Parent();

        System.out.println("===== SamePackage.java =====");
        System.out.println();

        // PRIVATE
        System.out.println("Private:");
        System.out.println("Accessible: NO");
        System.out.println("Reason: Private members are accessible only inside Parent class.");
        // System.out.println(obj.privateVar);
        System.out.println();

        // DEFAULT
        System.out.println("Default:");
        System.out.println("Accessible: YES");
        System.out.println("Reason: SamePackage is in the same package as Parent.");
        System.out.println("Value: " + obj.defaultVar);
        System.out.println();

        // PROTECTED
        System.out.println("Protected:");
        System.out.println("Accessible: YES");
        System.out.println("Reason: SamePackage is in the same package as Parent.");
        System.out.println("Value: " + obj.protectedVar);
        System.out.println();

        // PUBLIC
        System.out.println("Public:");
        System.out.println("Accessible: YES");
        System.out.println("Reason: Public members are accessible from anywhere.");
        System.out.println("Value: " + obj.publicVar);
    }
}
