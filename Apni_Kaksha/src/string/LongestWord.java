package string;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String names = "Gagan, Amar, Shivangi, Rohan";
		
		String names = "6 Harsh Gaurav GauravMiglani HarshAgarwal GeeksforGeeksGeeks Programmiz" ;
		
		//String namesArray[] = names.split(", ");
		String namesArray[] = names.split(" ");
		
		int maxlength = 0;
		int index = 0;
		for(int i=0; i < namesArray.length;i++){
			if(maxlength < namesArray[i].length()){
				maxlength = namesArray[i].length();
				index = i;
			}
		}
		
		//System.out.println("Longest Name is " + "\""+ namesArray[index]+"\"" + " of length =" + maxlength);
		System.out.println(namesArray[index]);
	}

}
