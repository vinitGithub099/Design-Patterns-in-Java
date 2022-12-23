public class App {
    public static void main(String[] args) throws Exception {

        // first instance
        SingletonClass p = SingletonClass.getInstance("Vinit");
        System.out.println("Name: " + p.getName());

        // other instances
        SingletonClass q = SingletonClass.getInstance("Twinshu");
        System.out.println("Name: " + q.getName());
        
        SingletonClass r = SingletonClass.getInstance("Vishnu");
        System.out.println("Name: " + r.getName());
    }
}
