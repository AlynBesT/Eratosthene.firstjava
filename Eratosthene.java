public class Eratosthene {
   static final int MARTIN_SKILLS = 999999; // For Martin
   static int[] p = new int[MARTIN_SKILLS+1];
   public static void main(String[] args) {
       for(int i=2;i<=MARTIN_SKILLS;++i) // All number loop
          if(p[i] == 0) { // Check if the number is still not marked
            System.out.print(i+ " "); // Show the primes
            for(int j=i+i;j<=MARTIN_SKILLS;j+= i)  // Loop the multiples of i
                 p[j] = 1; // Mark the multiples
          }
   }
}
