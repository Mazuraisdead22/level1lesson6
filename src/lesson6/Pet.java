package lesson6;

public class Pet {

    protected String name;
    protected float speed1;
    protected float speed2;
    private static int count;

    public Pet(String name, float speed1){
        count++;
    }

    public static int getCount(){
        return count;
    }

    protected void run(int obstacleLength) {
        if (speed1 >= obstacleLength) {
            System.out.println(this.speed1 + " по кличке " + this.name + "  успех " + obstacleLength);
        } else {
            System.out.println(this.speed1 + " по кличке " + this.name + " неудача ");
        }
    }

    protected void swim(int obstacleWater) {
        if (speed2 >= obstacleWater) {
            System.out.println(this.speed2 + " по кличке " + this.name + " успех " + obstacleWater);
        } else {
            System.out.println(this.speed2 + " по кличке " + this.name + " неудача ");
        }

    }
}
