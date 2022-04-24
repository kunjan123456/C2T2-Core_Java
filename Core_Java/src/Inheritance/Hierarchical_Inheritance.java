package Inheritance;
class Oneee 
{ 
   void disp1() 
   { 
        System.out.println("One"); 
   } 
} 
class Twooo extends One 
{ 
   void disp2() 
   { 
        System.out.println("Two"); 
   } 
} 
class Threee extends One 
{ 
   void disp3() 
   { 
        System.out.println("Three"); 
   } 
} 
class Fourr extends One 
{ 
   void disp4() 
   { 
        System.out.println("Four"); 
   } 
} 
public class Hierarchical_Inheritance  
{ 
   public static void main(String[] args)  { 
   Fourr obj1 = new Fourr(); 
   obj1.disp1(); 
   obj1.disp4(); 
   Threee obj2 = new Threee(); 
   obj2.disp1(); 
   obj2.disp3(); 
   Twooo obj3 = new Twooo(); 
   obj3.disp1(); 
   obj3.disp2();; 
} 
} 
