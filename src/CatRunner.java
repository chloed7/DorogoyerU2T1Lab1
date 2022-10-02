public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("James", 5, 11, "salmon");
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Alice", 8, 8, "chicken");
        cat2.introduce();
        cat2.printCatInfo();
    }
}
