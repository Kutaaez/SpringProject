package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Smartphone {
    private String brand;
    private OperatingSystem operatingSystem;

    public Smartphone() {
    }

    //    private final OperatingSystem operatingSystem;
//    @Autowired
    @Autowired
    public Smartphone(OperatingSystem operatingSystem){
        this.operatingSystem = operatingSystem;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
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
                ", operatingSystem=" + operatingSystem +
                '}';
    }
}
