class clg_prog_2 {
     int multiple(int x ,int y){
        return x*y;
     }
     int mod(int  a,int b){
        return Math.floorMod(a, b);
     }
     int div(int a,int b){
      return Math.floorDiv(a, b);
   }
   int max(int a,int b){
      
      return Math.max(a, b);
     }
      
    public static void main(String[] args) {
        clg_prog_2 obj=new clg_prog_2();
        int c=obj.multiple(3, 4);
        System.out.println(c);

        int r=obj.mod(17, 2);
        System.out.println(r);

        int re=obj.div(45, 4);
        System.out.println(re);

        int res =obj.max(5, 6);
        System.out.println(res);
    }
}
