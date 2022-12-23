public class App {
    public static void main(String[] args) throws Exception {
        
        Image img1 = new ProxyImage("abc", ".txt", 10);
        img1.uploadImage();

        Image img2 = new ProxyImage("def", ".png", 10000);
        img2.uploadImage();
    }
}
