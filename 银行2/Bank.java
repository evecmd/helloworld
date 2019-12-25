package ����;

import java.util.*;

public class Bank {
	int account;
	private static User user;

	public static void main(String[] args) {
		Bank b = new Bank();
		b.login();
		b.operate();
	}

	public void operate() {
		Bank b = new Bank();
		while (true) {
			System.out.println("��������Ҫ���еĲ������ͣ����س�������");
			System.out.println("��1" + "\n" + "ȡ�2" + "\n" + "��3" + "\n" + "���̣�4" + "\n" + "�˳���0");
			Scanner in = new Scanner(System.in);
			String s = in.nextLine();
			if ("1".equals(s) || "2".equals(s)) {
				int num = 0;
				try {
					System.out.println("�����ȡ�Ľ�");
					num = Integer.parseInt(in.nextLine());
				} catch (Exception e) {
					System.out.println("����������");
					continue;
				}
				switch (s) {
				case "1":
					b.income(num);
					break;
				case "2":
					b.takeout(num);
					break;
				}
			} else if ("3".equals(s)) {
				b.show();
			} else if ("0".equals(s)) {
				System.out.println("�˳�ϵͳ��");
				return;
			} else if("4".equals(s)){
				b.save();
			}else {
				System.out.println("������0~3֮�������ѡ����ز�����");
			}
		}
	}

	public void login() {
		DBUtil dbutil = DBUtil.getInstance();
		System.out.println("��ӭ������������ϵͳ��");
		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.println("���������п���:");
			String cardId = in.nextLine();
			System.out.println("���������п�����:");
			String cardPwd = in.nextLine();
			user = dbutil.getUser(cardId);
			if (dbutil.getUsers().containsKey(cardId) && user.getCardPwd().equals(cardPwd)) {
				System.out.println("��¼�ɹ�����ӭ" + user.getUserName() + "����");
				break;
			} else {
				System.out.println("���п��Ż��������");
				continue;
			}
		}
	}

	public void takeout(int num) {
		if (user.getAccount() >= num) {
			account = user.getAccount() - num;
			user.setAccount(account);
			System.out.println("ȡ�����" + num + "Ԫ�ɹ���");
		} else {
			System.out.println("���㣬ȡ��ʧ��");
		}
	}

	public void show() {
		account = user.getAccount();
		System.out.println("�˻������Ϊ" + account + "Ԫ");
	}

	public void income(int num) {
		account = user.getAccount() + num;
		user.setAccount(account);
		System.out.println("����" + num + "Ԫ�ɹ���");
	}
	
	private void save() {
		DBUtil dbUtil = DBUtil.getInstance();
		dbUtil.update();
	}
}

