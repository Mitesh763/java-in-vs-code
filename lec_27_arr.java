public class lec_27_arr {
    public static void main(String[] args) {

        // float[] spi={9.7f,9.8f,9.9f};
        // System.out.println(spi.length);
        // System.out.println(spi[1]);

        // String[] str={"java","python","javascript"};
        // System.out.println(str.length);
        // System.out.println(str[2]);


        // Quick Quiz
        int [] mark={99,98,97};
        //  for(int i=0; i<= mark.length; i++){
        //     System.out.println(mark[i]);
        //  }

        //  for(int j=mark.length-1;j>=0;j--){
        //     System.out.println(mark[j]);
        //  }


        // using FOR EACH LOOP 
        System.out.println("Using FOR EACH LOOP");
        for(int element: mark)
        {
            System.out.println(element);
        }
    }
}