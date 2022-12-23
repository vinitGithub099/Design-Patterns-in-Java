public class ProxyImage implements Image {

    private RealImage rimg;
    private String name;
    private int size;
    private String extension;

    public ProxyImage(String name, String extension, int size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
    }

    public void uploadImage() {

        
        if (rimg == null)
        rimg = new RealImage(this.name + this.extension);
        
        boolean proceed = rimg.validate(this.size, this.extension);

        if (proceed) {
            rimg.uploadImage();
        }
        else {
            System.out.println("Can't upload image");
        }
    }

    
}
