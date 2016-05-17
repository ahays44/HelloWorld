/**
 * Created by austinhays on 5/16/16.
 */
public class Employee {
    String name;
    int age;
    int salary;
    String title;

    public Employee(String name, int age, int salary, String title) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.title = title;
    }

    public String getName() {

        return name;
    }

    public void setName(String newName) {
        if (isValidName(newName)) {
            name = newName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age=newAge;
    }

    public static boolean isValidName(String newName) {
        return newName.contains(" ");
    }


    }

