public class Test{
    public static void main(String[] args){
        Creator c = new ConcreteCreator();
        PasswordCracker p = c.factoryMethod("Cracker",  Dictionary.get(),"localhost", "192.168.0.5");
        Dictionary d = Dictionary.get();
        System.out.println(d);
        System.out.println(p);
        
        Dictionary x = Dictionary.get();
        x.addWord("hola");
        
        
        System.out.println(x.at(0));
    }
} 
