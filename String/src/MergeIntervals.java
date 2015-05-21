import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by feeshne on 15-5-21.
 * Merge Intervals
 */
public class MergeIntervals {
    public static void main(String[] args) {
        Interval a = new Interval(1, 3);
        Interval b = new Interval(2, 6);
        Interval c = new Interval(8, 10);
        Interval d = new Interval(15, 18);
        List<Interval> list = new ArrayList<Interval>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        List<Interval> res = merge(list);
        for (Interval tmp : res) {
            System.out.print(tmp.start + "-" + tmp.end + ",");
        }
    }

    public static List<Interval> merge(List<Interval> intervals){
        if(intervals.size()<=1){
            return intervals;
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return Integer.compare(o1.start,o2.start);
            }
        });
        List<Interval> res=new ArrayList<Interval>();
        int start=intervals.get(0).start;
        int end=intervals.get(0).end;
        for(Interval interval:intervals){
            if(interval.start<=end){
                end=Math.max(end,interval.end);
            }else {
                res.add(new Interval(start,end));
                start=interval.start;
                end=interval.end;
            }
        }
        res.add(new Interval(start,end));
        return res;
    }

    public static class Interval {
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
}
