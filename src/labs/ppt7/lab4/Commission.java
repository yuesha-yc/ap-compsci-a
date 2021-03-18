package labs.ppt7.lab4;

public class Commission extends Employee {
    private double commission;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commission = 0;
    }

    public void awardCommission(double commission) {
        this.commission = commission;
    }

    public double pay() {
        double payment = super.pay() + commission;
        commission = 0;
        return payment;
    }
}
