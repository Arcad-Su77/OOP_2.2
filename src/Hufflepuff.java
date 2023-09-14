import java.util.Random;

public class Hufflepuff extends Student {
    private int skillRate;
    private int fsIndustrious;
    private int fsCorrect;
    private int fsHonest;


    public Hufflepuff(String nameOne, String nameTwo) {
        super(nameOne, nameTwo);
        Random random = new Random();
        this.fsCorrect = random.nextInt(100);
        this.fsHonest = random.nextInt(100);
        this.fsIndustrious = random.nextInt(100);
        updateSkillRate();
    }

    @Override
    public void compareStudent(Gryffindorr student1, Gryffindorr student2) {

    }

    @Override
    public String toString() {
        return " " + getNameOne() + " " + getNameTwo() +
                "\nConjure:" + getMsConjure() +
                " Transgress:" + getMsTransgress() +
                "\tskill Hufflepuff SkillRate:" + getSkillRate() +" {" +
                "Honest:" + getFsHonest() +
                ", Correct:" + getFsCorrect() +
                ", Industrious:" + getFsIndustrious() +
                '}';
    }

    public int getFsIndustrious() {
        return fsIndustrious;
    }

    public void setFsIndustrious(int fsIndustrious) {
        this.fsIndustrious = fsIndustrious;
        updateSkillRate();
    }

    public int getFsCorrect() {
        return fsCorrect;
    }

    public void setFsCorrect(int fsCorrect) {
        this.fsCorrect = fsCorrect;
        updateSkillRate();
    }

    public int getFsHonest() {
        return fsHonest;
    }

    public void setFsHonest(int fsHonest) {
        this.fsHonest = fsHonest;
        updateSkillRate();
    }
    public int getSkillRate() {
        return skillRate;
    }
    public void updateSkillRate() { this.skillRate = fsCorrect+fsHonest+fsIndustrious; }

    @Override
    public void compareStudent(Hufflepuff student1, Hufflepuff student2) {
        if (student1.getSkillRate() > student2.getSkillRate()) {
            System.out.println(student1.getName() + " лучший Пуффендуй, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Пуффендуй, чем " + student1.getName());
        }
    }

    @Override
    public void compareStudent(Ravenclaw student1, Ravenclaw student2) {

    }

    @Override
    public void compareStudent(Slytherin student1, Slytherin student2) {

    }
}
