package manning.chapter06.simpleLambdaExpressions.comparingPassingValuesWithPassingCodeToMethods;

/**
 * Created by Alvaro Alcocer on 24/04/2017.
 */
public class Emp {
    String name;
    int performanceRating;
    double salary;

    public Emp(String name, int performanceRating, double salary) {
        this.name = name;
        this.performanceRating = performanceRating;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", performanceRating=" + performanceRating +
                ", salary=" + salary +
                '}';
    }
}
