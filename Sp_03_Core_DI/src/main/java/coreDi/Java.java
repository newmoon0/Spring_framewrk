package coreDi;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {

    //Field Injection
    //@Autowired
    //OfficeHours officeHours;

    //Constructor Injection
    OfficeHours officehours;
    //@Autowored
//    public Java(OfficeHours officehours) {
//        this.officehours = officehours;
//    }

    public void getTeachHours(){
        System.out.println("teaching hours: "+(20 +officehours.getHours()));
    }


}
