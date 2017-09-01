public abstract class Builder{
    protected Hamb hamb;
    public abstract Hamb buildHamb();
    public abstract void buildBread();
    public abstract void buildMeat();
    public abstract void buildTomatoe();
    public abstract void buildPinapple();

    public Hamb getHamb()
    {
        return hamb;
    }
    public void createHamb()
    {
        hamb = buildHamb();
        buildBread();
        buildMeat();
        buildTomatoe();
        buildPinapple();
    }

}