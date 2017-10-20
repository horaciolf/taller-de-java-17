public  abstract class PasswordCracker
{
protected String host;
protected String ip;
protected Dictionary dictionary;

public abstract void setHost(String host);
public abstract void setDictionary(Dictionary dictionary);
public abstract void setIP(String ip);
public abstract String crackPWD();

}