package in.synxt.oopsleftovers;

import java.util.Arrays;
import java.util.Objects;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private Gender gender;
	private Policy[] policies = new Policy[4];
	private int numberOfpolicies = 0; 
	public static String timings = "9:00AM-5:00PM";
	public static class Policy {
		private int policyId;
		private String policyVendor;
		private double insuredAmount;
		private double premiumAmout;
		public int getPolicyId() {
			return policyId;
		}
		public void setPolicyId(int policyId) {
			this.policyId = policyId;
		}
		public String getPolicyVendor() {
			return policyVendor;
		}
		public void setPolicyVendor(String policyVendor) {
			this.policyVendor = policyVendor;
		}
		public double getInsuredAmount() {
			return insuredAmount;
		}
		public void setInsuredAmount(double insuredAmount) {
			this.insuredAmount = insuredAmount;
		}
		public double getPremiumAmout() {
			return premiumAmout;
		}
		public void setPremiumAmout(double premiumAmout) {
			this.premiumAmout = premiumAmout;
		}
		@Override
		public String toString() {
			return "Policy [policyId=" + policyId + ", policyVendor=" + policyVendor + ", insuredAmount="
					+ insuredAmount + ", premiumAmout=" + premiumAmout + "]";
		}
		
	};

	
	public Employee(int empId) {
		super();
		this.empId = empId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Policy[] getPolicies() {
		return policies;
	}
	
	public void addPolicy(int policyId,String policyVendor,double insuredAmount,double premiumAmount) {
		Policy policy = new Policy();
		policy.setPolicyId(policyId);
		policy.setPolicyVendor(policyVendor);
		policy.setPremiumAmout(premiumAmount);
		policy.setInsuredAmount(insuredAmount);
		this.policies[numberOfpolicies] = policy;
		numberOfpolicies++;
	}
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", gender=" + gender
				+ ", policies=" + Arrays.toString(policies) + ", numberOfpolicies=" + numberOfpolicies + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId;
	}
	
	
}
