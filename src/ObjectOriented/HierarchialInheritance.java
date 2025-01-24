package ObjectOriented;

class Diru{
    void business(){
        System.out.println("Diru bai ka business Mukesh and Anil can access");
    }
}
class Mukesh extends Diru{
    void Jiobusiness(){
        System.out.println("Mukesh ka business only his sons can access But not DIRU OR ANIL");
    }
}

class Anil extends Diru{
    void RelianceBusiness(){
        System.out.println("Anil ka business only his sons can access BUT NOT DIRU OR MUKESH");
    }
}

public class HierarchialInheritance {
    public static void main(String[] args) {
        Diru objDiru = new Diru();
        objDiru.business();

        Mukesh objMukesh = new Mukesh();
        objMukesh.business();
        objMukesh.Jiobusiness();

        Anil objAni = new Anil();
        objAni.business();
        objAni.RelianceBusiness();
    }
}
