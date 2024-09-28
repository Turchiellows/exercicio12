// IMPORTS

import java.util.Scanner;

public class Exercicio12 {

   public static void main(String[] args) {
      // INSTANTIATE
      Scanner sc = new Scanner(System.in);

      // DECLARATE
      int a;
      int b;
      int result;

      // COLLECT DATA
      System.out.print("A : ");
      a = sc.nextInt();
      System.out.print("B : ");
      b = sc.nextInt();

      // OUTPUT
      if (a > b) {
         System.out.println(a);
      } else if (a == b) {
         System.out.println("EQUALS");
      } else {
         System.out.println(b);
      }
   }
}
