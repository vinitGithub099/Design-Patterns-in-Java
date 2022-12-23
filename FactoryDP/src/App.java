public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ComputerFactory computerFactory = new ComputerFactory();
        Computer personalComputer = computerFactory.getComputer("PC", 10, 20, 30);
        Computer serverComputer = computerFactory.getComputer("Server", 20, 40, 60);

        try {
            personalComputer.getComputerSpecifications();
            serverComputer.getComputerSpecifications();
        } catch (Exception e) {
            e.getMessage();
        }

    }
}
