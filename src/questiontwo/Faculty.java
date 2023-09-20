package questiontwo;

public class Faculty extends Staff {
    public String facultyspecialization;
    public String Section;
    public int NoOfStudents;
    public String Qualification;

    public String Tech(String course) {
        // Implement teaching specific to a course
        return "Teaching course: " + course;
    }

    public String Assess(String studentgrade) {
        // Implement assessment logic
        return "Assessing student grade: " + studentgrade;
    }
}

// Pgcstudent.java
package questiontwo;

public class Pgstudent extends Student {
    public String rollno;
    public String specialization;

    public void SubmitThesis() {
        // Implement thesis submission logic
    }
}
