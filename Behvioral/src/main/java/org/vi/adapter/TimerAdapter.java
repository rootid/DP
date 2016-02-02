
package org.vi.adapter;

public class TimerAdapter implements Event {

    Timer timer = null;

    TimerAdapter(Timer timer) {
        this.timer = timer;
    }

    public void start() {
        timer.init();
    }

    public void stop() {
        timer.destory();
    }

    public void configure() {
        timer.setTimer();
    }

    public void change() {
        throw new UnsupportedOperationException("Not supported");
    }


}
