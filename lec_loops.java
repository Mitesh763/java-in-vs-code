public class lec_loops {
    public static void main(String[] args) {

        // Using while loops
        // byte a = 100;
        // while (a<=200) {
        // System.out.println(a);
        // a++;
        // }

        // Using do while loop
        // byte a=0;
        // do{
        // System.out.println(a);
        // a++;
        // }while(a<10);

        // Using For loop
        // for(byte i= 10 ; i!=0 ; i--){
        // System.out.println(i);
        // }

        // break statement
        // for(byte a=0 ; a<5 ; a++){
        // System.out.println(a);
        // System.out.println("Java is best");
        // if (a==2) {
        // System.out.println("end loop");
        // break;
        // }
        // }


        //  continue 
        for(byte i=0; i<=5 ; i++){
            if (i==2) {
                System.out.println("\nskip and continue!\n");
                continue;
            }
            System.out.println(i);
            System.out.println("java is best!!");
        }
    }
}
