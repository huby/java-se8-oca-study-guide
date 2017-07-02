package manning.chapter02.wrappreClasses.autoboxingAndUnboxing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Hector Huby on 06/04/2017.
 */
public class Unbox {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Double(12.12D));
        list.add(new Double(11.24D));
        Double total = Double.valueOf(0.0D);
        for(Iterator iterator = list.iterator(); iterator.hasNext();) {
            Double d = (Double) iterator.next();
            total = total.doubleValue() + d.doubleValue();
        }

        LocalDate date2 = LocalDate.parse("2016-1-9");
    }

    public int increment(Integer obj) {
        return 1;
    }
}
