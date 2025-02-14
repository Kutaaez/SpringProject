package beans;

import org.springframework.stereotype.Component;

@Component
public class Smartphone {
    private String brand;

    public Smartphone() {
    }


    public Smartphone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
