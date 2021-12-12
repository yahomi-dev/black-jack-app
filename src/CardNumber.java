public enum CardNumber {
    ACE   (1),
    DEUCE (2),
    TREY  (3),
    CATER (4),
    CINQU (5),
    SICE  (6),
    SEVEN (7),
    EIGHT (8),
    NINE  (9),
    TEN   (10),
    JACK  (11),
    QUEEN (12),
    KING  (13);

    private int cardNumber;

    private CardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
