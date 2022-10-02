public class Cat {

    // instance variables
    private String name;
    private int age;
    private double weight;

    private String treats;

    // constructor
    public Cat(String catName, int catAge, double catWeight, String catTreats) {
        name = catName;
        age = catAge;
        weight = catWeight;
        treats = catTreats;
    }

    // method that introduces the Cat
    public void introduce() {
        if (age < 7){
            System.out.println("Hello my name is " + name + ", I am a younger cat, and I like " + treats + " treats.");
        }
        if (age > 7){
            System.out.println("Hello my name is " + name + ", I am an older cat, and I like " + treats + " treats.");
        }
    }

    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}
