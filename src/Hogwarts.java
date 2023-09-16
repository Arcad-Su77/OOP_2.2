import java.util.Random;

public abstract class Hogwarts {
    private int msConjure;
    private int msTransgress;
    private String nameOne;
    private String nameTwo;

    public Hogwarts(String nameOne, String nameTwo) {
        this.nameOne = nameOne;
        this.nameTwo = nameTwo;
        Random random = new Random();
        this.setMsConjure(random.nextInt(100));
        this.setMsTransgress(random.nextInt(100));
    }
    public String getName() { return nameOne + " " + nameTwo; }
    public String getNameOne() { return nameOne; }

    public void setNameOne(String nameOne) { this.nameOne = nameOne; }

    public String getNameTwo() { return nameTwo; }

    public void setNameTwo(String nameTwo) { this.nameTwo = nameTwo; }

    public int getMsConjure() { return msConjure; }

    public void setMsConjure(int msConjure) { this.msConjure = msConjure; }

    public int getMsTransgress() { return msTransgress; }

    public void setMsTransgress(int msTransgress) { this.msTransgress = msTransgress; }

    public static void compareMagic(Hogwarts student1, Hogwarts student2) {
        if (student1.getMsConjure() > student2.getMsConjure()) {
            System.out.println(student1.getName() + " обладает бОльшей мощностью магии, чем " + student2.getName() + ".");
        } else {
            System.out.println(student2.getName() + " обладает бОльшей мощностью магии, чем " + student1.getName() + ".");
        }
    }

}
