package de.fsj.nb;

public class NetBankingService {
	public String transferMoney(long srcAccount, long destAccount, String ifsCode, double amount) {
		return amount + " ist transfered from  "+  srcAccount + "to" + destAccount;
	}

}
