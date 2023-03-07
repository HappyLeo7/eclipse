package exx06;

public class Max1<T> {
	   public <T extends Number> T max(T a, T b) {
	        return a.doubleValue() < b.doubleValue() ? b : a;
	    }

	    public <T extends String> T max(T a, T b) {
	        return a.length() < b.length() ? b : a;

	    }

	}

