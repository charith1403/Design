package Observer;

public class TvDisplay implements Display {
    @Override
    public void update() {
        System.out.println("Tv Display");
    }
}
