package Collections.List;

import java.lang.reflect.Array;
import java.util.*;

public class Merge_Overlapping_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// [1,3],[2,6],[8,10],[15,18],

		// (1, 10), (2, 9), (3, 8), (4, 7), (5, 6), (6, 6)

		Intervals b1 = new Intervals(1, 3); 
		 Intervals b2 = new Intervals(2,6);
		 Intervals b3 = new Intervals(8, 10);
		 Intervals b4 = new Intervals(15, 18);
		 ArrayList<Intervals> obj1 = new ArrayList<Intervals>();
		 
		 obj1.add(b1);
		 obj1.add(b2);
		 obj1.add(b3);
		 obj1.add(b4);
		 

		Intervals i1 = new Intervals(1, 10);
		Intervals i2 = new Intervals(2, 9);
		Intervals i3 = new Intervals(3, 8);
		Intervals i4 = new Intervals(4, 7);
		Intervals i5 = new Intervals(5, 6);
		Intervals i6 = new Intervals(6, 6);

		ArrayList<Intervals> obj = new ArrayList<Intervals>();
		obj.add(i1);
		obj.add(i2);
		obj.add(i3);
		obj.add(i4);
		obj.add(i5);
		obj.add(i6);

		

		System.out.println("Before merging");
		for (Intervals x : obj) {
			System.out.print(x.start + "," + x.end);
			System.out.println();
		}

		System.out.println();
		System.out.println("After merging");
		for (Intervals x : mergeIntervals(obj)) {
			System.out.print(x.start + "," + x.end);
			System.out.println();
		}

	}

	static ArrayList<Intervals> mergeIntervals(ArrayList<Intervals> a) {
		Intervals toInsert = new Intervals();

		if (a == null || a.size() == 0) {
			return a;
		}
		
		int j = 1;
		for (int i = 0; i < a.size() - 1;) {

			if (a.get(i).end >= a.get(j).start) {
				toInsert.start = Math.min(a.get(i).start, a.get(j).start);
				toInsert.end = Math.max(a.get(i).end, a.get(j).end);
				if (toInsert.end == a.get(i).end) {
					a.remove(j);
					continue;
				}
				a.remove(i);
				a.add(i, toInsert);
				a.remove(j);

			}
			i++;
			j++;

		}

		return a;
	}

}

class Intervals {
	int start;
	int end;

	public Intervals() {
		// TODO Auto-generated constructor stub
	}

	public Intervals(int s, int e) {
		// TODO Auto-generated constructor stub
		start = s;
		end = e;
	}
}
