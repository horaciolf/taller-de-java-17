public class Director{
    protected Builder builder;
    public Builder getBuilder(String tipo)
    {
        if(tipo == "Hawaiana")
        {
            return new HawaiBuilder();
        }
        if(tipo == "Doble")
        {
            return new DoubleBuilder();
        }
        return new DoubleBuilder();
    }

    public Hamb orderHamb(String tipo)
    {
        builder = getBuilder(tipo);
        builder.createHamb();
        return builder.getHamb();
    }
}