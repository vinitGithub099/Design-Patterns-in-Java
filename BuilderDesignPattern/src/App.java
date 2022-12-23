public class App {
    public static void main(String[] args) throws Exception {        

        HouseBuilder houseBuilder = new IglooHouseBuilder();
        CivilEngineer civilEngineer = new CivilEngineer(houseBuilder);
        civilEngineer.constructHouse();
        House house = civilEngineer.getHouse();
    }
}
