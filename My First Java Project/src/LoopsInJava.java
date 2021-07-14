public class LoopsInJava {
    public static void main(String args[]) {
        // 1. WHILE LOOP
        int i = 1;
        while(i<=5){ // Condition
            System.out.println("Hello " + i);
            i++; //i = i+1 // Increment
        }
        System.out.println(i);
        // 2. DO WHILE LOOP
        i = 1; // Declaration
        do{
            System.out.println("Hello " + i);
            i++; //i = i+1 //Increment
        }while(i<=5);
        System.out.println(i);
        // 3. FOR LOOP
        for(i=1;i<=5;i++)
        {
            System.out.println("Hello " + i);
        }
        System.out.println(i);
    }
}
