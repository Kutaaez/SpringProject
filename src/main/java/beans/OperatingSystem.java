package beans;

import org.springframework.stereotype.Component;

@Component
public class OperatingSystem {
    private String type;



    public OperatingSystem() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "OperatingSystem{" +
                "type='" + type + '\'' +
                '}';
    }
}