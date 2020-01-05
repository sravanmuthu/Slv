package LearnJava;

public class JavaClassLearn {

    int i=1;
    int j=2;

    public static void main(String[] args)
    {
        System.out.println("start of java prgm");
        JavaClassLearn obj1 = new JavaClassLearn();
        obj1.sum();

        System.out.println("obj i is "+obj1.i);
        System.out.println("obj j is "+obj1.j);

        System.out.println("chk "+obj1);

        Calc obj2 = new Calc();
        obj2.sub();
        obj2.sum();

        System.out.println("My name is "+obj2.name);
        System.out.println("Im learning "+obj2.learning);

        AdvCalc.asub();
        AdvCalc.asum();

        System.out.println("end of java prgm");
    }

    public void sum()
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("sum of ab is "+c);
    }
}
