
//CONSTRUCTORS OVERLOADING

class Box {
    int length;
    int width;
    int height;
    static int count=0;

    Box() {
        length = width = height = 0;
        count++;
    }

    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
         count++;
    }

    Box(int x) {
        length = width = height = x;
        count++;
    }

    Box(Box b) {
        length = b.length;
        width = b.width;
        height = b.height;
        count++;
    }

    int volume() {
        return length * width * height;
        return count;
    }
    // int obj_count(){
    //     return count;
    // }
}

public class clg_prog_3 {
    public static void main(String[] args) {

        Box b1 = new Box();
        Box b2 = new Box(4, 4, 4);
        Box b3 = new Box(5);
        Box b4 = new Box(b2);
        System.out.println(b1.volume());
        System.out.println(b2.volume());
        System.out.println(b3.volume());
        System.out.println(b4.volume());
        System.out.println(b1.volume());
    }
}