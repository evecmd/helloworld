import operation.*;
import operationFactory.*;

public class User {
	public static void main(String[] args) {
		Operation operation=null;
		String op="-"; 
		operation = OperationFactory.createOperation(op);
		operation.setNum1(99);
		operation.setNum2(97);
		System.out.println(operation.getResult());
	}
}