import java.util.Random;

public class Slytherin extends Student {
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
        if (fsCunning >= 0 && fsCunning <= 60) {
            this.fsCunning = fsCunning;
            updateSkillRate();
        }
    }

    public int getFsDetermination() {
        return fsDetermination;
    }

    public void setFsDetermination(int fsDetermination) {
        if (fsDetermination >= 0 && fsDetermination <= 60) {
            this.fsDetermination = fsDetermination;
            updateSkillRate();
        }
    }

    public int getFsAmbition() {
        return fsAmbition;
    }

    public void setFsAmbition(int fsAmbition) {
        if (fsAmbition >= 0 && fsAmbition <= 60) {
            this.fsAmbition = fsAmbition;
            updateSkillRate();
        }
    }

    public int getFsResourcefulness() {
        return fsResourcefulness;
    }

    public void setFsResourcefulness(int fsResourcefulness) {
        if (fsResourcefulness >= 0 && fsResourcefulness <= 60) {
            this.fsResourcefulness = fsResourcefulness;
            updateSkillRate();
        }
    }

    public int getFsPowerLust() {
        return fsPowerLust;
    }
    public void setFsPowerLust(int fsPowerLust) {
        if (fsPowerLust >= 0 && fsPowerLust <= 60) {
            this.fsPowerLust = fsPowerLust;
            updateSkillRate();
        }
    }

    @Override
    public String toString() {
        return " " + getNameOne() + " " + getNameTwo() +
                "\nConjure:" + getMsConjure() +
                " Transgress:" + getMsTransgress() +
                "\tskill Slytherin SkillRate:" + getSkillRate() +" {" +
                "fsCunning:" + getFsCunning() +
                ", fsDetermination:" + getFsDetermination() +
                ", fsAmbition:" + getFsAmbition() +
                ", fsResourcefulness:" + getFsResourcefulness() +
                ", fsPowerLust:" + getFsPowerLust() +
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
    @Override
    public void compareStudent(Gryffindorr student1, Gryffindorr student2) {

    }

    @Override
    public void compareStudent(Hufflepuff student1, Hufflepuff student2) {

    }

    @Override
    public void compareStudent(Ravenclaw student1, Ravenclaw student2) {

    }
}
