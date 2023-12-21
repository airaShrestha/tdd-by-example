package guru.springframework;

public class Dollar extends Money{
    //private int amount;
    //private String currency;
    public Dollar(int amount, String currency){
        super(amount, currency);
    }

    /*public boolean equals(Object object){
        Money dollar = (Money) object;
        return amount == dollar.amount;
    }*/
}
