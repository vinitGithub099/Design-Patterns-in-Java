public class SingletonClass {

    private static SingletonClass s = null;
    private String name;

    private SingletonClass(String name) {
        this.name = name;
        System.out.println("SingletonClass object initialized");
    }

    public static SingletonClass getInstance(String name) {
        if (s == null) {
            s = new SingletonClass(name);
        }
        return s;
    }

    public String getName() {
        return this.name;
    }
}