package LearnJava;

public class StringCls
{
    public static void main(String[] args)
    {
        String lrn = "You are learning";
        String act_lrn = "learning";

        Boolean rslt=lrn.equals(act_lrn);
        System.out.println("Your result is "+rslt);

        Boolean rslt1=lrn.equalsIgnoreCase(act_lrn);
        System.out.println("Your result is "+rslt1);

        Boolean rslt2=lrn.contains(act_lrn);
        System.out.println("Your result is "+rslt2);

    }
}
