public class OOPs{
    public static void main(String[] args) {
        singleton singletonClassObjectInstance = singleton.getter();

        

    }
}

/*
 (==) vs equals()
 Case1
 String str1 = "hello";
 String str2 = "hello";
 
 str1 == str2 => true;
  
 Case2
 String str1 = "hello";
 String str2 = new String("hello");
 
 str1 == str2 => false;

 because in case1 both string were in `constant pool` and their values were also same
 in case2 both string values were same but str1 was in constant pool and str2 was in
 heap(hence different memory location) therefore false

 in case2 we can use str1.equals(str2) => return true;

 `in constant pool variable with same values point to same memory address`
 `video https://www.youtube.com/watch?v=Bj9Mx_Lx3q4`
 
 */


/*
    final keyword with variable methods and class
    
    a final variable can't be assigned(const in java is final)
    a final method can't be override (using extends keyword then method overriding)
    a final class can't have children class
    
*/


// defautl instance variable values

class localTest{

    // unassigned values of the instance variable will be 0, false, null(because String is a class)
    int x;
    boolean flg;
    String name;
    void getter(){
        System.out.println(x + " " + name);
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