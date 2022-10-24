import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Element> elements;

    public SubChapter(String name){
        this.name = name;
        elements = new ArrayList<>();
    }

   public void createNewParagraph( String a){
        Paragraph paragraph = new Paragraph(a);
        elements.add(paragraph);
   }

    public void createNewImage( String a){
        Image image = new Image(a);
        elements.add(image);
    }

    public void createNewTable( String a){
        Table table = new Table(a);
        elements.add(table);
    }

    public void print(){
        System.out.println("Stuff about Subchapter:");
                for(Element e: elements)
                    e.print();
    }
}
