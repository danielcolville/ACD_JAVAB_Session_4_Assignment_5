package session3;

import java.util.Scanner;

public class Account {
	private int accNo;
	private String accName;
	private String accBal;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccBal() {
		return accBal;
	}
	public void setAccBal(String accBal) {
		this.accBal = accBal;
	}
	Account(int accNo,String accName,String accBal) {
		this.accNo=accNo;
		this.accName=accName;
		this.accBal=accBal;
	}
	static class Saving extends Account{
		Saving(int accNo,String accName,String accBal,double rateOfInt) {
			super(accNo,accName,accBal);
			this.rateOfInt=rateOfInt;
		}
		private double rateOfInt;
		private int accNo;
		private String accName;
		private String accBal;
		public double getRateOfInt() {
			return rateOfInt;
		}
		public void setRateOfInt(int rateOfInt) {
			 this.rateOfInt=rateOfInt;
		}
	}
	static class Current extends Account {
		Current(int accNo,String accName,String accBal,double rateOfInt) {
			super(accNo,accName,accBal);
			this.rateOfInt=rateOfInt;
		}
		private double rateOfInt;
		private int accNo;
		private String accName;
		private String accBal;
		public double getRateOfInt() {
			return rateOfInt;
		}
		public void setRateOfInt(int rateOfInt) {
			 this.rateOfInt=rateOfInt;
		}
	}
	static class testAccount {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter account Name:");
			String tempName=scan.next();
			System.out.print("Enter account balance:");
			String accB=scan.next();
			System.out.print("Enter account Number:");
			int accN=scan.nextInt();
			System.out.print("Enter Interest Rate:");
			double tempRate=scan.nextDouble();
			Saving svAcc=new Saving(accN,tempName,accB,tempRate);
			System.out.println("Account name is :"+svAcc.getAccName());
			System.out.println("Account balance is :"+svAcc.getAccBal());
			System.out.println("Account number is :"+svAcc.getAccNo());
			System.out.println("Interest Rate is:"+svAcc.getRateOfInt());
			
			System.out.print("Enter account Name:");
			tempName=scan.next();
			System.out.print("Enter account balance:");
			accB=scan.next();
			System.out.print("Enter account Number:");
			accN=scan.nextInt();
			System.out.print("Enter Interest Rate:");
			tempRate=scan.nextDouble();
			Current currAcc=new Current(accN,tempName,accB,tempRate);
			System.out.println("Account name is :"+currAcc.getAccName());
			System.out.println("Account balance is :"+currAcc.getAccBal());
			System.out.println("Account number is :"+currAcc.getAccNo());
			System.out.println("Interest Rate is:"+currAcc.getRateOfInt());
			
		}
	}
}
