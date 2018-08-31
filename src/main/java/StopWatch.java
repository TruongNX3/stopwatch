import java.util.Random;

public class StopWatch {

    public static long startTime() {
        long millisStart = System.currentTimeMillis();
        return millisStart;
    }

    public static long endTime() {
        long millisEnd = System.currentTimeMillis();
        return millisEnd;
    }
}


class selectionSoft {
    public static void main(String[] args) {
        // seclection 100.000 numbers
        int[] numbers = new int[100000];
        Random rd = new Random();

        long start = StopWatch.startTime();

        for (int i = 0; i < 100000; i++) {
            numbers[i] = rd.nextInt(100000);
        }

        int temp;
        for (int i = 0; i < 100000-1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }
        long end = StopWatch.endTime();

        System.out.println("Thoi gian sap xep la: " + (end - start));

        for (int i = 0; i < 100000; i++) {
            System.out.print(numbers[i] + "\t");
        }
    }
}
