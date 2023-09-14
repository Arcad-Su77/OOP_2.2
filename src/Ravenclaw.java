import java.util.Random;

public class Ravenclaw extends Student {
    private int fsSmart;
    int fsWise;
    int fsWitty;
    int fsCreativity;
    private int skillRate;

    public Ravenclaw(String nameOne, String nameTwo) {
        super(nameOne, nameTwo);
        Random random = new Random();
        this.fsCreativity = random.nextInt(75);
        this.fsSmart = random.nextInt(75);
        this.fsWise = random.nextInt(75);
        this.fsWitty = random.nextInt(75);
        updateSkillRate();
    }

    @Override
    public void compareStudent(Gryffindorr student1, Gryffindorr student2) {

    }

    @Override
    public void compareStudent(Hufflepuff student1, Hufflepuff student2) {

    }

    public int getFsSmart() {
        return fsSmart;
    }

    public void setFsSmart(int fsSmart) {
        this.fsSmart = fsSmart;
        updateSkillRate();
    }

    public int getFsWise() {
        return fsWise;
    }

    public void setFsWise(int fsWise) {
        this.fsWise = fsWise;
        updateSkillRate();
    }

    public int getFsWitty() {
        return fsWitty;
    }

    public void setFsWitty(int fsWitty) {
        this.fsWitty = fsWitty;
        updateSkillRate();
    }

    public int getFsCreativity() {
        return fsCreativity;
    }

    public void setFsCreativity(int fsCreativity) {
        this.fsCreativity = fsCreativity;
        updateSkillRate();
    }

    @Override
    public String toString() {
        return " " + this.getNameOne() + " " + this.getNameTwo() +
                "\nConjure:" + getMsConjure() +
                " Transgress:" + getMsTransgress() +
                "\tskill Ravenclaw SkillRate:" + getSkillRate() + " {" +
                "fsSmart:" + getFsSmart() +
                ", fsWise:" + getFsWise() +
                ", fsWitty:" + getFsWitty() +
                ", fsCreativity:" + getFsCreativity() +
                '}';
    }
    public int getSkillRate() {
        return skillRate;
    }
    public void updateSkillRate() { this.skillRate = fsCreativity+fsSmart+fsWise+fsWitty; }

    @Override
    public void compareStudent(Ravenclaw student1, Ravenclaw student2) {
        if (student1.getSkillRate() > student2.getSkillRate()) {
            System.out.println(student1.getName() + " лучший Когтевран, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Когтевран, чем " + student1.getName());
        }
    }

    @Override
    public void compareStudent(Slytherin student1, Slytherin student2) {

    }
}
