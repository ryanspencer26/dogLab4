// ****************************************************************
// Labrador.java
//
// A class derived from Dog that holds information about
// a labrador retriever.  Overrides Dog speak method and includes
// information about avg weight for this breed.
//
// ****************************************************************


public class Labrador extends Dog {
    private String color; //black, yellow, or chocolate?

    public Labrador(String name,  String color){

        super(name);
        // The error was that name wasn't being initialized
        // use super() to initialize name variable inherited from superclass Dog
        this.color = color;

    }

    public String bark(){

        return "wuf";

    }

    public void waddle(){

        System.out.println(name + " is doing a Lab waddle");

    }

}
