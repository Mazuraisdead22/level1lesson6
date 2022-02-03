package lesson6;

public class Main {
    public static void main(String[] args) {
        Pet[] pets = new Pet[4];
        pets[0] = new Cat("Кот", 50);
        pets[1] = new Cat("Кошка", 56);
        pets[2] = new Dog("Пес", 70, 30);
        pets[3] = new Dog("Собака", 75, 25);
        for (int i = 0; i < pets.length; i++) {
            if(pets[i].speed1 < 500 || pets[i].speed2 < 10){
                System.out.println("неудача");
            }

        }
        System.out.println("Список животных и результат");
        for (int i = 0; i < pets.length; i++) {
            System.out.println(pets[i].speed1 + pets[i].speed2);
        }

        System.out.println("Всего животных " + pets.length);

    }
}
