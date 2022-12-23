public class CivilEngineer  {
    
    private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse() {
        this.houseBuilder.buildBaseMent();
        this.houseBuilder.buildInterior();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildTerrace();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }


}
