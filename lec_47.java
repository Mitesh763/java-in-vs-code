
// this AND super KEYWORD

class Ekclass{
    int a; 

    public int getabc(){
        return a;
    }

    //without THIS keyword 
    /* 
    Ekclass(int y){
        a = y;   
    }
    */

    // using THIS keyword
    Ekclass(int a){
        this.a=a;
    }     
}
class Sec_class extends Ekclass{
    Sec_class(int x){
        super(x);
        System.out.println("hello java");
    }
}

public class lec_47 {
    public static void main(String[] args) {
         Ekclass EC1 =new Ekclass(5);
         System.out.println(EC1.getabc());

         Sec_class sc1 =new Sec_class(555);
         System.out.println(sc1.getabc());
    }
}
