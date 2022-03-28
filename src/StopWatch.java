import java.util.Scanner;

public class StopWatch {
    public static long startTimer = 0;
    public static long stopTimer = 0;
    public static long elapsed = 0;

    public static void start() {
        startTimer = System.currentTimeMillis();
        System.out.println("Start Time is: " + startTimer);
    }

    public static void stop() {
        stopTimer = System.currentTimeMillis();
        System.out.println("Stop Time is: " + stopTimer);
    }

    public static long getElapsedTime() {
        elapsed = stopTimer - startTimer;
        return elapsed;
    }

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("Press '1' to Start Time: ");
        u.nextLong();
        start();

        System.out.println();
        System.out.println("Press '2' to Stop Time: ");
        u.nextLong();
        stop();

        long timelapse = getElapsedTime();
        System.out.println();
        System.out.println("Total Time Elapsed(in millisecond) is:" + timelapse);
        System.out.println();
        System.out.println("Converting millisecond to seconds: " + (timelapse / 1000) + " sec");
    }
}

