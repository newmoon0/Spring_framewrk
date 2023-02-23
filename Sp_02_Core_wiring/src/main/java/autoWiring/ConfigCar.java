package autoWiring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Toyota");
        return c;
    }
    @Bean
        // Autowiring
        Person person (Car car){
            Person p= new Person();
            p.setName("Peter");
            p.setCar(car);
            return p;
        }
//    @Bean
//// Direct wiring
//    Person person (Car car){
//        Person p= new Person();
//        p.setName("Peter");
//        p.setCar(car());
//        return p;
//    }




}
