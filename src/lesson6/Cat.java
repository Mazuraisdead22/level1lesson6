package lesson6;

public class Cat extends Pet{


    public Cat(String name,
               float speed1) {
        super(name, speed1);


    }
    private static int count;
    private static int countPet;

    public void Cat (String name,
                     float speed1,
                     float speed2){
        this.name = name;
        this.speed1 = speed1;
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
