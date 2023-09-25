package task4_01;

public class Book {
    Title bookTitle = new Title();
    Content bookContent = new Content();
    Author bookAuthor = new Author();

    public void addBookInfo(String newTitle, String newContent, String newAuthor){
        this.bookTitle.title = newTitle;
        this.bookContent.content = newContent;
        this.bookAuthor.author = newAuthor;
    }

    public void show(){
        System.out.println("\n---------- Book -----------");
        this.bookTitle.show();
        this.bookAuthor.show();
        this.bookContent.show();
    }
}
