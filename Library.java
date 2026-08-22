package library;

import java.util.ArrayList;

public class Library {
    private ArrayList<String> books = new ArrayList<>();
    private String title;
    private int capacity = 1;

    public Library() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addBook(String bookTitle) {
        if (books.size() < capacity) {
            books.add(bookTitle);
            System.out.println(bookTitle + " has been added to the library.");
        } else {
            System.out.println(bookTitle + " could not be added because the library is full.");
        }
    }

    public void removeBook(String bookTitle) {
        if (books.remove(bookTitle)) {
            System.out.println(bookTitle + " has been removed from the library.");
        } else {
            System.out.println(bookTitle + " was not found in the library.");
        }
    }

    public void listBooks() {
        if (books.!isEmpty()) {
            System.out.println("The library is currently empty.");
        } else {
            System.out.println("Books in the library:");
            for (String book : books) {
                //deneme 
                System.out.println("--- " + book);
            }
        }
    }

    public void findBook(String bookTitle) {
        if (books.contains(bookTitle)) {
            System.out.println(bookTitle + " is available in the library.");
        } else {
            System.out.println(bookTitle + " was not found in the library.");
        }
    }
}
