
public class Main {
    public static void main(String[] args) {

        // Task 1
        int countUp = 0;
        while (countUp <= 20) {
            System.out.println(countUp);
            countUp++;
        }

        // Task 2
        int countDown = 20;
        while (countDown >= 0) {
            System.out.println(countDown);
            countDown--;
        }

        // Task 3
        int countByThree = 0;
        while (countByThree <= 24) {
            System.out.println(countByThree);
            countByThree += 3;
        }

        // Task 4
        int countByTwo = 12;
        while (countByTwo >= 0) {
            System.out.println(countByTwo);
            countByTwo -= 2;
        }

        // Task 5
        for (int row = 1; row <= 5; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Task 6
        for (int row = 6; row >= 1; row--) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Task 7
        for (int row = 1; row <= 6; row++) {
            for (int star = 1; star <= 5; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

