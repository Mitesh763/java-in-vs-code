
class SurfaceArea {
    SurfaceArea(int length01, int height01) {
        System.out.println("Surface area of Rectangle is : " + length01 * height01);
    }

    SurfaceArea(int radious4) {
        System.out.println("Surface area of Sphere is : " + 4 * Math.PI * radious4);
    }

    // SurfaceArea(int radious5, int height5) {
    //     System.out.println("Surface area of Cylinder is : " + 2.0 * Math.PI * radious5 * height5);
    // }

    SurfaceArea(int radious6, int height6, int S_heig1) {
        System.out.println("Surface area of Cone is : " + Math.PI * radious6 * S_heig1);
    }
}

class volume extends SurfaceArea {

    // Unit of Volume is cube of meter

    volume(int length0, int height0) {
        System.out.println("Not found...!");
    }

    volume(int radious1) {
        System.out.println("Volume of Sphere is : " + 4.0 / 3.0 * Math.PI * radious1 * radious1 * radious1);
    }

    // volume(int radious2, int height1) {
    //     System.out.println("Volume of Cylinder is : " + Math.PI * radious2 * radious2 * height1);
    // }

    volume(int radious3, int height4, int S_height) {
        System.out.println("Volume of Cone is : " + 1.0 / 3.0 * Math.PI * radious3 * radious3 * height4);
    }

}

public class exrcise_5 {
    public static void main(String[] args) {

        // volume vol = new volume();
        // vol.SphereVolume(7);
        // vol.CylinderVolume(1, 2);
    }
}
