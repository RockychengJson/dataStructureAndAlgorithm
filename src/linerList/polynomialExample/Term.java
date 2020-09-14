package linerList.polynomialExample;

public class Term {
    private int coe;//多项式系数
    private int exp;//指数

    public Term(int coe, int exp) {
        this.coe = coe;
        this.exp = exp;
    }

    public int getCoe() {
        return coe;
    }

    public void setCoe(int coe) {
        this.coe = coe;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
