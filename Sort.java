package reactions;

import java.util.List;

public class Sort {
// Create a main method to call the sort methods.
    public static void main(String[] args) {
        sortWithLambda();
        sortWithMethodReference();
    }

    public static void sortWithLambda() {
// Write a method to sort the objects using a Lambda expression using the compare method you created earlier. Print the list after sorting (System.out.println).
        List<Severe> severeList = Severe.getSevere();
        severeList.sort((s1, s2) -> Severe.compare(s1, s2));
        System.out.println("Lambda Sort: " + severeList);
    }

    public static void sortWithMethodReference() {
// Write a method to sort the objects using a Method Reference to the compare method you created earlier. Print the list after sorting (System.out.println).
        List<Severe> severeList = Severe.getSevere();
        severeList.sort(Severe::compare);
        System.out.println("Method Reference Sort: " + severeList);
    }

}
