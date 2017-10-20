public  class Cracker extends PasswordCracker
{

    protected String host;
protected String ip;
protected Dictionary dictionary;

public  void setHost(String host){
    this.host = host;
    System.out.println("El host es:" + host);
}
public  void setDictionary(Dictionary dictionary){

    this.dictionary = dictionary;
    System.out.println("El dictionary es:" + dictionary);
}
public  void setIP(String ip){

    this.ip = ip;
    System.out.println("El ip es:" + ip);

}
public String crackPWD(){
    return "password";
}


}