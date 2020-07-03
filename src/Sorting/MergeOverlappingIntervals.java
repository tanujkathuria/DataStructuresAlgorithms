package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeOverlappingIntervals {

    public static void MergeOverlappingIntervals(List<Interval> intervalList, int n ){
        Collections.sort(intervalList);
        System.out.println(Arrays.toString(intervalList.toArray()));
        int res = 0;
        for(int i =1;i<intervalList.size();i++){
            if(intervalList.get(i).start < intervalList.get(res).end){
                intervalList.set(res,new Interval( Math.min(intervalList.get(i).start,intervalList.get(res).start),
                        Math.max(intervalList.get(i).end,intervalList.get(res).end)));
            }
            else{
                res++;
                intervalList.set(res,intervalList.get(i)) ;
            }
        }
        for(int i=0;i<=res;i++){
            System.out.println(intervalList.get(i).start+" "+intervalList.get(i).end+" ");
        }
    }

    public static void main(String[] args) {
        List<Interval> intervalList = new ArrayList<Interval>();
        intervalList.add(new Interval(12,30));
        intervalList.add(new Interval(5,6));
        intervalList.add(new Interval(3,8));
        intervalList.add(new Interval(7,13));
        intervalList.add(new Interval(31,45));
        MergeOverlappingIntervals(intervalList,intervalList.size());

    }
}

class Interval implements Comparable
{
    public Interval(int start, int end )
    {
        this.start = start;
        this.end = end;
    }

    int start;
    int end;

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Interval i = (Interval)o;
        return this.start - i.start;
    }
}