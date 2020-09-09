package linerList.polynomialExample;

public class Term {
    private int coe;
    private int exp;

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
