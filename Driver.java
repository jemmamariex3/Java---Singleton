/*
Jemma Tiongson
Section #16031
App: Driver.java (Singleton App)
Purpose: Demonstrate Singleton
-------------------------------------------------------------------------

Terminal:
   Compile: javac Driver.java Singleton.java
   Run: java Driver
_________________________________________________________________________
*/

class Driver{
   public static void main (String [] args){
      Singleton sObj1;
      sObj1 = Singleton.getInstance();
      sObj1.set(7);
      System.out.print("\nOutput sObj1: "+sObj1.get());
            
      Singleton sObj2;
      sObj2 = Singleton.getInstance();
      sObj2.set(77);
      System.out.print("\nOutput sObj2: "+sObj2.get());
   }
}