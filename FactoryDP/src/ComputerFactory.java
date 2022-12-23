public class ComputerFactory {

    public Computer getComputer(String type, int ram, int cpu, int hdd) {
        if (type.equals("PC")) {
            return new PersonelComputer(type, ram, cpu, hdd);
        }
        else if (type.equals("Server")) {
            return new Server(type, ram, cpu, hdd);
        }
        return null;
    }
    
}
