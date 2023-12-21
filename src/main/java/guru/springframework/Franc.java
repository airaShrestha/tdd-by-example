package guru.springframework;

public class Franc extends Money{

    //private int amount;
    //private String currency;
    public Franc(int amount, String currency){
        super(amount,currency);
    }



    public Money times(int multiplier){
        //amount = amount *multiplier;
        return Money.franc(amount *multiplier);
    }

    /*public boolean equals(Object object){
        Money franc = (Money) object;
        return amount == franc.amount;
    }*/
}
