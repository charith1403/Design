package org.charith;

import Observable.WeatherStation;
import Observer.Display;
import Observer.PhoneDisplay;
import Observer.TvDisplay;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TvDisplay tvDisplay = new TvDisplay();
        station.add(phoneDisplay);
        station.add(tvDisplay);
        station.notifyObservers();
    }
}