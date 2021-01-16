package ch10;

public class Won2Doller extends Converter {
	public Won2Doller(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		return src / ratio;
	}
	
	@Override
	protected String srcString() {
		return "원";
	}
	
	@Override
	protected String destString() {
		return "달러";
	}
	
}
