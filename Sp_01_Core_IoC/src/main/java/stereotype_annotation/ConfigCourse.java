package stereotype_annotation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
@ComponentScan(basePackages = "Sp_01_Core_IoC")
public class ConfigCourse {
}
