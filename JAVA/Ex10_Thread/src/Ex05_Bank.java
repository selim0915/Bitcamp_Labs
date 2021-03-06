
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
 
/*
 1.클래스다이어그램 
 2. 계좌를 ArrayList에 저장
 3. HashMap<이름, 계좌(클래스)>
 4. HashMap<계좌번호, 계좌(클래스)>
 5. HashMap 파일로 저장
 6. HashMap 데이터(객체)를 불러오기
 * 
 */

// 은행
class Bank {
    private Map<String, Account> nameAccount; //이름, 계좌
    private Map<String, Account> accountNoAccount; //계좌번호, 계좌
    private int totalAccount; // 총계좌수
    
    Bank(){
    	this.nameAccount =  new HashMap<>();
    	this.accountNoAccount =  new HashMap<>();
    }
    
    // 계좌를 생성한다
    public void addAccount(String accountNo, String name) {
        //accounts.add(new Account(accountNo, name));
    	nameAccount.put(name, new Account(accountNo, name));
    	accountNoAccount.put(accountNo, new Account(accountNo, name));
    	
        this.totalAccount++;
    }
    
    // 계좌를 찾는다(계좌번호로)
    public void getAccount(String accountNo) {
    	accountNoAccount.get(accountNo);
    	System.out.println("찾는 계좌번호: "+accountNo +" / 당신의 계좌는: "+ accountNoAccount.get(accountNo));
    }
    
    // 계좌를 찾는다(소유자명으로)
    public void findAccount(String name) {
    	accountNoAccount.get(name);
    	System.out.println("찾는 이름: "+name +" / 당신의 계좌는: "+ nameAccount.get(name));
    }

    //계좌를 본다
	public Map<String, Account> getAccountNoAccount() {
		Set<String> set =accountNoAccount.keySet();
		List<String> li = new ArrayList<>(set);
		Collections.sort(li);
		
		Iterator<String> it = li.iterator();
		while(it.hasNext()) {
			String aa =it.next();
			System.out.println(accountNoAccount.get(aa));
		}
		return accountNoAccount;
	}
	
	// 총 계좌수를 반환한다
    public int getTotalAccount() {
        return totalAccount;
    }

}
 
//계좌
class Account {
    private String accountNo; // 계좌번호
    private String name; // 소유자명
    private long balance; // 잔고
    private ArrayList<Transaction> transaction; // 거래내역(0개이상)
    private Calendar cal;  // 캘린더
    private SimpleDateFormat dateFormat;  // 현재 날짜
    private SimpleDateFormat timeFormat;  // 현재 시간
    public Account(String accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = 0;
        this.transaction = new ArrayList<Transaction>();
        cal = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        timeFormat = new SimpleDateFormat("HH:mm:ss");
    }
    public String getAccountNo() {
        return accountNo;
    }
    public String getName() {
        return name;
    }
    // 입금한다
    public void deposit(long amount) {
        this.balance += amount;
        transaction.add(new Transaction(dateFormat.format(cal.getTime()), timeFormat.format(cal.getTime()), "입금",
                amount, balance));
    }
    // 출금한다
    public void withdraw(long amount) {
        if (balance < amount) {
            System.out.println("잔고가 부족합니다");
        } else {
            this.balance -= amount;
            transaction.add(new Transaction(dateFormat.format(cal.getTime()), timeFormat.format(cal.getTime()), "입금",
                    amount, balance));
        }
    }
 
    // 잔고를 확인한다
    public long getBalance() {
        return balance;
 
    }
 
    // 거래내역을 본다
    public ArrayList<Transaction> getTransactions() {
        return transaction;
 
    }
 
    @Override
    public String toString() {
        return "계좌번호 = " + accountNo + ", 소유자 = " + name + ", 잔고 = " + balance;
    }
}
 
//거래내역
class Transaction {
    private String transactionDate; // 거래일
    private String transactionTime; // 거래시간
    private String kind; // 구분(입금 또는 출금)
    private long amount; // 거래금액
    private long balance; // 잔고
 
    public Transaction(String transactionDate, String transactionTime, String kind, long amount, long balance) {
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.kind = kind;
        this.amount = amount;
        this.balance = balance;
    }
 
    @Override
    public String toString() {
        return "거래일 = " + transactionDate + ", 거래시간 = " + transactionTime + ", 구분 = " + kind + ", 거래금액 = " + amount
                + ", 잔고 = " + balance;
    }
 
}
 
public class Ex05_Bank {
 
    public static void main(String[] args) {
    	
        Bank bank = new Bank();
        bank.addAccount("110398349277", "권태환");
        bank.addAccount("110234598373", "정진호");
        bank.addAccount("110859342648", "김동민");
        bank.addAccount("110759835759", "우세림");
        bank.addAccount("110874950438", "장지훈");
        bank.addAccount("110847247358", "윤종석");
        
        
        bank.getAccount("110398349277");
        bank.findAccount("윤종석");
        bank.getAccountNoAccount();
 
//        bank.getAccount("110398349277"); // 계좌번호로 계좌찾기
//        bank.findAccount("권태환"); // 예금주로 계좌찾기
//        System.out.println(bank.getTotalAccount()); // 등록되어있는 계좌 개수
//        bank.getAccounts().get(0).deposit(1000);
//        bank.getAccounts().get(0).withdraw(200);
//        System.out.println(bank.getAccounts().get(0).getBalance());
//        System.out.println(bank.getAccounts().get(0).getTransactions());
 
    }
 
}
