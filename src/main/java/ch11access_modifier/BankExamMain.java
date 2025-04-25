package ch11access_modifier;

public class BankExamMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();
        Bank bank3 = new Bank();

        bank1.setAccountHolder("김일");
        bank1.setAccountNum(123456789);
        bank1.setBalance(100000);
        bank1.setPinNumber(4646);

        bank2.setAccountHolder("김이");
        bank2.setAccountNum(223456789);
        bank2.setBalance(100000);
        bank2.setPinNumber(4649);

        bank3.setAccountHolder("김삼");
        bank3.setAccountNum(323456789);
        bank3.setBalance(100000);
        bank3.setPinNumber(4647);

        bank1.displayInfo();
        bank2.displayInfo();
        bank3.displayInfo();

        bank1.withdraw(500,4646);
    }
}
