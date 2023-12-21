package guru.springframework;

public class Money implements Expression {
    protected int amount;
    protected  String currency;

    public Money(int amount, String currency) {
        this.amount=amount;
        this.currency=currency;
    }

    protected  String currency(){
        return currency;
    }
    public static  Money dollar(int amount){
        return new Money(amount, "USD");
    }

    public  static  Money franc(int amount){
        return  new Money(amount, "CHF");
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
                && this.currency == money.currency;
    }

    public Money times(int multiplier){
         //amount = amount *multiplier;
         return new Money( amount *multiplier, this.currency);
    }

    public Expression plus(Money addend){
        return new Money(amount+addend.amount, currency);
    }

}
