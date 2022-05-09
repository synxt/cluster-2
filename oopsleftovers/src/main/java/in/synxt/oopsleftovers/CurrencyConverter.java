package in.synxt.oopsleftovers;

public abstract class CurrencyConverter {
	public double convert(double sourceAmt) {
		//100lines of code
		return sourceAmt/getConvertionRate();
	}
	public abstract double getConvertionRate();	
}
