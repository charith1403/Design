package Observable;

import Observer.Display;

public interface Station {

    void add(Display display);
    void remove(Display display);
    void notifyObservers();
}
