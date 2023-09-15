import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Инициализация данных
        List<Object> allStudent = new ArrayList<>();
        Hogwarts hogwarts = new Hogwarts();
        hogwarts.InitialStudent(allStudent);

        for (Object student : allStudent) {
            System.out.println(student.toString());
        }

        for (int i = 1; i < allStudent.size(); i++) {
            if (allStudent.get(i-1).getClass()==allStudent.get(i).getClass()) {
                Hogwarts.compareStudent((Object) allStudent.get(i-1), (Object) allStudent.get(i));
            }
        }
        Random random = new Random();
        Hogwarts.compareMagic((Student) allStudent.get(random.nextInt(allStudent.size())),
                (Student) allStudent.get(random.nextInt(allStudent.size())));


    }
}