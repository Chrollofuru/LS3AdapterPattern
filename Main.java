import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        List<SchoolManagementApp> integratedSystems = new ArrayList<>();
        integratedSystems.add(new AttendanceSystemAdapter(attendanceSystem));
        integratedSystems.add(new GradingSystemAdapter(gradingSystem));
        integratedSystems.add(new LibrarySystemAdapter(librarySystem));

        integratedSystems.get(0).integrateSystem("Juan Dela Cruz", "2026-09-21", "Present");
        integratedSystems.get(1).integrateSystem("Juan Dela Cruz", "Mathematics", "A");
        integratedSystems.get(2).integrateSystem("Juan Dela Cruz", "The Hobbit", "Borrowing");
    }
}