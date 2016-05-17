/**
 * Created by austinhays on 5/16/16.
 */
public class Dog {
    String breed;
    int age;
    String color;

    public Dog(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }
     public void setBreed( String newBreed) {
         if (validBreed(newBreed)) {
             breed = newBreed;
         }
     }

    public static boolean validBreed(String newBreed) {
        return newBreed.contains(" ");
    }
}
