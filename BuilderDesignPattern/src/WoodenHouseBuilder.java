public class WoodenHouseBuilder implements HouseBuilder {

    private House house;

    public WoodenHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBaseMent() {
        house.setBaseMent("Wooden base");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Wooden interior");
    }

    @Override
    public void buildTerrace() {
        house.setTerrace("Wooden terrace");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wooden blocks");
    }

    public House getHouse() {
        return this.house;
    }
    
}
