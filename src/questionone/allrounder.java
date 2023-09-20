package questionone;

public class Allrounder implements Batsman, Bowler {
    private String name;
    private int age;
    private String nationality;

    public Allrounder(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    @Override
    public void print() {
        System.out.println("I am an all-rounder cricketer");
    }

    @Override
    public int getRanking() {
        // Implement the logic for getting the ranking of the all-rounder
        return 0;
    }

    @Override
    public String toString() {
        return "Allrounder [name=" + name + ", age=" + age + ", nationality=" + nationality + "]";
    }
}
