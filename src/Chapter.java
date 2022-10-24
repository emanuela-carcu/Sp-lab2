import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subchapters;

    public Chapter (String name){
        this.name = name;
        subchapters = new ArrayList<>();
    }
public int createSubChapter(String name){
        SubChapter subchapter = new SubChapter(name);
        subchapters.add(subchapter);
        return subchapters.size()-1;
}
public SubChapter getSubChapter(int index){
        return subchapters.get(index);
}
public void print(){
        System.out.println("Chapter stuff:");
        for(SubChapter s: subchapters)
            s.print();
}
}
