public abstract class Creator
{
    public abstract void create(String typeCracker, Dictionary dictionary, String ip, String host);
    public PasswordCracker factoryMethod(String typeCracker, Dictionary dictionary, String ip, String host)
    {
       
       create(typeCracker, dictionary, ip, host);
       return cracker;

    }
    protected PasswordCracker cracker;
}