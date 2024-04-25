package unit06;

public class bet {
    private int betAmount;
    private int betIndex;
    private Color color;

    public bet(int betAmount, int betIndex) {
        this.betAmount = betAmount;
        this.betIndex = betIndex;
    }

    public bet(int betAmount, Color color) {
        this.betAmount = betAmount;
        this.color = color;
        this.betIndex = -1;
    }

    public int getBetIndex() {
        return this.betIndex;
    }

    public int getBetAmount() {
        return this.betAmount;
    }

    public Color getColor() {
        return this.color;
    }

}
