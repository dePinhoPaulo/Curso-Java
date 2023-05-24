
package entities;

public class BusinessAcount extends Account{
    private Double loanLimit;

    public BusinessAcount() {
        super();
    }

    public BusinessAcount(Double loanLimit, Integer number, String holder, Double balance) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
    public void loan (double amount){
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
    }
}
