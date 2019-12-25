package ÒøÐÐ;

import java.util.*;
import java.io.*;

public class DBUtil {
    	private static DBUtil instance = null;
    	private HashMap<String,User> users = new HashMap<String, User>();
    	
    	private DBUtil(){
    		getUsersFromInputStream("user.dat");
    	}
    	public static DBUtil getInstance(){
    		if (instance == null){
    			synchronized (DBUtil.class){
    				if (instance == null){
    					instance = new DBUtil();
    				}
    			}
    		}
    		return instance;
    	}
    	public User getUser(String cardId){
    		User user = (User) users.get(cardId);
    		return user;
    	}
    	public HashMap<String, User>getUsers(){
    		return users;
    	}
    	public void update() {
    		Set<String> userSet=users.keySet();
    		StringBuffer uStringBuffer = new StringBuffer();
    		for(String cardId:userSet) {
    			User u =(User)users.get(cardId);
    			String uString = u.getCardId()+","+u.getCardPwd()+","+u.getUserName()+","+u.getCall()+","+u.getAccount()+"\r\n";
    			uStringBuffer.append(uString);
    		}
    		putUserToFile(uStringBuffer.toString(),"user.dat");
    	}
    	private void getUsersFromInputStream(String isName) {
    		try {
				FileInputStream fs = new FileInputStream(isName);
				byte[] content = new byte[1024];
				int i=0;
				int conInteger=0;
				while(true) {
					try {
						conInteger = fs.read();
					} catch (IOException e) {
						e.printStackTrace();
					}
					if(conInteger==-1) {
						break;
					}
					else if((char)conInteger=='\r'||(char)conInteger=='\n'){
						try {
							this.processUserString(new String(content,"GBK").trim());
							i=0;
						} catch (UnsupportedEncodingException e) {
							e.printStackTrace();
						}
					}
					else {
						content[i]=(byte)conInteger;
						i++;
					}
				}
				try {
					fs.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
    	}
    	public void processUserString(String userString) {
    		String[] userFileds=userString.split(",");
    		User u=new User();
    		u.setCardId(userFileds[0]);
    		u.setCardPwd(userFileds[1]);
    		u.setUserName(userFileds[2]);
    		u.setCall(userFileds[3]);
    		u.setAccount(Integer.parseInt(userFileds[4]));
    		users.put(u.getCardId(), u);
    	}
    	private void putUserToFile(String uString,String osName) {
    		try {
				FileOutputStream fos = new FileOutputStream(osName);
				try {
					fos.write(uString.getBytes("GBK"));
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(fos!=null) {
					try {
						fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
    		
    	}
}

