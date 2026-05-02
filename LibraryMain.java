package library;

public class LibraryMain {
    public static void main (String[] args){
        Library library = new Library();
        book book1 = new book("Beyaz Kale","Orhan Pamuk",1990);
        book book2= new book("Mai ve Siyah","Halit Ziya Uşaklıgil",1897);
        book1.setTitle("Kara Kitap");
        book1.displayInfo();
        book2.displayInfo();
        library.addBook(book1.getTitle());
        library.addBook(book2.getTitle());




    }
}
