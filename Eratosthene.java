public class Eratosthene {
   static final int MARTIN_SKILLS = 999999; // For Martin
   static int[] p = new int[MARTIN_SKILLS+1];
   public static void ShowPrimes() { // Changed the main method to a void method
       System.out.print(2+" "); // Don't forget this guy, he's prime too :)
       for(int i=3;i<=MARTIN_SKILLS;i+=2) // All odd numbers loop
          if(p[i] == 0) { // Check if the number is still not marked
            System.out.print(i+ " "); // Show the primes
            for(int j=i+i+i;j<=MARTIN_SKILLS;j+= i << 1)  // Loop the multiples of i
                 p[j] = 1; // Mark the multiples
          }
   }
}