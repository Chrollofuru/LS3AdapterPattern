public class LibrarySystem {
 
    public void manageBooks(String studentName, String bookTitle, String action) {
        System.out.println("[LibrarySystem] " + action + " book '" + bookTitle
                + "' for " + studentName + ".");
    }
}