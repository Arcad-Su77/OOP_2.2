import java.util.Random;

public class Ravenclaw extends Hogwarts {
    private final String facultet = "RAVENCLAS";
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
    public int getFsSmart() {
        return fsSmart;
    }

    public void setFsSmart(int fsSmart) {
        if (fsSmart >= 0 && fsSmart <= 75) {
            this.fsSmart = fsSmart;
            updateSkillRate();
        }
    }
    public int getFsWise() {
        return fsWise;
    }
    public void setFsWise(int fsWise) {
        if (fsWise >= 0 && fsWise <= 75) {
            this.fsWise = fsWise;
            updateSkillRate();
        }
    }
    public int getFsWitty() {
        return fsWitty;
    }
    public void setFsWitty(int fsWitty) {
        if (fsWitty >= 0 && fsWitty <= 75) {
            this.fsWitty = fsWitty;
            updateSkillRate();
        }
    }
    public int getFsCreativity() {
        return fsCreativity;
    }
    public void setFsCreativity(int fsCreativity) {
        if (fsCreativity >= 0 && fsCreativity <= 75) {
            this.fsCreativity = fsCreativity;
            updateSkillRate();
        }
    }
    @Override
    public String toString() {
        return " " + this.getNameOne() + " " + this.getNameTwo() + " " + facultet +
                "\n\tConjure:" + getMsConjure() +
                " Transgress:" + getMsTransgress() +
                "\n\tskill Ravenclaw SkillRate:" + getSkillRate() + " {" +
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

    public void compareStudent(Ravenclaw student1) {
        if (student1.getSkillRate() > this.getSkillRate()) {
            System.out.println(student1.getName() + " лучший Когтевран, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Когтевран, чем " + student1.getName());
        }
    }

}
