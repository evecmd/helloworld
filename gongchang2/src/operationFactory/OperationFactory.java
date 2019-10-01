package operationFactory;
import operation.*;
import operationAdd.*;
import operationSub.*;
public class OperationFactory {
	public static Operation createOperation(String op) {
		
		Operation operation=null;
		// 判断并且确认将返回的对象
		switch (op) {
		case "+":
			operation=new OperationAdd();
			break;
		case "-":
			operation=new OperationSub();
			break;
		default:
			break;
		}
		return operation;
	}

}
