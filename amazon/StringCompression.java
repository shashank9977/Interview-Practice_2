package amazon;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompression compression=new StringCompression();
		//String[] array=new String[]{"a","a","b","b","c","c","c"};
		String[] array=new String[]{"a","b","b","b","b","b","b","b","b","b","b","b","b"};
		compression.compress(array);	
	}

	private void compress(String[] array) {
		// TODO Auto-generated method stub
		int indexplace=0;
		String prev=array[0];
		int index=0;
		while(index<array.length){
			String chars=array[index];
			int count=0;
			while(index<array.length && array[index]==chars){
				index++;
				count++;
			}					
			array[indexplace++]=chars;
			if(count!=1){
			for(char c:Integer.toString(count).toCharArray())
				array[indexplace++]=Character.toString(c);
			}							
		}
		for(int i=0;i<indexplace;i++){
		System.out.println(array[i]);
		}		
	}

}
