public class BreakANumber {
    public static void main(String args[]) {
        int a = 5463;
        while(a>0){
            int r = a%10;
            a = a/10;
            System.out.println(r + ":" + a);
        }

    }
}
