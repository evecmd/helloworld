public class OperationSub extends Operation {
	// 重写父类方法
	@Override
	public double getResult() {
		return this.getNum1()-this.getNum2();
	}
}