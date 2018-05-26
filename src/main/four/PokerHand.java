package four;

public class PokerHand {
    private String hand;

    PokerHand(String hand) {
        this.hand = hand;
    }

    public Result compareWith(PokerHand hand) {
        return Result.TIE;
    }

    public enum Result {
        TIE, WIN, LOSS
    }
}
