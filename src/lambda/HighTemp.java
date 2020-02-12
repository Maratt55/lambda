package lambda;

public class HighTemp {
    private int hTemnp;

    public HighTemp(int hTemnp) {
        this.hTemnp = hTemnp;
    }

    boolean sameTemp(HighTemp ht2) {
        return hTemnp == ht2.hTemnp;
    }

    boolean lessThanTemp(HighTemp ht2){
        return hTemnp < ht2.hTemnp;
    }
}
