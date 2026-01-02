 abstract class AnimalAbstract {
    String name;

    AnimalAbstract(){
        name = "Elephant";
    }

    abstract void eats();
}

class GiantAnimal extends AnimalAbstract{
    void eats(){
        System.out.println("Animal eats");
    }
}

public class Animal {

    public static void main(String[] args) {
        GiantAnimal an = new GiantAnimal();
        System.out.println(an.name);
        an.eats();
    }
}


