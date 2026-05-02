package library;

public class book {
    private String title,author;
    private int year;

    public int getYear(){
        return year;
    }
    public void setYear( int year){
        this.year=year;
    }

    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public book(String title , String author, int year){
            this.title=title;
            this.author=author;
            this.year=year;
    }
    public void displayInfo(){
        System.out.println("Book Title : " + title + " Author : " + author + " Year : " + year);

    }
}
