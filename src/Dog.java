public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        myDogs[0].name = "Fred";
        myDogs[1].name = "Jorje";
        System.out.println("Name last dog " + myDogs[2].name);
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
        myDogs[0].eat();
    }

    public void bark() {
        System.out.println(name + " - Woof - woof!");
    }

    public void eat() {
        System.out.println("Nyam-nyam");
    }

    public void chaseCat() {
    }
}

