class calc1{
    public int add(int num1, int num2)
    {
        return num1+num2;
    }
    public int add(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }
}
class calc2 extends calc1{
    public int sub(int num1, int num2)
    {
        return num1 - num2;
    }
}

public class MethodOverloadingAndInheritanceInJava{
    public static void main(String args[])
    {
    calc2 obj = new calc2();
    System.out.println(obj.sub(23,20));
    }
}
