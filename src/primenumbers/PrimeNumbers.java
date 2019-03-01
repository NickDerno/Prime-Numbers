/*
 * nider6687
 * Nick Dernovsek
 * This program determines if a number is prime or not
 */

package primenumbers;

/**
 *
 * @author nider6687
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    boolean[] numbers = new boolean[1001];

    int number = 1000;
        for (int i = 1; i<number; i++) {          
            numbers[i] = true;     //sets an array list from numbers 1-1000
        }
        for (int p = 2; p*p <= number; p++){
            if (numbers[p] == true) {
                for (int x = p*p; x <= number; x+=p) {
                    numbers[x] = false;
                }
            }
        }
        int x =0;
        for (int i = 2; i<= number; i++) {

                if (x <= 20) {
                    if (numbers[i] == true) {
                    System.out.print(i + ", ");
                    x+=1;
                    }
                }
                else if (numbers[i] == true && x > 20){
                    System.out.print("\n");
                    System.out.print(i + ", ");
                    x =0;
                } 
        }
    }
}


      
    
     
  

    
