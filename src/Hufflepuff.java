import java.util.Random;

public class Hufflepuff extends Hogwarts {
    private final String facultet = "HUFFLEPUFF";
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
    public String toString() {
        return " " + getNameOne() + " " + getNameTwo() + " " + facultet +
                "\n\tConjure:" + getMsConjure() +
                " Transgress:" + getMsTransgress() +
                "\n\tskill Hufflepuff SkillRate:" + getSkillRate() +" {" +
                "Honest:" + getFsHonest() +
                ", Correct:" + getFsCorrect() +
                ", Industrious:" + getFsIndustrious() +
                '}';
    }

    public int getFsIndustrious() {
        return fsIndustrious;
    }

    public void setFsIndustrious(int fsIndustrious) {
        if (fsIndustrious >= 0 && fsIndustrious <= 100) {
            this.fsIndustrious = fsIndustrious;
            updateSkillRate();
        }
    }

    public int getFsCorrect() { return fsCorrect; }

    public void setFsCorrect(int fsCorrect) {
        if (fsCorrect >= 0 && fsCorrect <= 100) {
            this.fsCorrect = fsCorrect;
            updateSkillRate();
        }
    }

    public int getFsHonest() { return fsHonest; }

    public void setFsHonest(int fsHonest) {
        if (fsHonest >= 0 && fsHonest <= 100) {
            this.fsHonest = fsHonest;
            updateSkillRate();
        }
    }
    public int getSkillRate() {
        return skillRate;
    }
    public void updateSkillRate() { this.skillRate = fsCorrect+fsHonest+fsIndustrious; }

    public void compareStudent(Hufflepuff student1) {
        if (student1.getSkillRate() > this.getSkillRate()) {
            System.out.println(student1.getName() + " лучший Пуффендуй, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Пуффендуй, чем " + student1.getName());
        }
    }

}
