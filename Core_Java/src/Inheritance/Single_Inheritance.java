package Inheritance;

class One 
{ 
   void disp1() 
   { 
       System.out.println("One"); 
   } 
} 
class Two extends One 
{ 
   void disp2() 
   { 
       System.out.println("Two"); 
   } 
} 
public class Single_Inheritance  
 { 
    public static void main(String[] args)  { 
    Two obj = new Two(); 
    obj.disp1(); 
    obj.disp2(); 
 } 
} 
