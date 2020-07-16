package Collections.List;

import java.util.ArrayList;

//question
//Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

//You may assume that the intervals were initially sorted according to their start times.

//link ::: https://www.interviewbit.com/problems/merge-intervals/
public class Merge_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interval i = new Interval(1, 3);
		ArrayList<Interval> a = new ArrayList<>();
		a.add(i);
		Interval j = new Interval(6, 9);
		a.add(j);
		Interval k = new Interval(2, 5);
		
		//System.out.println(a);
		
	
		insert(a, k);
	
		
		
		for(Interval ik :insert(a, k) ){
			System.out.print("["+ ik.start + "," + ik.end+ "]" + ",");
			//System.out.println();
		}

	}

	public static ArrayList<Interval>  insert(ArrayList<Interval> intervals, Interval newInterval) {

		if (intervals == null) {
			intervals = new ArrayList<>();
			intervals.add(newInterval);
			return intervals;
			//System.out.println(intervals);
		} else if (intervals.size() == 0) {
			intervals.add(newInterval);

			return intervals;
			//System.out.println(intervals);
		}

		Interval toinsert = newInterval;

		int i = 0;
		// for(int i = 0; i<intervals.size() ; i++ )
		while (i < intervals.size()) {
			Interval current = intervals.get(i);
			if (current.end < toinsert.start) {
				//when to insert is far from the current position
				i++;
				continue;
			} else if (current.start > toinsert.end) {
				//when to insert crosses the  current interval then we have to insert the it at the current position 
				intervals.add(i, toinsert);
				break;
			} else {
				toinsert.start = Math.min(toinsert.start, current.start);
				toinsert.end = Math.max(toinsert.end, current.end);
				intervals.remove(i);

			}
		}

		if (i == intervals.size()) {
			/// this will add at the end
			intervals.add(toinsert);
		}
		return intervals;
		//System.out.println(intervals);
	}
}

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}
