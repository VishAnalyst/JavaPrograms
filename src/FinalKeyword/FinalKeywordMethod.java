package FinalKeyword;

//Finalkeyword is assigned to a data type
class Cspeed {
    void Cyclerun(){
        System.out.println("Speed is Limited to 30kmph");
    }
}
class Carspeed extends Cspeed {
    final void carRun(){
        System.out.println("Car Run is limited to 70kmph");
    }
}
public class FinalKeywordMethod {
    public static void main(String[] args) {
        Carspeed carspeed = new Carspeed();
        System.out.println("Car speed is: ");
        carspeed.carRun();
    }
}
