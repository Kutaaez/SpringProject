import beans.OperatingSystem;
import beans.Smartphone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.AppConfig;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Smartphone smartphone = context.getBean(Smartphone.class);
        System.out.println(smartphone);
    }
}
