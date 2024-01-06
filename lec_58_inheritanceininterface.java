
// inheritance in inteface

interface SampleClass {
    void meth1();

    void meth2();
}

interface ChildClass extends SampleClass{
    void meth3();

    void meth4();
}

class MyClass implements ChildClass{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

public class lec_58_inheritanceininterface {
    public static void main(String[] args) {

        MyClass obj = new MyClass();
        obj.meth1();
        obj.meth2();
        obj.meth4();
    }
}
