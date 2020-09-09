package bigO;

public class BigOExample {

    /**
     * 1. 只关注循环执行次数最多的一段代码
     * @param n
     * @return
     */
    int calExample1(int n) {
        int sum = 0;
        int i = 1;
        for (; i <= n; ++i) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     *2. 加法法则：总复杂度等于量级最大的那段代码的复杂度
     * @param n
     * @return
     */
    int calExample2(int n) {
        int sum_1 = 0;
        int p = 1;
        for (; p < 100; ++p) {
            sum_1 = sum_1 + p;
        }

        int sum_2 = 0;
        int q = 1;
        for (; q < n; ++q) {
            sum_2 = sum_2 + q;
        }

        int sum_3 = 0;
        int i = 1;
        int j = 1;
        for (; i <= n; ++i) {
            j = 1;
            for (; j <= n; ++j) {
                sum_3 = sum_3 +  i * j;
            }
        }

        return sum_1 + sum_2 + sum_3;
    }


    /**
     * 3. 乘法法则：嵌套代码的复杂度等于嵌套内外代码复杂度的乘积
     * @param n
     * @return
     */
    int calExample3(int n) {
        int sum_1 = 0;
        int p = 1;
        for (; p < 100; ++p) {
            sum_1 = sum_1 + p;
        }

        int sum_2 = 0;
        int q = 1;
        for (; q < n; ++q) {
            sum_2 = sum_2 + q;
        }

        int sum_3 = 0;
        int i = 1;
        int j = 1;
        for (; i <= n; ++i) {
            j = 1;
            for (; j <= n; ++j) {
                sum_3 = sum_3 +  i * j;
            }
        }

        return sum_1 + sum_2 + sum_3;
    }



    int cal(int m, int n) {
        int sum_1 = 0;
        int i = 1;
        for (; i < m; ++i) {
            sum_1 = sum_1 + i;
        }

        int sum_2 = 0;
        int j = 1;
        for (; j < n; ++j) {
            sum_2 = sum_2 + j;
        }

        return sum_1 + sum_2;
    }

}
