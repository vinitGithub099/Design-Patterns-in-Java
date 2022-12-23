public abstract class Computer {
    private int ram;
    private int cpu;
    private int hdd;
    private String type;
    
    public Computer(String type, int ram, int cpu, int hdd) {
        this.type = type;
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    public void getComputerSpecifications(){
        System.out.println("\n\n" + this.type + " Computer Specifications");
        System.out.println("Ram: " + this.ram);
        System.out.println("CPU: " + this.cpu);
        System.out.println("HDD: " + this.hdd + "\n\n");

    };
}
