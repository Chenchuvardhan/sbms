
public class ArmStrorng {
public int findArmStrongsBetween100to1000() {
   /*int minRange=100;
	int maxRange=1000;
	int armstrongsCount=0;
	for(;minRange<maxRange;minRange++) {
		int number=minRange;
		int IsArmStrong=minRange;
		int compareNumber=minRange;
		int total=0;
    int countofDigits=0;
	while(number!=0) {
		number=number/10;
		++countofDigits;
	}	
	while(IsArmStrong!=0) {
	total+=Math.pow(IsArmStrong%10,countofDigits);
	IsArmStrong=IsArmStrong/10;
	}
	if(total==compareNumber) {
		System.out.println(total);
		++armstrongsCount;
	}
	}
	return armstrongsCount;
	*/
	int armstrongsCount=0;
	for(int i=100;i<1000;i++) {
		String str=Integer.toString(i);
		int count=str.length();
		int total=0;
		for(int m=0;m<str.length();m++) {
			int x = Integer.parseInt(str.charAt(m)+"");
			total+=Math.pow(x, count);
		}
		if(i==total) {
			++armstrongsCount;
			System.out.println(total);
		}
	}
	return armstrongsCount;
}
public static void main(String[] args) {
System.out.println(new ArmStrorng().findArmStrongsBetween100to1000());	
}
}
