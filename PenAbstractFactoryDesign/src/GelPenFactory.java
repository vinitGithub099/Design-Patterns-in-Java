public class GelPenFactory implements PenAbstractFactory {

    public void createRefil() {
        Plastic p = new Plastic();
        p.getrefil();
    }

    public void createTube() {
        Metal m = new Metal();
        m.gettube();
    }
}
