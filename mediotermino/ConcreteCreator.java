public class ConcreteCreator extends Creator{

    public void create(String typeCracker, Dictionary dictionary, String ip, String host){
        
        
            cracker = new Cracker();
            ((Cracker)cracker).setIP(ip);
            ((Cracker)cracker).setDictionary(dictionary);
            ((Cracker)cracker).setHost(host);
        
        
    }
}