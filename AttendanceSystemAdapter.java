public class AttendanceSystemAdapter implements SchoolManagementApp {
 
    private final AttendanceSystem attendanceSystem;
 
    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }
 
    @Override
    public void integrateSystem(String studentName, String detail, String value) {
        attendanceSystem.markAttendance(studentName, detail);
    }
}