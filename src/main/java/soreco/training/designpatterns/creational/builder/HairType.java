package soreco.training.designpatterns.creational.builder;

public enum HairType {

	BALD, SHORT, CURLY, LONG_STRAIGHT, LONG_CURLY;

	@Override
	public String toString() {
		String s = "";
		switch (this) {
		case BALD:
			s = "bold";
			break;
		case SHORT:
			s = "short";
			break;
		case CURLY:
			s = "curly";
			break;
		case LONG_STRAIGHT:
			s = "long straight";
			break;
		case LONG_CURLY:
			s = "long curly";
			break;
		}
		return s;
	}

}  
