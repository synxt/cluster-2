package in.synxt.interfacedemos;

public class AUDCurrencyConverter extends CurrencyConverter {	
	@Override
	public double convert(double money) {
		return money/15;
	}
}
