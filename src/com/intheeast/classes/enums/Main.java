package com.intheeast.classes.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
	
		// java.util.ArrayList
		// public class ArrayList<E> extends AbstractList<E>
		// 추상화 : 느슨한 결합
		List<String> lists = 
				new ArrayList<>();
	
		// java.util.Arrays.ArrayList 	
//	Arrays.asList();
	/* 
	 * Arrays.asList
	 * parameter : T... a --> variable arguments...
	   						  호출자는 0개 이상의 아규먼트를 전달해야 함.	
	   public static <T> List<T> asList(T...a) {
	       return new ArrayList<>(a);
	   }    
	 *
	 */
	// Arrays 클래스에서 선언된 static nested class인 ArrayList 인스턴스를 만들고 있음.	
	// private static class ArrayList<E> extends AbstractList<E>	
	// public abstract class AbstractList<E> extends AbstractCollection<E> implement List<E>
		
		List<User> users = Arrays.asList(
	//	users = Arrays.asList(
				new User("madnite1", "이상호", "p4", "intheeast1009@gmail.com", 
						Level.SILVER, 60, UpgradeConstants.MIN_RECCOMEND_FOR_GOLD),
				new User("bumjin", "박범진", "p1", "intheeast0305@gmail.com", 
						Level.BASIC, UpgradeConstants.MIN_LOGCOUNT_FOR_SILVER-1, 0),
				new User("joytouch", "강명성", "p2", "kitec403@gmail.com", 
						Level.BASIC, UpgradeConstants.MIN_LOGCOUNT_FOR_SILVER, 0),
				new User("erwins", "신승한", "p3", "intheeast0725@gmail.com", 
						Level.SILVER, 60, UpgradeConstants.MIN_RECCOMEND_FOR_GOLD-1),				
				new User("green", "오민규", "p5", "intheeast@gmail.com", 
						Level.GOLD, 100, Integer.MAX_VALUE)
				);
		
		User user0 = users.get(0);
		user0.upgradeLevel();
		Level nextLevel = user0.getLevel();
		String levelStr = nextLevel.name();
		Level level = Level.valueOf(nextLevel.intValue());
		
		
	return;
	}
}