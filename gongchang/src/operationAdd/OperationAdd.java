package operationAdd;
import operation.*;
public class OperationAdd extends Operation {
	public double getResult() {
		return this.getNum1()+this.getNum2();
	}

}
