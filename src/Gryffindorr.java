import java.util.Random;

public class Gryffindorr extends Student {
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
        this.fsHonor = fsHonor;
        updateSkillRate();
    }

    public int getFsBraveness() {
        return fsBraveness;
    }

    public void setFsBraveness(int fsBraveness) {
        this.fsBraveness = fsBraveness;
        updateSkillRate();
    }

    public int getFsNobleness() {
        return fsNobleness;
    }

    public void setFsNobleness(int fsNobleness) {
        this.fsNobleness = fsNobleness;
        updateSkillRate();
    }

    @Override
    public String toString() {
        return " " + this.getNameOne() + " " + this.getNameTwo() +
                "\nConjure:" + getMsConjure() +
                " Transgress:" + getMsTransgress() +
                "\tskill Gryffindorr SkillRate:" + skillRate +" {" +
                "honor:" + fsHonor +
                ", braveness:" + fsBraveness +
                ", nobleness:" + fsNobleness +
                '}';
    }

    public int getSkillRate() {
        return skillRate;
    }

    public void updateSkillRate() {
        this.skillRate = fsBraveness+fsHonor+fsNobleness;
    }
    @Override
    public void compareStudent(Gryffindorr student1, Gryffindorr student2) {
        if (student1.getSkillRate() > student2.getSkillRate()) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }
    }

}
