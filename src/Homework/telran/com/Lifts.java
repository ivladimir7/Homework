package Homework.telran.com;


public class Lifts {

    public static void main(String args[]) throws Exception {
        int[] floors = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int posA = 0;
        int posB = 8;

        for (int reqPos: floors) {
            final int distA = Math.abs(reqPos - posA);
            final int distB = Math.abs(reqPos - posB);

            if (distA < distB) {
                posA = reqPos;
                System.out.println("A");
            } else if (distA == distB) {
                if (posA < posB) {
                    posA = reqPos;
                    System.out.println("A");
                } else {
                    posB = reqPos;
                    System.out.println("B");
                }
            } else {
                posB = reqPos;
                System.out.println("B");
            }
        }
    }
}