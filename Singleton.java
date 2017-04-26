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

class Singleton{
   //PRIVATE static singleton object.
   private static Singleton instance = new Singleton();
   int item;
   
   //blank constructor
   private Singleton(){
      
   }
   public static Singleton getInstance(){
      return instance;
   }
   public void set(int item){
      this.item = item;
   }
   public int get(){
      return item;
   }
}