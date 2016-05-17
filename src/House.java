/**
 * Created by austinhays on 5/16/16.
 */
public class House {
    String color;
    int year;
    int size;
    int floors;

    public House(String color, int year, int size, int floors) {
        this.color = color;
        this.year = year;
        this.size = size;
        this.floors = floors;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String newColor) {
        if (validColor(newColor)) {
            color = newColor;
        }
    }

    public static boolean validColor(String newColor) {
        return newColor.contains(" ");
    }
}
