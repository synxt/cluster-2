package in.synxt.collections;


import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
class AccountNameComparator implements Comparator<Account>{

	@Override
	public int compare(Account accOne, Account accTwo) {		
		return accOne.getName().compareTo(accTwo.getName());
	}
	
}

class AccountIdComparator implements Comparator<Account>{

	@Override
	public int compare(Account accOne, Account accTwo) {		
		return accOne.getId().compareTo(accTwo.getId());
	}
	
}

class AccountBalanceComparator implements Comparator<Account>{

	@Override
	public int compare(Account accOne, Account accTwo) {		
		return accOne.getBalance().compareTo(accTwo.getBalance());
	}
	
}

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<Account> accounts = new TreeSet<Account>(new AccountBalanceComparator());
		
		accounts.add(new Account(1,"Sri Latha",150000.0));
		accounts.add(new Account(2,"Shambhavi",1800000000.0));
		accounts.add(new Account(3,"Kavitha",50000.0));
		accounts.add(new Account(4,"Rajini",250000.0));
		accounts.add(new Account(5,"Sujatha",650000.0));
		
		System.out.println(accounts.tailSet(new Account(0,"",250000.0)));
		
		
		
		/*
		 * SortedSet<Integer> ages = new TreeSet<Integer>(); ages.add(15); ages.add(18);
		 * ages.add(10); ages.add(12); ages.add(26); ages.add(7); ages.add(52);
		 * ages.add(36); ages.add(40); ages.add(62); ages.add(76);
		 * 
		 * System.out.println(ages.headSet(36)); System.out.println(ages.tailSet(36));
		 * SortedSet<Integer> teenagers = ages.subSet(12,18); teenagers.add(53);
		 * System.out.println(teenagers); System.out.println(ages);
		 */		
		
		
	}
}
