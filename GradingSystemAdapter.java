public class GradingSystemAdapter implements SchoolManagementApp {
 
    private final GradingSystem gradingSystem;
 
    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }
 
    @Override
    public void integrateSystem(String studentName, String detail, String value) {
        // detail = subject, value = grade
        gradingSystem.recordGrades(studentName, detail, value);
    }
}