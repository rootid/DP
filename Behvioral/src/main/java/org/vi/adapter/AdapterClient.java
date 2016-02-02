package org.vi.adapter;

/**
 *
 */
public class AdapterClient {

    public static void main(String[] args) {
        Timer timer = new TimerFactory();
        //Create Event object and access the Timer functionality
        Event timeradapter = new TimerAdapter(timer);
        testEvent(timeradapter);
    }


    static void testEvent(Event event) {
        event.start();
        event.stop();

    }

}
