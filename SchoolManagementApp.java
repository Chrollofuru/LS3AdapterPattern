public interface SchoolManagementApp {
 
    /**
     * Common method the unified app calls, regardless of which
     * underlying system (attendance, grading, library, etc.) is
     * actually being used behind the scenes.
     *
     * @param studentName the name of the student involved
     * @param detail      extra contextual info (date, subject, book title, etc.)
     * @param value       the value associated with the action (status, grade, action type)
     */
    void integrateSystem(String studentName, String detail, String value);
}