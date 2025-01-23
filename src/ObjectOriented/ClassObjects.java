package ObjectOriented;

class ClassObjects {
    int id;
    int roll;
    String name;
    int marks;

    public static void main(String[] args) {
        ClassObjects objStu1 = new ClassObjects();
        objStu1.id = 001;
        objStu1.roll = 1;
        objStu1.name ="Tester1";
        objStu1.marks=88;

        ClassObjects objStu2 = new ClassObjects();
        objStu2.id = 002;
        objStu2.roll = 2;
        objStu2.name ="Tester2";
        objStu2.marks=89;

        System.out.println(objStu1.id);
        System.out.println(objStu1.roll);
        System.out.println(objStu1.name);
        System.out.println(objStu1.marks);

        System.out.println(objStu2.id);
        System.out.println(objStu2.roll);
        System.out.println(objStu2.name);
        System.out.println(objStu2.marks);
    }
}
