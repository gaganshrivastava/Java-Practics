package arrays.geeksforgeeks;

public class GenerateElectricBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bill = generatebill(250);
		
		System.out.println(bill);
		
	}

	static int generatebill(int kwh){
		int paise = 0;
	for(int i=1 ; i<= kwh ; i++){
			if(i <=100){
				paise  += 10*1;
			}else if( i>100 && i <=200){
				paise += 15*1; 
			}else if( i>200 && i <=300){
				paise += 20*1; 
			}else if(i<300){
				paise += 25*1; 
			}
		}
		
		return paise;
	
		
		//return 0;
	}
}
