package stereotype_annotation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
@ComponentScan(basePackages = "com.myspring")
public class ConfigCourse {
}
