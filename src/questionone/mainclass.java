package questionone;

public class MainClass {
    public static void main(String[] args) {
        Allrounder allrounder = new Allrounder("John", 25, "Country");

        // Testing the methods and properties
        allrounder.print();
        System.out.println("Name: " + allrounder.name);
        System.out.println("Age: " + allrounder.age);
        System.out.println("Nationality: " + allrounder.nationality);
        System.out.println("Batsman Ranking: " + allrounder.getRanking());
        System.out.println("Bowler Ranking: " + allrounder.getRanking());
    }
}
