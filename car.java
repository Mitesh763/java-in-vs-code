class car {
    String name(String str) {
        return str;
    }

    String color(String str_1) {
        return str_1;
    }

    float mileage(float dist, float fuel) {
        return dist / fuel;
    }

    String fuel_type(String str_2) {
        return str_2;
    }

    String model(String str_3) {
        return str_3;
    }

    int price(int vehi_pri, int rto, int insur, int other) {
        return vehi_pri + rto + insur + other;
    }

    public static void main(String[] args) {

        car obj = new car();

        String nam = obj.name("Car name :  Rolls Royce");
        System.out.println(nam);

        String col = obj.color("color of Car : Sharp white");
        System.out.println(col);

        float mil = obj.mileage(6.33f, 1.0f);
        System.out.println("Mileage of Car : " + mil);

        String fuel = obj.fuel_type("Fuel Type : Petrol");
        System.out.println(fuel);

        String mod = obj.model("Model : Ghost V12 !");
        System.out.println(mod);

        int pri = obj.price(69500000, 6950000, 2709310, 695000);
        System.out.println("Total Price of Car : " + pri);
    }
}