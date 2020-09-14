package bigO;

/**
 * Examples for O time complexity analysis.
 *
 */
public class BigOExampleTwo {

    /**
     * O(n)
     * @param n
     * @return
     */
    public int caseOne(int n) {
        switch (n) {
            case 1:
                System.out.println("case 1");
            case 2:
                System.out.println("case 2");
            case 100:
                System.out.println("case 100");
            default:
                System.out.println("very bad");
        }
        int sum = 0;
        for (int i = 0; i < n / 2; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * O(m + n)
     * @param m
     * @param n
     * @return
     */
    public int caseTwo(int m, int n) {
        int sumOne = 0;
        int sumTwo = 0;
        for (int i = 0; i < n / 2; i++) {
            sumOne += i;
        }
        for (int j = 100; j < m / 3; j++) {
            sumTwo += j;
        }
        return sumOne + sumTwo;
    }

    /**
     * O(n^2)
     * @param n
     * @return
     */
    public int caseFour(int n) {
        int sumOne = 0;
        int sumTwo = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                sumOne += j;
            }
            for (int k = 100; k < n / 6; k++) {
                sumTwo += k;
            }
        }
        return sumOne + sumTwo;
    }

    /**
     * O(n^2)
     * @param n
     */
    public void caseThree(int n) {
        for (int i = 0; i < n; i++) {
            caseOne(n / 2);
        }
    }



}
