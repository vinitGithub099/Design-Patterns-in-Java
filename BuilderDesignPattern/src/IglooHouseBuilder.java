public class IglooHouseBuilder implements HouseBuilder {

    private House house;

    public IglooHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBaseMent() {
        house.setBaseMent("Ice basement");
    }
    
    @Override
    public void buildInterior() {
        house.setInterior("Ice carvings");
    }

    @Override
    public void buildTerrace() {
        house.setTerrace("Ice roof");
    }
    
    @Override
    public void buildStructure() {
        house.setStructure("Ice blocks");
    }

    public House getHouse() {
        return this.house;
    }


    
}
