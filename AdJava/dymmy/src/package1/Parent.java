package package1;

public class Parent {

    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;

    public static void main(String[] args) {

        Parent obj = new Parent();

        System.out.println("===== Parent.java =====");
        System.out.println();

        // PRIVATE
        System.out.println("Private:");
        System.out.println("Accessible: YES");
        System.out.println("Reason: We are accessing it inside the same class.");
        System.out.println("Value: " + obj.privateVar);
        System.out.println();

        // DEFAULT
        System.out.println("Default:");
        System.out.println("Accessible: YES");
        System.out.println("Reason: We are accessing it inside the same class.");
        System.out.println("Value: " + obj.defaultVar);
        System.out.println();

        // PROTECTED
        System.out.println("Protected:");
        System.out.println("Accessible: YES");
        System.out.println("Reason: We are accessing it inside the same class.");
        System.out.println("Value: " + obj.protectedVar);
        System.out.println();

        // PUBLIC
        System.out.println("Public:");
        System.out.println("Accessible: YES");
        System.out.println("Reason: Public members are accessible from anywhere.");
        System.out.println("Value: " + obj.publicVar);
    }
}
