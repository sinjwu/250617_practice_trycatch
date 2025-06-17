class greeting {
    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

@FunctionalInterface
interface A {
    public void say(String name);
}

public class Util2 {
    public static void main(String[] args) {
        //A a = (name) -> greeting.sayHello(name);
        A a = greeting::sayHello;
        a.say("sinjwu");
    }
}
