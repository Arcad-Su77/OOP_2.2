import java.util.Objects;
import java.util.Random;

public class Gryffindorr extends Hogwarts {
    private final String facultet = "GRYFFINDORR";
    private int skillRate;
    private int fsHonor;
    private int fsBraveness;
    private int fsNobleness;

      public Gryffindorr(String nameOne, String nameTwo) {
        super(nameOne, nameTwo);
        Random random = new Random();
        this.fsHonor = random.nextInt(100);
        this.fsBraveness = random.nextInt(100);
        this.fsNobleness = random.nextInt(100);
        updateSkillRate();
    }
    public int getFsHonor() {
        return fsHonor;
    }

    public void setFsHonor(int fsHonor) {
        if (fsHonor >= 0 && fsHonor <= 100) {
            this.fsHonor = fsHonor;
            updateSkillRate();
        }
    }
    public int getFsBraveness() { return fsBraveness; }
    public void setFsBraveness(int fsBraveness) {
        if (fsBraveness >= 0 && fsBraveness <= 100) {
            this.fsBraveness = fsBraveness;
            updateSkillRate();
        }
    }
    public int getFsNobleness() { return fsNobleness; }
    public void setFsNobleness(int fsNobleness) {
        if (fsNobleness >= 0 && fsNobleness <= 100) {
            this.fsNobleness = fsNobleness;
            updateSkillRate();
        }
    }
    public int getSkillRate() {
        return skillRate;
    }
    public void updateSkillRate() {
        this.skillRate = fsBraveness+fsHonor+fsNobleness;
    }
    @Override
    public String toString() {
        return " " + getNameOne() + " " + getNameTwo() + " " + facultet +
                "\n\tConjure:" + getMsConjure() +
                " Transgress:" + getMsTransgress() +
                "\n\tskill Gryffindorr SkillRate:" + getSkillRate() +" {" +
                "honor:" + getFsHonor() +
                ", braveness:" + getFsBraveness() +
                ", nobleness:" + getFsNobleness() +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(facultet);
    }

    @Override
    public void compareStudent(Gryffindorr student1) {
        if (student1.getSkillRate() > this.getSkillRate()) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }
    }

}
