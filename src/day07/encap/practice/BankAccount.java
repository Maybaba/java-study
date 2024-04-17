package day07.encap.practice;

import day07.encap.practice.Student;

public class BankAccount {
    //field
    int id; //식별번호
    private String accountHolder;
    private String accountNumber;
    private Student [] myAccounts;
    private long balance;

    //constructor
    // 사용자가 제공하는 데이터 : balance, accountNumber, accountHolder
    public BankAccount(String accountHolder, String accountNumber, long balance) {
        this.id = 1; //this 에 전달받은 데이터 저장
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public long getBalance() {
        return balance;
    }
    public void deposit(int i) {
        if(i < 0) {
            System.out.println("입금액은 음수일 수 없음!!");
            return;
        }
        balance = this.balance + i; //어떻게 i 의 날짜같은 기능들을 더하지?? 라고 생각해서 막혔음 ㅋㅋ
    }
    public void withdraw(int i) {
        if(i < 0 || i > this.balance) {
            System.out.println("출금액이 잔액보다 많거나 잘못된 출금액임!!");
        }
        balance = this.balance - i;
    }
}


