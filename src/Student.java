import java.util.Random;

public abstract class Student {
    private int msConjure;
    private int msTransgress;
    private String nameOne;
    private String nameTwo;

    public Student(String nameOne, String nameTwo) {
        this.nameOne = nameOne;
        this.nameTwo = nameTwo;
        Random random = new Random();
        this.setMsConjure(random.nextInt(100));
        this.setMsTransgress(random.nextInt(100));
    }
    public String getName() { return nameOne + " " + nameTwo; }
    public String getNameOne() {
        return nameOne;
    }

    public void setNameOne(String nameOne) {
        this.nameOne = nameOne;
    }

    public String getNameTwo() {
        return nameTwo;
    }

    public void setNameTwo(String nameTwo) {
        this.nameTwo = nameTwo;
    }

    public int getMsConjure() { return msConjure; }

    public void setMsConjure(int msConjure) { this.msConjure = msConjure; }

    public int getMsTransgress() {
        return msTransgress;
    }

    public void setMsTransgress(int msTransgress) {
        this.msTransgress = msTransgress;
    }

    public abstract void compareStudent(Gryffindorr student1, Gryffindorr student2);

    public abstract void compareStudent(Hufflepuff student1, Hufflepuff student2);

    public abstract void compareStudent(Slytherin student1, Slytherin student2);

    public abstract void compareStudent(Ravenclaw student1, Ravenclaw student2);

}
