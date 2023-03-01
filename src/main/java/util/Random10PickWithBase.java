package util;

public class Random10PickWithBase {

public static int[] Random10PickWithBase() {
	//有保底的十连
	int ifGot=0;
	int[] PickList=new int[10];
	for(int i=0;i<=9;i++) {PickList[i]=RandomPick.RandomPick();
	if(PickList[i]>=85) {ifGot=1;}
	}
	if(ifGot==0) {PickList[RandomPick.RandomPickFrom10()]=85;}
	return PickList;	
}
}
