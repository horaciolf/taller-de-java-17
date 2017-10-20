public class Dictionary<T>{

    public static Dictionary dictionary;
    String[] diction;
    int cont;

    private Dictionary(){
        diction = new String[10];
        cont = 0;

    }

    public static Dictionary get(){
        if (dictionary == null){
            dictionary = new Dictionary();
        }
        return dictionary;
    }

    public void addWord(String a){
        diction[cont]= a;
        cont = cont + 1;

    }

      Iterator getIterator(){
        return new Iterator<T>(this);
    }

         public int length(){
             return cont;
         }

    public   T at (int idx)
         {
               return (T)diction[idx];
         }
    
}





