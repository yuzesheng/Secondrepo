import java.util.*;

public class SuShu{
	public static void main(String[] args){
		//计算100以内的素数（质数）
		for(int i = 2; i <= 100;i++){
			boolean boo = false;
			for(int j = 2;j <= Math.sqrt(i);j++){
				if(i % j == 0){
					boo = true;
					break;
				}
			}
			if(!boo){
				System.out.println(i + " 是质数");
			}	
		}
	}
}