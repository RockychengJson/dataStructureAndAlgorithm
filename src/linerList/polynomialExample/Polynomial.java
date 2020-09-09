package linerList.polynomialExample;

public class Polynomial {
    private Term[] termArray;

    public Polynomial(String polyStr) {
        setTermArray(polyStr);
    }

    /**
     * 从输入的一元多项式中解析出每一项{@link Term}，保存到 termArray中
     *
     * @param polyStr
     */
    private void setTermArray(String polyStr) {
        if (polyStr == null || polyStr.trim().equals(""))
            return;
        String rightPart = polyStr.split("=")[1];
        String[] elements = rightPart.split("\\+");

        this.termArray = new Term[elements.length];

        for (int i = 0; i < elements.length; i++) {
            Term term;
            if (elements[i].contains("^")) {
                //至少2次方，
                String[] tempStrings = elements[i].split("\\^");
                term = new Term(parseCoef(tempStrings[0]), Integer.valueOf(tempStrings[1].trim()));

            } else {
                //常数或者1次方
                if (elements[i].contains("x")) {
                    int coef = parseCoef(elements[i]);
                    term = new Term(coef, 1);
                } else {
                    term = new Term(Integer.valueOf(elements[i].trim()), 0);
                }
            }
            this.termArray[i] = term;
        }
    }

    /**
     * 给定X，计算一元多项式的值
     *
     * @param x
     * @return
     */
    public int calculate(int x) {
        int sum = 0;
        for (Term term : termArray) {
            sum += term.getCoe() * Math.pow(x, term.getExp());
        }
        return sum;
    }

    /**
     * 解析 "2x" ,"x"类的字符串
     *
     * @param coefStr
     * @return
     */
    private int parseCoef(String coefStr) {
        if (coefStr == null || coefStr.equals("")) {
            return 0;
        }
        String temp = coefStr.split("x")[0];
        int coef = 1;
        if (!temp.equals("")) {
            coef = Integer.valueOf(temp.trim());
        }
        return coef;
    }

}
