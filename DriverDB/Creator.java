public abstract class Creator
{
    public abstract void create(String typeProduct);
    public Driver driverDB(String typeProduct)
    {
       product = new Driver();
       create(typeProduct);
       return product;

    }
    protected Driver product;
}