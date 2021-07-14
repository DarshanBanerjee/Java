import java.util.Random;
public class TakingRandomValues{
    public static void main(String args[]){

       int matrix[][] = new int[3][3];

       Random r1 = new Random();

       for(int i = 0; i<3; i++)
       {
           for(int j = 0; j<3; j++)
           {
               matrix[i][j] = r1.nextInt(); //bound couldn't be used.
           }
       }
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
