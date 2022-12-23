public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
    }

    public void uploadImage() {
        System.out.println("image: " + this.filename +  " uploaded successfully");
    }

    public boolean validate(int size, String extension) {
        if (size > 200000000) {
            return false;
        }
        else if (!extension.equals(".png") && !extension.equals(".jpeg")
        && !extension.equals("jfif") ) {
            return false;
        }

        return true;
    }

}
