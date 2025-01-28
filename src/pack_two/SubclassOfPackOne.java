package pack_two;

import Pack_one.AccessModifier;

public class SubclassOfPackOne extends AccessModifier {
    public static void main(String[] args) {
        SubclassOfPackOne subclassOfPackOne = new SubclassOfPackOne();
        subclassOfPackOne.msg();
        subclassOfPackOne.num();
    }
}
