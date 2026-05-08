import java.util.Scanner;

class NSalException extends Exception {
    public NSalException(String s) {
        super(s);
    }
}

class PSalException extends RuntimeException {
    public PSalException(String s) {
        super(s);
    }
}

class Employee {
    public void decideSal(String s1) throws NSalException, NumberFormatException {
        int sal = Integer.parseInt(s1);

        if (sal <= 0) {
            throw new NSalException("Invalid Salary");
        } else {
            throw new PSalException("Valid Salary");
        }
    }
}

public class Thirteen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        String input = sc.nextLine();

        try {
            Employee e = new Employee();
            e.decideSal(input);
        }
        catch (NumberFormatException nfe) {
            System.err.println("Please enter integer values.");
        }
        catch (NSalException no) {
            System.err.println("Negative Salary.");
        }
        catch (PSalException po) {
            System.err.println("Valid Positive Salary.");
        }
        finally {
            System.out.println("Finally Block executing");
        }

        sc.close();
    }
}
