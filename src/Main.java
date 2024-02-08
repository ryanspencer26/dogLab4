import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {

//        Dog dog = new Dog("Junko");
//        Labrador lab = new Labrador("Stompn", "red");
//        Yorkshire york = new Yorkshire("Spoit", 3);
//
//        System.out.println(dog.getName() + " says " + dog.bark());
//        System.out.println(lab.getName() + " says " + lab.bark());
//        System.out.println(york.getName() + " says " + york.bark());
//
//        york.waddle();
        // lab.waddle();
        // Doesn't work because waddle() in Yorkshire class
        // which is a sibling (not parent) of the Labrador class
//        lab.waddle();
//
//        Dog[] fam = new Dog[3];
//        fam[0] = new Dog("Prateek");
//        fam[1] = new Labrador("Jacquette", "blonde");
//        fam[2] = new Yorkshire("Longsnapper", 15);
//
//        for(int i = 0; i < fam.length; i++){
//
//            System.out.println(fam[i].bark());
//
//        }
//
//        for(Dog doge: fam){
//
//            System.out.println(doge.bark());
//
//        }
//
//        ((Labrador)(fam[1])).waddle();
        // needed cast because waddle is not in superclass Dog
        // and all items in [] are stored as a Dog

        // bark method still works because it's in superclass Dog
        // and gets inherited by subclasses Labrador and Yorkshire

//        ArrayList<Dog> pack = new ArrayList<Dog>(3);
//        pack.add(new Dog("Teeky"));
//        pack.add(new Labrador("DeSean", "gray"));
//        pack.add(new Yorkshire("Lukie", 16));
//
//        for(int i = 0; i < pack.size(); i++){
//
//            System.out.println(pack.get(i).bark());
//
//        }
//
//        for(Dog doge: pack){
//
//            System.out.println(doge.bark());
//
//        }
//
//        ((Labrador)(pack.get(1))).waddle();

        ArrayList<Animal> gang = new ArrayList<Animal>();
        gang.add(new Dog("Nicholas"));
        gang.add(new Labrador("gogineni", "black"));
        gang.add(new Yorkshire("googs", 17));

        gang.get(0).setAge((int)(Math.random() * 10 + 1));
        gang.get(1).setAge((int)(Math.random() * 10 + 1));
        gang.get(2).setAge((int)(Math.random() * 10 + 1));

    }
}
