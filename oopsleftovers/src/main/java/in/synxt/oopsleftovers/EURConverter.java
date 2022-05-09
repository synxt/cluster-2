package in.synxt.oopsleftovers;

public class EURConverter extends CurrencyConverter{
	public double getConvertionRate() {		
		return 102;
	}	
	@Override
	public String toString() {
		return "[EUR Converter,Convertion Rate:"+getConvertionRate()+"]";
	}
}
