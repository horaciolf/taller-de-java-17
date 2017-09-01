public class DoubleBuilder extends Builder{

public Hamb buildHamb(){
    return new DoubleBurger();
}

 public void buildBread(){
        Bread b = new Bread();
        hamb.setBread(b);
    }

    public void buildMeat(){
        System.out.println("Tiene doble carne");
    }

    public void  buildTomatoe(){
        Tomatoe t = new Tomatoe();
        hamb.setTomatoe(t);
        
    }

    public void buildPinapple(){
        System.out.println("No tiene Piña");
        
    }

}