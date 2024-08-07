package abstract_;

public class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println(getName()+"汪汪的叫");
    }
}
