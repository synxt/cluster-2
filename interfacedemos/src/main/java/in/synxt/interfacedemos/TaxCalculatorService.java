package in.synxt.interfacedemos;

public class TaxCalculatorService extends SuperTaxCalulator implements FourAndFive,ThreeAndFive, All {
	
	public String method1() {
		method2();
		return "One";
	}
	
	public String method2() {		
		return "Two";
	}
	
	public String method3() {
		return "Three";
	}
	
	public String method4(String value) {
		return value;
	}
	
	public String method5(String firstValue, String secondValue) {
		return firstValue.concat(secondValue);
	}
	
	public void method6() {
		System.out.println("Its method sex");
		return;
	}
	
	public String method6(String firstValue, String secondValue) {
		return firstValue.concat(secondValue);
	}
	
	@Override
	public void method7(int repeat) {
		for(int i = 0;i<repeat;i++) {
			System.out.println("Method Seven Repeat Count"+(i+1));
		} 
	}
	@Override
	public String method8() {
		return "8";
	}
}
