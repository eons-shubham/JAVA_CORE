public class OOPs{
    public static void main(String[] args) {
        singleton singletonClassObjectInstance = singleton.getter();
    }
}

class singleton{

    static singleton singletonClassObject = new singleton();

    private singleton(){

    }

    static singleton getter(){
        return singletonClassObject;
    }
}