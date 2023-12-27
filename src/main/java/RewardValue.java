public class RewardValue {
    private final double cashValue;
    private final double milesValue;

    // constructor accepting cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // constructor accepting miles value
    public RewardValue(double milesValue, boolean isMiles){
        if (isMiles){
            this.milesValue = milesValue;
            this.cashValue = milesValue * 0.0035;
        }
        else {
            throw new IllegalArgumentException("invalid constructor usage, Please use the constructor with cash value.");
        }
    }

    // get cash value
    public double getCashValue(){
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }
}
