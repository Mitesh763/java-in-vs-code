class Myemployee {

    private int Id;
    private String name;

    public String getname() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public String setName1() {
        name = "vaghela ";
        return name;
    }

    public String setName(String a) {
        this.name = a;
        return name;
    }

    public void setId(int b) {
        this.Id = b;
    }

    public int setId1() {
        this.Id = 777;
        return Id;
    }
}

public class lec_40 {
    public static void main(String[] args) {

        Myemployee emp = new Myemployee();
        System.out.println(emp.getId()); // only call no out beacause no input
        System.out.println(emp.getname()); // similar of above
        System.out.println(emp.setName("mitesh")); // set name as we input when calling
        System.out.println(emp.setName1()); // same as above
        System.out.println(emp.setId1()); // same as above
        emp.setId(7554);// first we give id then print it
    }
}