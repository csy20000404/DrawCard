package util;

import java.util.Random;

public class RandomPick {
	public static int RandomPick(){
	        //纯随机、单抽
			//
			//使用random随机生成一个1-100的整数
			Random r=new Random();
			int newInt=r.nextInt(101);
			return newInt;
	}
	public static int RandomPickFrom10(){
        //纯随机、单抽
		//
		//使用random随机生成一个1-100的整数
		Random r=new Random();
		int newInt=r.nextInt(11);
		return newInt;
}
}