/**
 * Created by austinhays on 5/16/16.
 */
public class HeavyEquip {
    String make;
    String type;
    int year;
    boolean doesRun;

    public HeavyEquip(String make, String type, int year, boolean doesRun) {
        this.make = make;
        this.type = type;
        this.year = year;
        this.doesRun = doesRun;
    }

    public String getmake() {
        return make;
    }
    public void setmake(String newMake) {
        if(isValidMake(newMake)) {
            make = newMake;
        }
    }

    public static boolean isValidMake(String newMake) {
        return newMake.contains(" ");
    }

}
