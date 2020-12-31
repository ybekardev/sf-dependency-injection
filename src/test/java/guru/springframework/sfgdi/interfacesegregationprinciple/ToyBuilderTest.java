package guru.springframework.sfgdi.interfacesegregationprinciple;

import org.junit.jupiter.api.Test;

public class ToyBuilderTest {

    @Test
    public void testToy() {
        ToyHouse toyHouse = ToyBuilder.buildToyHouse();
        System.out.println(toyHouse);
        ToyCar toyCar = ToyBuilder.buildToyCar();
        System.out.println(toyCar);
        ToyPlane toyPlane = ToyBuilder.buildToyPlane();
        System.out.println(toyPlane);
    }

    @Test
    public void test2(){
        ToyPlane toyPlane = new ToyPlane();
        toyPlane.setPrice(43.554);
        toyPlane.setColor("Black");
        toyPlane.fly();
        System.out.println(toyPlane);
    }
}
