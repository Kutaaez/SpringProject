package beans;

import org.springframework.stereotype.Component;

@Component
public class OperatingSystem {
    private String type = "Android";

    public String getType() {
        return type;
    }
}