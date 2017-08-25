public class Concrete extends Creator{

    public void create(String typeProduct){
        if(typeProduct.compareTo("DriverDBMongo") == 0)
        {   
            product = new DriverDBMongo();
            ((DriverDBMongo)product).AbrirConexion();
            ((DriverDBMongo)product).EstablecerPropiedades();
            ((DriverDBMongo)product).CrearLogFile();
        }
        
    }
}