package guru.springframework.sfgdi.interfacesegregationprinciple;

public class ToyBuilder {

    public static ToyHouse buildToyHouse() {
        ToyHouse toyHouse = new ToyHouse();
        toyHouse.setPrice(14.09);
        toyHouse.setColor("Red");
        return toyHouse;
    }

    public static ToyCar buildToyCar(){
        ToyCar toyCar = new ToyCar();
        toyCar.setPrice(98.43);
        toyCar.setColor("Blue");
        toyCar.move();
        return toyCar;
    }

    public static ToyPlane buildToyPlane(){
        ToyPlane toyPlane = new ToyPlane();
        toyPlane.setPrice(17.54);
        toyPlane.setColor("Green");
        toyPlane.fly();
        return toyPlane;
    }
}
