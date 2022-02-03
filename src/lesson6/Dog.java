package lesson6;

public class Dog extends Pet{
    private static int count;
    private static int countPet;
    private float speed1;
    private float speed2;

    public Dog(String name,
               float speed1,
               float speed2) {
        super(name, speed1);
        this.speed2 = speed2;
        count++;

    }

    public static int getCount(){
        return count;
    }
    public static int getCountPet(){
        return countPet;
    }



}
