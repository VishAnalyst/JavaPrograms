package Pack_one;
//Public can be accessed from within class/package/outside package by sublclass / outside package
//Protected can be accessed from within class/package/outside package by subclass not outside package

public class AccessModifier{
    int num = 400;
    public void num (){
        System.out.println(num);
    }
    protected void msg(){
        System.out.println("Protected only gets printed outside package");
    }
}

