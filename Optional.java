package reactions;

import java.util.NoSuchElementException;

// Create a new class with a main method.
public class Optional {

    public static void main(String[] args) {
        new Optional().run();
    }

// Create another method (Method B/Run) that calls Method A/Severe Method with an object wrapped by an Optional.
// Show that the object is returned unwrapped from the Optional (i.e., print the object).

    private void run() {
        Severe severe = severeMethod(java.util.Optional.of(new Severe("blepharospasm")));
        System.out.println("Uh oh " + severe + " shouldn't be a severe reaction!");

        try {
// Method B/Run should also call Method A/Severe with an empty Optional. Show that a NoSuchElementException is thrown
// by Method A/Severe by printing the exception message. Hint: catch the NoSuchElementException as parameter named "e"
// and do System.out.println(e.getMessage()).
            severeMethod(java.util.Optional.empty());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

// Create a method (Method A/Severe Method) that accepts an Optional of some type of Animal, Person, Camera, etc.).
// The method should return the object unwrapped from the Optional if the object is present. For example, if you have an object of type Cheese, your method signature should look something like this: public Cheese cheesyMethod(Optional<Cheese> optionalCheese) {...}
    private Severe severeMethod (java.util.Optional<Severe> severeOptional) {
// Note: your method should handle the Optional as shown in the video on Optionals using the orElseThrow method. For the missing object, you must use a Lambda expression in orElseThrow to return a NoSuchElementException with a custom message.
        return severeOptional.orElseThrow(
// The method should throw a NoSuchElementException with a custom message if the object is not present.
            () -> new NoSuchElementException("That adverse reaction does not exist!"));
    }

}