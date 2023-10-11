import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		List<Integer> listNum = new ArrayList<Integer>();
		List<ValuesOp> values = new ArrayList<ValuesOp>();
		ValuesOp value = null;
		Validations validatations =  new Validations();
		
		Scanner sc = new Scanner(System.in);
		
		String input = "";
		Integer x = 0;
		Integer y = 0;
		
		try {
			System.out.println("Input Data:");
			input = sc.nextLine();
			
			x = Integer.valueOf(input.split(" ")[0]);
			y = Integer.valueOf(input.split(" ")[1]);
			
			validatations.validateX(x);
			validatations.validateY(y);
			
			for(int i = 0; i < x; i++) {
				listNum.add(0);
			}
			
			for(int i = 0; i < y; i++) {
				value = new ValuesOp();
				input = sc.nextLine();
				
				validatations.validateI(Integer.valueOf(input.split(" ")[0]), x);
				value.setI(Integer.valueOf(input.split(" ")[0]));
				
				validatations.validateJ(Integer.valueOf(input.split(" ")[1]), x, value.getI());
				value.setJ(Integer.valueOf(input.split(" ")[1]));
				
				validatations.validateK(Integer.valueOf(input.split(" ")[2]));
				value.setK(Integer.valueOf(input.split(" ")[2]));
	
				values.add(value);
			}
		} finally {
			sc.close();
		}
		
		for(ValuesOp op : values) {
			for( int i = op.getI(); i <= op.getJ(); i++) {
				listNum.set(i-1, (listNum.get(i-1) + op.getK()) );
			}
		}
		
		System.out.println( "Max Num: " + Collections.max(listNum));
	}
}

 