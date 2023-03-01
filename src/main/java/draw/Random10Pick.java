package draw;

import util.Random10PickWithBase;

public class Random10Pick {

	public static void main(String[] args) {
		//有保底的十连
		//
		int rd10[]=Random10PickWithBase.Random10PickWithBase();
		for(int i=0;i<=9;i++) {System.out.println(rd10[i]);}
		}
	}


