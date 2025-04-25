package ch11access_modifier;

public class BamkExam {
    int accountNum;
    String accountHolder;
    int balance;
    int pinNumber;

    public void BankExam(){

    }

    public BamkExam(int accountNum) {
        this.accountNum = accountNum;
    }

    public BamkExam(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public BamkExam(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public BamkExam(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    // grtter /setter
    public int getAccountNum() {
        return accountNum;
    }
    public void setAccountNum(int accountNum) {

        this.accountNum = accountNum;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getPinNumber() {
        return pinNumber;
    }
    public void setPinNumber(int pinNumber) {
        if (pinNumber >9999 ||pinNumber < 0){
            System.out.println("불가능한 비밀번호입니다.");
        }
        this.pinNumber = pinNumber;
    }
    void showAccountInfo(){
        System.out.println(this.accountHolder +"님의 계좌번호는 "+this.accountNum+"이고 잔액은 "+ this.balance+"원 입니다.");
    }
    void deposit(int amount, int inputPin){
        if (amount < 0){
            System.out.println("불가능한 입금 금액입니다.");
        }
        if(inputPin != pinNumber){
            System.out.println("비밀번호가 일치하지 않습니다.");
            return;
        }else {
            amount += balance;
            System.out.println(amount + "원이 입금됐습니다. 남은 잔액은 "+balance+"원 입니다." );
        }
    }
    void withdraw(int amount, int inputPin){
        if (amount < 1) {
            System.out.println("불가능한 출금 금액입니다.");
            System.out.println();
        }else {
            System.out.println(amount + "원이 출금됐습니다. 남은 잔액은 "+balance+"원 입니다." );
             amount -= balance;
        }
    }
    void diplayInfo(){
        System.out.println("계좌번호 : "+this.accountNum);
        System.out.println("예금주 명 : "+this.accountHolder);
        System.out.println("잔액 : "+this.balance);
    }
}
