package abstract_;

public class Cat extends Animal{
    @Override
    public void cry() {
        System.out.println(getName()+"喵喵~ ");
    }
}
