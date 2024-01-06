public class lec_31 {

     int logic(int x,int y){    // If we use object then no need to STATIC
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else{
            z=x*y;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=2,b=3;    
        int c;
        // c= logic(a,b);

        //Using object
        lec_31 obj=new lec_31();
        c=obj.logic(a, b);

        System.out.println(c);

        int a1=5,b1=4;
        int c1;
        // c1=logic(a1, b1);

        // Using object
        c1=obj.logic(a1, b1);
       
         System.out.println(c1);
    }
}
