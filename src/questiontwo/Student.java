package questiontwo;

public class Student extends Person {
    public String studentid;
    public String Major;
    public int Year;
    public int Semester;
    public String college;
    public int grade;

    public String Register(String course) {
        // Implement registration logic here
        return "Registered for course: " + course;
    }

    public int Getgrade(String course) {
        // Implement getting the grade for a specific course here
        return grade;
    }

    public String Attend(String Class) {
        // Implement attendance logic here
        return "Attending class: " + Class;
    }

    public String Learn() {
        // Implement learning logic here
        return "Learning...";
    }

    @Override
    public String Register(int uid) {
        // TODO: Implement registration based on UID
        return null;
    }

    @Override
    public String Perform(String duty) {
        // TODO: Implement student-specific duties
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
