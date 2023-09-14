import java.util.Random;

public abstract class Slytherin extends Student {
    int fsCunning;
    int fsDetermination;
    int fsAmbition;
    int fsResourcefulness;
    int fsPowerLust;
    private int skillRate;

    public Slytherin(String nameOne, String nameTwo) {
        super(nameOne, nameTwo);
        Random random = new Random();
        this.fsAmbition = random.nextInt(60);
        this.fsCunning = random.nextInt(60);
        this.fsDetermination = random.nextInt(60);
        this.fsResourcefulness = random.nextInt(60);
        this.fsPowerLust = random.nextInt(60);
    }

    public int getFsCunning() {
        return fsCunning;
    }

    public void setFsCunning(int fsCunning) {
        this.fsCunning = fsCunning;
        updateSkillRate();
    }

    public int getFsDetermination() {
        return fsDetermination;
    }

    public void setFsDetermination(int fsDetermination) {
        this.fsDetermination = fsDetermination;
        updateSkillRate();
    }

    public int getFsAmbition() {
        return fsAmbition;
    }

    public void setFsAmbition(int fsAmbition) {
        this.fsAmbition = fsAmbition;
        updateSkillRate();
    }

    public int getFsResourcefulness() {
        return fsResourcefulness;
    }

    public void setFsResourcefulness(int fsResourcefulness) {
        this.fsResourcefulness = fsResourcefulness;
        updateSkillRate();
    }

    public int getFsPowerLust() {
        return fsPowerLust;
    }

    public void setFsPowerLust(int fsPowerLust) {
        this.fsPowerLust = fsPowerLust;
        updateSkillRate();
    }

    @Override
    public String toString() {
        return " " + this.getNameOne() + " " + this.getNameTwo() +
                "\nConjure:" + getMsConjure() +
                " Transgress:" + getMsTransgress() +
                "\tskill Slytherin SkillRate:" + skillRate +" {" +
                "fsCunning:" + fsCunning +
                ", fsDetermination:" + fsDetermination +
                ", fsAmbition:" + fsAmbition +
                ", fsResourcefulness:" + fsResourcefulness +
                ", fsPowerLust:" + fsPowerLust +
                '}';
    }
    public int getSkillRate() {
        return skillRate;
    }
    public void updateSkillRate() { this.skillRate = fsAmbition+fsCunning+fsDetermination+fsResourcefulness+fsPowerLust; }

    @Override
    public void compareStudent(Slytherin student1, Slytherin student2) {
        if (student1.getSkillRate() > student2.getSkillRate()) {
            System.out.println(student1.getName() + " лучший Слизерин, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Слизерин, чем " + student1.getName());
        }
    }
}
