import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Chapter> chapters;

    private List<Author> authors;

    public Book (String title){
        this.title = title;
        chapters = new ArrayList<>();
        authors = new ArrayList<>();
    }

    public void print(){
        System.out.println("Book stuff:");
        for(Chapter c: chapters)
           c.print();
        for(Author a: authors)
            a.print();
    }

    public int createChapter(String title){
        Chapter chapter = new Chapter(title);
        chapters.add(chapter);
        return chapters.size()-1;
    }

    public Chapter getChapter(int index){
        return chapters.get(index);
    }

    public void addAuthor(Author a){
        authors.add(a);
    }
}
