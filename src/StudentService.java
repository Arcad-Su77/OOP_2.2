import java.util.List;

public class StudentService {
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
    void compareMagic(Hogwarts student1, Hogwarts student2) {
        if (student1.getMsConjure() > student2.getMsConjure()) {
            System.out.println(student1.getName() + " обладает бОльшей мощностью магии, чем " + student2.getName() + ".");
        } else {
            System.out.println(student2.getName() + " обладает бОльшей мощностью магии, чем " + student1.getName() + ".");
        }
    }

    void compareSudent(Object student1, Object student2) {
        if ((student1 instanceof Gryffindorr) &&
                (student2 instanceof Gryffindorr)) {
            ((Gryffindorr) student1).compareStudent((Gryffindorr) student2);
        }
        if ((student1 instanceof Hufflepuff) &&
                (student2 instanceof Hufflepuff)) {
            ((Hufflepuff) student1).compareStudent((Hufflepuff) student2);
        }
        if ((student1 instanceof Ravenclaw) &&
                (student2 instanceof Ravenclaw)) {
            ((Ravenclaw) student1).compareStudent((Ravenclaw) student2);
        }
        if ((student1 instanceof Slytherin) &&
                (student2 instanceof Slytherin)) {
            ((Slytherin) student1).compareStudent((Slytherin) student2);
        }
    }
}