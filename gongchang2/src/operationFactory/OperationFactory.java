package operationFactory;
import operation.*;
import operationAdd.*;
import operationSub.*;
public class OperationFactory {
	public static Operation createOperation(String op) {
		
		Operation operation=null;
		// �жϲ���ȷ�Ͻ����صĶ���
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
