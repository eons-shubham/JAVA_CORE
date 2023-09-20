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

//instance variables vs local variables

class instanceVariables{

    // the variables name and age will be available to all function/methods of this class
    String name;
    int age;

    // the variables localName and localAge are restricted to the setter method scope only
    void setter(String localName, int localAge){
        // some code
    }

    void getter(){
        // some code
    }

}