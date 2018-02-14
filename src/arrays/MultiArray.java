package arrays;

/**
 * Created by rajan on 7/2/18.
 */
public class MultiArray {
    public static void main(String[] args) {
       int array[][]={{1,2,3},{4,5,6},{7,8,9}};
       for (int i=0;i<3;i++)
       {
           for (int k=0;k<=i;k++)
           {
               System.out.print(" ");
           }
           for (int j=0;j<3;j++)
           {
               if(i==j)
               System.out.print(" "+array[i][j]);
           }
           System.out.println();
       }
    }
}
