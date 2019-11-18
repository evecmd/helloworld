package ���żƷ�ϵͳ;

import java.sql.Date;
import java.util.Random;

public class TelcomUser {
	private String phoneNumber;
	private String callTo;
	private StringBuffer communicationRecords;
    public TelcomUser (String phoneNumber) {
    	this.phoneNumber = phoneNumber;
    	this.communicationRecords = new StringBuffer();	
    }
    //ģ��ͨ����¼������
	void generateCommunicateRecords() {
		//�������ͨ����¼��Ŀ
		int recordNum = new Random().nextInt(10);
		for(int i=0;i<=recordNum;i++) {
			//������ɵ�i��ͨ����¼
			
			//��ʼʱ�䣬��ǰʱ��֮ǰ��ĳ�����ʱ��
			long timeStart = System.currentTimeMillis()-new Random().nextInt(36000000);
			//��ʼʱ�俪ʼ���ʮ�����������һ��ʱ�䣬����һ����
			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
			//���к���
			
			//����ͨ����¼
			this.communicationRecords.append(this.phoneNumber +
					"," + timeStart + 
					"," + timeEnd + 
					"," + this.callTo +
					";");
			
		}
	}
	//������ɱ��к��루����λ�����������
	@SuppressWarnings("unused")
	private String getCallToPhoneNumber() {
				return "1380372" + String.valueOf(new Random().nextInt(10))
				    + String.valueOf(new Random().nextInt(10)) 
				    + String.valueOf(new Random().nextInt(10)) 
				    + String.valueOf(new Random().nextInt(10));
		}
	//ģ��ƷѰ취�����ַ�������ʽ���ر�����λС���ļƷѽ��
    @SuppressWarnings("unused")
	private String accountFee(long timeStart,long timeEnd) {
    	//ÿ�����շ�*Ԫ
    	double feePerMinute = 0.2;
    	//ͨ���������������������
    	int minutes= Math.round((timeEnd-timeStart)/60000);
    	double feeTotal = feePerMinute * minutes;
    	return String.format("%.4f", feeTotal);
    }
    //��ͨ����¼
	void printDetails() {
		//��ȡȫ��ͨ����¼
		String alllRecords = this.communicationRecords.toString();
		//�ָ�ͨ����¼
		String [] recordArray = alllRecords.split(";");
		//ѭ���ָ��¼�ڵ�ÿһ����
		for(int i = 0;i < recordArray.length; i++) {
			String [] recordField = recordArray[i].split(",");
			System.out.println("���У�" + recordField[0]);
			System.out.println("���У�" + recordField[3]);
			System.out.println("ͨ����ʼʱ�䣺" + new Date(Long.parseLong(recordField[1])));
			System.out.println("ͨ������ʱ�䣺" + new Date(Long.parseLong(recordField[2])));
			System.out.println("�Ʒѣ�" 
			       + accountFee(Long.parseLong(recordField[1]), Long.parseLong(recordField[2])
			       + "Ԫ��"));
		}
			
	}
	private String accountFee(long parseLong, String string) {
		// TODO �Զ����ɵķ������
		return null;
	}

			
 }
