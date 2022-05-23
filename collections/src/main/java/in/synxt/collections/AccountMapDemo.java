package in.synxt.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AccountMapDemo {
	public static void main(String[] args) {
		Set<Account> accounts = new HashSet<Account>();
		accounts.add(new Account(1,"Keerthi",152000.0));
		accounts.add(new Account(2,"Preethi",52000.0));
		accounts.add(new Account(3,"Shruthi",25200.0));
		accounts.add(new Account(4,"Maitri",32200.0));
		
		for(Account acc:accounts) {
			if(acc.getId()==4) {
				System.out.println(acc.getBalance());
				break;
			}
		}
		
		Map<Integer,Account> accountsMap = new HashMap<Integer, Account>();
		accountsMap.put(1, new Account(1,"Keerthi",152000.0));
		accountsMap.put(2, new Account(2,"Preethi",52000.0));
		accountsMap.put(4, new Account(3,"Shruthi",25200.0));
		accountsMap.put(3, new Account(4,"Maitri",32200.0));
		accountsMap.put(5, new Account(1,"Keerthi",152000.0));
		accountsMap.put(6, new Account(2,"Preethi",52000.0));
		accountsMap.put(7, new Account(3,"Shruthi",25200.0));
		accountsMap.put(8, new Account(4,"Maitri",32200.0));
		System.out.println(accountsMap);
		System.out.println(accountsMap.get(4).getBalance());
		
		
	}
}
