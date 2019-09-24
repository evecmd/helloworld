public class User {
	public static void main(String[] args) {
		Operation operation=null;
		// 此处可以更改为其他运算符 而其他地方可以保持不变
		String op="-"; 
		operation = OperationFactory.createOperation(op);
		operation.setNum1(99);
		operation.setNum2(97);
		System.out.println(operation.getResult());
	}
}