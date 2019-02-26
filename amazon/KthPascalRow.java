package amazon;

import java.util.ArrayList;
import java.util.List;

public class KthPascalRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		KthPascalRow row=new KthPascalRow();
List<Integer> res=		row.getpascalrow(3);		

System.out.println(res);
	}

	private List<Integer> getpascalrow(int rowIndex) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		if (rowIndex < 0)
			return list;

		for (int i = 0; i < rowIndex + 1; i++) {
			list.add(0, 1);
			for (int j = 1; j < list.size() - 1; j++) {
				list.set(j, list.get(j) + list.get(j + 1));
			}
		}
		return list;
	}

}
