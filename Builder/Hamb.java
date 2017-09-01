public abstract class Hamb{

    public abstract void getHambType();
    public void setBread(Bread bread){
        this.bread = bread;
    }

    public void setMeat(Meat meat){
        this.meat = meat;
    }

    public void setTomatoe(Tomatoe tomatoe){
        this.tomatoe = tomatoe;
    }

    public void setPinapple(Pinapple pinapple){
        this.pinapple = pinapple;
    }


    protected Bread bread;
    protected Meat meat;
    protected Tomatoe tomatoe;
    protected Pinapple pinapple;

}