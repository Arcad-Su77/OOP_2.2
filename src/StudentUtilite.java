import java.util.List;

public class StudentUtilite {
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
}