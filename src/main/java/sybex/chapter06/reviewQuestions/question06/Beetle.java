package sybex.chapter06.reviewQuestions.question06;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hector on 07/02/2017.
 */
public class Beetle {
    String ssd = "";
    int getNumberOfLeg() {
        return 6;
    }

    public void guardar() {
        String fecha = this.getDate();
        //save(fecha....);

        
    }

    private String getDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
        return sdf.format(date);
    }
}
