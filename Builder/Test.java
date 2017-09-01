public class Test{

    public static void main(String[] args){
        Director d = new Director();
        Hamb h = d.orderHamb("Hawaiana");
        Hamb dob = d.orderHamb ("Doble");
        h.getHambType();
        dob.getHambType();
    }
}