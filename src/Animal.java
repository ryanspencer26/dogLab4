public abstract class Animal {

    private int age;

    public Animal(){

        age = 0;

    }

    public abstract void eat();
    // child class must write method

    public void setAge(int age){

        this.age = age;

    }

    public int getAge(){

        return age;

    }

}
