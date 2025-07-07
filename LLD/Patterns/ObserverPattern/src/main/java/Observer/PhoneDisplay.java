package Observer;

public class PhoneDisplay implements Display {

    @Override
    public void update() {
        System.out.println("Phone Display");
    }
}
