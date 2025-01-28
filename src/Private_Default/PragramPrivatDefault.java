package Private_Default;
//Private can be accessed only within the class not within the package/outside package/ outside package by sublclass
//Default can be accessed within the class and package not outside package by subclass outside package.

//In this program only the default is recognised and it printing the value, the compiler omites the private one.

class PrivateDatatypeTest{
    int num = 100;
    void message(){ //Add a private here so we can understand it more
        System.out.println("Private keyword testing");
    }
}


public class PragramPrivatDefault {
    public static void main(String[] args) {
        PrivateDatatypeTest privateDatatypeTest = new PrivateDatatypeTest();
        System.out.println(privateDatatypeTest.num);
        privateDatatypeTest.message();
    }
}
