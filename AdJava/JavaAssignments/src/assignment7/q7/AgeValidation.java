package assignment7.q7;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class AgeValidation {

    public static void agevalidation(int age) throws InvalidAgeException {

        if (age < 0) {
            throw new InvalidAgeException("Age should be positive");
        }
        else if (age < 18) {
            throw new InvalidAgeException("Not eligible for event");
        }
        else {
            System.out.println("Eligible for event");
        }
    }

    public static void main(String[] args) {

        try {
            agevalidation(15);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}