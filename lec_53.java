
// ABSTRACT CLASS


abstract class Parent2{
    public Parent2(){
        System.out.println("I am constructor of Parent2......!");
    }
    public void SayHello(){
        System.out.println("hello...!");
    }
    abstract public void greet();
    abstract public void greet2();
}
abstract class child4 extends Parent2{
    public void greet(){
        System.out.println("Good Evening...!");
    }
}
class child2 extends child4{
    public void greet(){
        System.out.println("I am Inhetance of Parent2.....!^^^^^^");
    }
    public void greet2(){
        System.out.println("I am also Ihetance...!");
    }
    public void meet(){
        System.out.println("Say Hello..........!");
    }
}
class child3 extends Parent2{
    public void greet(){
        System.out.println("Good Morning...!");
    }
    public void greet2(){
        System.out.println("Good Afternoon.....!");
    }
    public void meet(){
        System.out.println("Say Hello*******");
    }
}

public class lec_53 {
   public static void main(String[] args) {
      child2 obj1 = new child2();
     obj1.greet();
      child3 obj2 = new child3();
    //  obj2.greet();
   }    
}
