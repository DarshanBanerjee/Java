public class OddorEven {
    public static void main(String args[]) {
        // Print if a Number is Odd or Even
        int num = 6;
        // First Method
        if(num%2==0)
            System.out.println("Even");
        else
           System.out.println("Odd");
        //Second Method
        String result = num%2==0?"Even":"Odd";
    }
}
