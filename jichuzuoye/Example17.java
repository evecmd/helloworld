package jichuzuoye;

public class Example17 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Storage st = new Storage();
		Input input = new Input(st);
		Output output = new Output(st);
		new Thread(input).start();
		new Thread(output).start();
	}
}
