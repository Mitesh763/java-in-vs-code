class employee {
    int id;
    String name;
    int salary;

    public void details(){
             System.out.println("My id is " + id);
             System.out.println("MY name is "+ name);
     }

     public int salary(){
        return salary;
     }
}

public class lec_38 {
    public static void main(String[] args) {

        employee harry = new employee();
        employee tarak = new employee();

        harry.id = 12;
        harry.name = "codewithharry";
        harry.salary=7;

        tarak.id =76;
        tarak.name= "TMKOC";
        tarak.salary=3;
        
        harry.details();
        tarak.details();

         int sal= harry.salary();
         System.out.println(sal);

        /* 
        System.out.println(harry.id);
        System.out.println(harry.name);
        System.out.println(tarak.id);
        System.out.println(tarak.name);
        */
    }
}
