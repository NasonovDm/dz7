package dz7;

public class Main {

//   Не разобрался как сделать котов голодными

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Vaska", 60),
                new Cat("Baron", 50),
                new Cat("Enya", 25),
                new Cat("Murka", 5),
                new Cat("Agata", 2),
        };

        Plate plate = new Plate(50);
        for (Cat cat : cats){
            cat.eat(plate);
            cat.info();
        }

    }
}



