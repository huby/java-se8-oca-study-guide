package sybex.chapter04.workingWithDatesAndTimes;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by hector on 11/12/2016.
 * This example correspond to the following case:
 * Our zoo performs animal enrichment
 * activities to give the animals something fun to do. The head zookeeper has decided
 * to switch the toys every month. This system will continue for three months to see how it
 * works out.
 */
public class Zoo {
    final  static  public void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimalEnrichment(start, end);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1);
        }
    }


}
