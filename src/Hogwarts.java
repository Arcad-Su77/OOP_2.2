import java.util.List;

public class Hogwarts {
    void InitialStudent(List<Object> allStudent) {
        allStudent.add(new Gryffindorr("Harri", "Potter"));
        allStudent.add(new Gryffindorr("Hermione", "Granger"));
        allStudent.add(new Gryffindorr("Ron", "Weasley"));

        allStudent.add(new Hufflepuff("Zachariah", "Smith"));
        allStudent.add(new Hufflepuff("Cedric", "Diggory"));
        allStudent.add(new Hufflepuff("Justin", "Finch-Fletchley"));

        allStudent.add(new Ravenclaw("Zhou", "Chang"));
        allStudent.add(new Ravenclaw("Padma", "Patil"));
        allStudent.add(new Ravenclaw("Marcus", "Belby"));

        allStudent.add(new Slytherin("Draco", "Malfoy"));
        allStudent.add(new Slytherin("Graham", "Montague"));
        allStudent.add(new Slytherin("Gregory", "Goyle"));
    }

    public static void compareMagic(Student student1, Student student2) {
        if (student1.getMsConjure()> student2.getMsConjure()) {
            System.out.println(student1.getName() + " обладает бОльшей мощностью магии, чем " + student2.getName() + ".");
        } else {
            System.out.println(student2.getName() + " обладает бОльшей мощностью магии, чем " + student1.getName() + ".");
        }
    }

     static void compareStudent(Object student1, Object student2) {
        System.out.println("Общий метод!");
    }


}
