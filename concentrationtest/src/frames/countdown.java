package frames;

import java.util.Timer;
import java.util.TimerTask;

/* warum zum f*** passiert nichts wenn man 
 * startet und es wird nur der countdown
 * in der befehlszeile ausgegeben
 * :D
 * :D
 * */

public class countdown {
    public static void main(final String args[]) {
       if (args.length < 0) {
            System.err.println("Usage: java Countdown <time in secs > 0>");
            System.exit(1);
        }
        final Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 20;
            
            public void run() {
                System.out.println(i--);
                if (i< 0)
                    timer.cancel();
            }
        }, 0, 1000);
    }
}