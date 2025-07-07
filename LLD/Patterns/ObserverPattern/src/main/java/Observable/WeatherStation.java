package Observable;

import Observer.Display;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Station{
    List<Display> displayList = new ArrayList<>();

    @Override
    public void add(Display display) {
        displayList.add(display);
    }

    @Override
    public void remove(Display display) {
        displayList.remove(display);
    }

    @Override
    public void notifyObservers() {
        if(displayList.isEmpty()){return;}

        for(Display display : displayList){
            display.update();
        }
    }
}
