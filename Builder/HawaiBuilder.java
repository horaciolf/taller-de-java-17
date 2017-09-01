public class HawaiBuilder extends Builder{
    public Hamb buildHamb(){
        return new Hawaian();
    }

    public void buildBread(){
        Bread b = new Bread();
        hamb.setBread(b);
    }

    public void buildMeat(){
        Meat m = new Meat();
        hamb.setMeat(m);
    }

    public void  buildTomatoe(){
        Tomatoe t = new Tomatoe();
        hamb.setTomatoe(t);
        
    }

    public void buildPinapple(){
        Pinapple p = new Pinapple();
        hamb.setPinapple(p);
        
    }
}