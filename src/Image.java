public class Image implements Element {

    private String imageName;

    public Image (String nameImage){
        this.imageName = nameImage;
    }
    public void print(){
        System.out.println("Image with name:"+ imageName);
                }

}
