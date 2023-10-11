
public class Validations {
	private static final String ERROR_MSG = "Error: Invalid Value for ";
	
	public void validateX(Integer x) {	
		if( !((3 <= x) && (x <=  10000000)) ) {
			System.out.print(ERROR_MSG + "X");
			System. exit(0);
		}
	}
	
	public void validateY(Integer y) {	
		if( !((1 <= y) && (y <= (2*100000))) ) {
			System.out.print(ERROR_MSG + "Y");
			System. exit(0);
		}
	}
	
	public void validateI(Integer i, Integer x) {	
		if( !((1 <= i) && (i <= x)) ) {
			System.out.print(ERROR_MSG + "I");
			System. exit(0);
		}
	}
	
	public void validateJ(Integer j, Integer x, Integer i) {	
		if( !((i <= j) && (j <= x)) ) {
			System.out.print(ERROR_MSG + "J");
			System. exit(0);
		}
	}

	public void validateK(Integer k) {	
		if( !((0 <= k) && (k <= 1000000000)) ) {
			System.out.print(ERROR_MSG + "K");
			System. exit(0);
		}
	}
	
}
