package coreDi;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {

    OfficeHours officehours;

    public void getTeachHours(){
        System.out.println("teaching hours: "+(20 +officehours.getHours()));
    }


}
