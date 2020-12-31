package guru.springframework.sfgdi.interfacesegregationprinciple;

public class ToyPlane implements Toy, Flyable{

    double price;
    String color;

    @Override
    public void fly() {
        System.out.println("Toy Plane: Start flying...");
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ToyPlane{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
