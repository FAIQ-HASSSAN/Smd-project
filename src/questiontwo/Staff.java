package questiontwo;

public class Staff extends Person {
    public String employeeid;
    public String employeerole;
    public String department;
    public float salary;
    public int experience;

    public String Attend(String duty) {
        // Implement attendance logic here
        return "Attending duty: " + duty;
    }

    public String GetPromotion() {
        // Implement promotion logic here
        return "Promoted!";
    }

    public int GetSalary() {
        return (int) salary;
    }

    @Override
    public String Register(int uid) {
        // TODO: Implement registration based on UID
        return null;
    }

    @Override
    public String Perform(String duty) {
        // TODO: Implement staff-specific duties
        return null;
    }

    @Override
    public String include(String service) {
        // TODO: Implement including a service
        return null;
    }

    @Override
    public String like(String item) {
        // TODO: Implement liking an item
        return null;
    }
}
