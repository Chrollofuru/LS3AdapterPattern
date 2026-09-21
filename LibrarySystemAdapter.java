public class LibrarySystemAdapter implements SchoolManagementApp {
 
    private final LibrarySystem librarySystem;
 
    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }
 
    @Override
    public void integrateSystem(String studentName, String detail, String value) {
        librarySystem.manageBooks(studentName, detail, value);
    }
}
 