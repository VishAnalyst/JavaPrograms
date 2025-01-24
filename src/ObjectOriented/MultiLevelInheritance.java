package ObjectOriented;

class Lion{
    void eat(){
        System.out.println("Lion Eats");
    }
}
class Fish extends Lion{
    void swims(){
        System.out.println("Fish swims");
    }
}
class Hippo extends Fish{
    void farts(){
        System.out.println("Hippo Farts");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Hippo objHippo = new Hippo();
        objHippo.eat();
        objHippo.swims();
        objHippo.farts();
    }
}
