package util;

import java.util.Random;

public class RandomPick {
	public static int RandomPick(){
	        //�����������
			//
			//ʹ��random�������һ��1-100������
			Random r=new Random();
			int newInt=r.nextInt(101);
			return newInt;
	}
	public static int RandomPickFrom10(){
        //�����������
		//
		//ʹ��random�������һ��1-100������
		Random r=new Random();
		int newInt=r.nextInt(11);
		return newInt;
}
}