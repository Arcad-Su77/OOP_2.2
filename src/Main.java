import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Инициализация данных
        List<Object> allStudent = new ArrayList<>();
        StudentUtilite studentUtilite = new StudentUtilite();
        studentUtilite.InitialStudent(allStudent);

        for (Object student : allStudent) {
            System.out.println(student.toString());
        }
        System.out.println("====================================================");

        for (int i = 1; i < allStudent.size(); i++) {
            if ((allStudent.get(i) instanceof Gryffindorr) &&
                    (allStudent.get(i-1) instanceof Gryffindorr)) {
                ((Gryffindorr) allStudent.get(i - 1)).compareStudent((Gryffindorr) allStudent.get(i));
            }
            if ((allStudent.get(i) instanceof Hufflepuff) &&
                    (allStudent.get(i-1) instanceof Hufflepuff)) {
                ((Hufflepuff) allStudent.get(i - 1)).compareStudent((Hufflepuff) allStudent.get(i));
            }
            if ((allStudent.get(i) instanceof Ravenclaw) &&
                    (allStudent.get(i-1) instanceof Ravenclaw)) {
                ((Ravenclaw) allStudent.get(i - 1)).compareStudent((Ravenclaw) allStudent.get(i));
            }
            if ((allStudent.get(i) instanceof Slytherin) &&
                    (allStudent.get(i-1) instanceof Slytherin)) {
                ((Slytherin) allStudent.get(i - 1)).compareStudent((Slytherin) allStudent.get(i));
            }
        }
        System.out.println("====================================================");
        Random random = new Random();
        Hogwarts.compareMagic((Hogwarts) allStudent.get(random.nextInt(allStudent.size())),
                (Hogwarts) allStudent.get(random.nextInt(allStudent.size())));
    }
}