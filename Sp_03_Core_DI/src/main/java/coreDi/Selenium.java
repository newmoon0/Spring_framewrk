package coreDi;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Selenium {

    public void getTeachingHours(){
        System.out.println("teaching hours : 15");
    }
}
