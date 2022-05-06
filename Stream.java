package reactions;

import java.util.stream.Collectors;

// Create a new class with a main method. Using the list of objects you created in the prior step.
public class Stream {

// note to self: don't need run method
    public static void main(String[] args) {
        new Stream().run();
    }

    private void run() {
// Create a Stream from the list of objects.  Print the resulting String.
        System.out.println(Severe.getSevere().stream()
// Turn the Stream of object to a Stream of String (use the map method for this).
                .map(Severe::toString)
// Sort the Stream in the natural order. (Note: The String class implements the Comparable interface, so you won't have to supply a Comparator to do the sorting.)
                .sorted()
// Collect the Stream and return a comma-separated list of names as a single String. Hint: use Collectors.joining(", ") for this.
                .collect(Collectors.joining(", ")));
    }

}