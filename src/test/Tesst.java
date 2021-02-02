package test;

public class Tesst {
    Tesst tesst;
   int tuoi;
   String name;
   static String aa="dsd";

   Tesst(int t , String n){
       tuoi = t;
       name= n;
   }
   void  display (){
       System.out.println("tuoi "+ tuoi + " name "+ name+ aa);
   }
    public static void main(String[] args) {
        Tesst tesst = new Tesst(32,"ew");
        tesst.display();

    }
}
