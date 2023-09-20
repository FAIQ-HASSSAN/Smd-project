package questiontwo;

public class Technician extends Staff {
    public String techtype;

    public String Maintain(String lab) {
        // Implement lab maintenance logic
        return "Maintaining lab: " + lab;
    }

    public String Install(String system) {
        // Implement system installation logic
        return "Installing system: " + system;
    }
}
