package org.vi.adapter;

/**
 *  
 */
public class AdapterClient {

   Timer timer  = new Timer();
   TimerAdapter timeradapter = new TimerAdapter (timer);
   timeradapter.start();
   timeradapter.stop();
   timeradapter.change();

}
