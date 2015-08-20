package datastruct.test1;

import java.util.*;

/**
 * Created by xianyu.hxy on 2015/8/20.
 */
public class SortTest {
    public void sort(){
        List<Object> list=new ArrayList<Object>();
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        Object[] arr=new Object[10];
        Arrays.sort(arr, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        Set<Object> sortedSet=new TreeSet<Object>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        Map<String,Integer> sortedMap=new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);

        Map<Object,String> sortedMap1=new TreeMap<Object, String>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
    }
}
