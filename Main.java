import static java.lang.Math.*;

public class Main {

   public static void main(String[] args) {
       // declaration and filling of the first array
       int[] a = new int[11];
       int temp = 20;
       for (int i = 0; i < 10; i++) {
           a[i] = temp;
           temp -= 2;
       }
       // declaration and filling of the second array
       float[] x = new float[18];
       for (int i = 0; i < 18; i++) {
           int min = -11;
           int max = 2;
           float random_number1 = min + (float) (Math.random() * (max - min));
           x[i] = random_number1;

		}
       // declaring and filling the final array
		double[][] arr = new double[10][18];
       for (int i = 0; i < 10; i++) {
           for (int j = 0; j < 18; j++) {
               switch (a[i]) {
                   case 16:
                       arr[i][j] = atan(sin(pow(pow(E, x[j]), tan(x[j]) + PI)));
                       break;
                   case 4:
				   case 8:
                   case 12:
                   case 14:
                   case 18:
                       arr[i][j] = pow(((0.5 / cos(x[j])) / (3 / 4)), 2);
                       break;
                   default:
                       arr[i][j] = cos(pow((((2 / 3) * ((pow((x[j]), (1 / 3))) - (1 / 3))) / (pow(E, sin(x[j])))), 3));
                       break;
               }
           }
       }
       // output the final array
       for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 18; j++) {
                if (Double.isInfinite(arr[i][j])) {
                    System.out.print(" Inf " + "\t");
                } else {
                    System.out.printf(" %.3f ", arr[i][j]);
                    
                }
            }
            System.out.println();
       }
   }
}