package reactions;

import java.util.ArrayList;
import java.util.List;

// Create a class of whatever type you want (Animal, Person, Camera, Cheese, etc.). Do not implement the Comparable interface.
public class Severe {

    private String severe;

// Add a name instance variable so that you can tell the objects apart. Create a static list of these objects, adding at least 4 objects to the list.
    public static List<Severe> severity = new ArrayList<>(List.of(
            new Severe("esophageal stricture"),
            new Severe("esophageal ulceration"),
            new Severe("tardive dyskinesia"),
            new Severe("laryngeal edema")));

    public Severe(String severe) {
        this.severe = severe;
    }

// Add getters, setters and/or a constructor as appropriate.
    public static List<Severe> getSevere() {
        return severity;
    }

// Add a toString method that returns the name AND object type (like "Pentax Camera").
    @Override
    public String toString() {
        return ("Severe Adverse Reaction: " + severe);
    }

// Create a static method named compare in the parameters. Return -1 if parameter 1 is "less than" parameter 2. Return 1 if parameter 1 is "greater than" parameter 2. Return 0 if the two parameters are "equal".
    public static int compare(Severe s1, Severe s2) {
        return s1.severe.compareTo(s2.severe);
    }

}