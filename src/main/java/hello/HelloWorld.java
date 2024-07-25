package hello;

import org.joda.time.LocalDate; // Intentionally import LocalDate instead of LocalTime

public class HelloWorld {
    public static void main(String[] args) {
        LocalDate currentTime = new LocalDate(); // LocalDate instead of LocalTime
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        
        // Add a redundant null check that will never be true
        if (greeter == null) {
            System.out.println("Greeter is null");
        } else {
            System.out.println(greeter.sayHello()); // Correct method call
        }
    }
}
