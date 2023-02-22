package bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class CdevApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigOther.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount(); // ft is a bean created in the container

//        PartTimeMentor pt = container.getBean("p2",PartTimeMentor.class);
        PartTimeMentor pt = container.getBean(PartTimeMentor.class);

        pt.createAccount();
//?????????????????????????????????????????
        String str = container.getBean(String.class);
        System.out.println(str);
    }
}
