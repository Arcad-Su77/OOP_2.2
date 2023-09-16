import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Инициализация данных
        List<Object> allStudent = new ArrayList<>();
        StudentService studentService = new StudentService();
        studentService.InitialStudent(allStudent);

        for (Object student : allStudent) {
            System.out.println(student.toString());
        }
        System.out.println("====================================================");

        for (int i = 1; i < allStudent.size(); i++) {
            studentService.compareSudent(allStudent.get(i-1), allStudent.get(i));
        }
        System.out.println("====================================================");
        Random random = new Random();
        studentService.compareMagic((Hogwarts) allStudent.get(random.nextInt(allStudent.size())),
                (Hogwarts) allStudent.get(random.nextInt(allStudent.size())));
    }
}