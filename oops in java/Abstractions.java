abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class horse extends Animal{
    void walk(){
        System.out.println("walk on 4 leg");
    }
}
class chiken extends Animal{
    void walk(){
        System.out.println("walk on 2 leg");
    }
}
public class Abstractions {
    public static void main(String[] args) {
        horse h=new horse();
        h.eat();
        h.walk();

        chiken c=new chiken();
        c.eat();
        c.walk();
    }
}
