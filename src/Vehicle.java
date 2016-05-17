/**
 * Created by austinhays on 5/16/16.
 */
public class Vehicle {
    String type;
    int year;
    String color;
    String make;

    public Vehicle(String type, int year, String color, String make) {
        this.type = type;
        this.year = year;
        this.color = color;
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setType(String newType) {
        if (isValidType(newType)) {
            type = newType;
        }
    }

    public static boolean isValidType(String newType) {
        return newType.contains(" ");
    }
}
