
//PROBLEM 13

class volume {

    // Unit of Volume is cube of meter

    public void SphereVolume(int radious1) {
        System.out.println("Volume of Sphere is : " + 4.0 / 3.0 * Math.PI * radious1 * radious1 * radious1);
    }

    public void CubeVolume(int side) {
        System.out.println("Volume of Cube is : " + Math.pow(side, 3));
    }

    public void CylinderVolume(int radious2, int height1) {
        System.out.println("Volume of Cylinder is : " + Math.PI * radious2 * radious2 * height1);
    }

    public void PrismVolume(int base, int height2) {
        System.out.println("Volume of Prism is : " + base * height2);
    }

    public void CuboidVolume(int length1, int width1, int height3) {
        System.out.println("Volume of Square is : " + length1 * width1 * height3);
    }

    public void ConeVolume(int radious3, int height4) {
        System.out.println("Volume of Cone is : " + 1.0 / 3.0 * Math.PI * radious3 * radious3 * height4);
    }

}

public class clg_prog_10_13_methodover {
    public static void main(String[] args) {
        volume vol = new volume();

        // All Dimension in meter

        vol.SphereVolume(7);
        vol.CubeVolume(8);
        vol.CylinderVolume(4, 5);
        vol.PrismVolume(9, 7);
        vol.CuboidVolume(4, 8, 1);
        vol.ConeVolume(1, 5);
    }
}
