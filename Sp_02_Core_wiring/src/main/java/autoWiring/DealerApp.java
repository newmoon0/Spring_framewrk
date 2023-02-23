package autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {

    public static void main(String[] args) {

        ApplicationContext cont=new AnnotationConfigApplicationContext(ConfigCar.class);
        Car c = cont.getBean(Car.class);
        Person p= cont.getBean(Person.class);
        System.out.println("Car's make is " + c.getMake());
        System.out.println("Person's name " + p.getName());
        System.out.println("Person's car"+ p.getCar().getMake());
    }
}
