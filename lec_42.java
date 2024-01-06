
// CONSTRUCTORS.



class Employee{
//     String name;
//     int Id;

    Employee(){
        System.out.println("my name is Mitesh...!");
    }
    Employee(String n , int a){
        System.out.println("my name is : " + n );
        System.out.println("my Id is : "+  a);
    }
    Employee(String name,int Id,int salary){
        System.out.println("my name is " + name + ". my Id is " + Id + ". my salary is " + salary + "....!");
    }
}
public class lec_42 {
    public static void main(String[] args) {
        
        Employee obj1= new Employee();
        Employee obj2 = new Employee("ItE",031);
        Employee obj3 = new Employee("XYZ",5542,475200);
    }
}
