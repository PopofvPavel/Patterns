package task2;

public class Request {
    private String FIO;
    private String email;
    private int age;

    private int yearIncome;
    private int currentCreditAmount;
    private int currentDebt;

    private int newDebt;
    private int rate;
    private int period;
    private int monthPayment;

    public Request(String FIO, String email, int age, int yearIncome, int currentCreditAmount,
                   int currentDebt, int newDebt, int rate, int period, int monthPayment) {
        this.FIO = FIO;
        this.email = email;
        this.age = age;
        this.yearIncome = yearIncome;
        this.currentCreditAmount = currentCreditAmount;
        this.currentDebt = currentDebt;
        this.newDebt = newDebt;
        this.rate = rate;
        this.period = period;
        this.monthPayment = monthPayment;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearIncome() {
        return yearIncome;
    }

    public void setYearIncome(int yearIncome) {
        this.yearIncome = yearIncome;
    }

    public int getCurrentCreditAmount() {
        return currentCreditAmount;
    }

    public void setCurrentCreditAmount(int currentCreditAmount) {
        this.currentCreditAmount = currentCreditAmount;
    }

    public int getCurrentDebt() {
        return currentDebt;
    }

    public void setCurrentDebt(int currentDebt) {
        this.currentDebt = currentDebt;
    }

    public int getNewDebt() {
        return newDebt;
    }

    public void setNewDebt(int newDebt) {
        this.newDebt = newDebt;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getMonthPayment() {
        return monthPayment;
    }

    public void setMonthPayment(int monthPayment) {
        this.monthPayment = monthPayment;
    }
}
