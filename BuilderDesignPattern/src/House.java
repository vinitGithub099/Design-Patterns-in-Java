public class House implements HousePlan {

    private String basement;
    private String interior;
    private String terrace;
    private String structure;

    @Override
    public void setBaseMent(String basement) {
        this.basement = basement;        
    }

    @Override
    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public void setTerrace(String terrace) {
        this.terrace = terrace;        
    }

    @Override
    public void setStructure(String structure) {
        this.structure = structure;
    }
    
}
