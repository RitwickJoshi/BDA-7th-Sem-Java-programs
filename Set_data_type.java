import java.util.*;

public class Set_data_type {
    public static void main(String[] args) {
        Set<Integer> set_dt = new HashSet<Integer>();
        for (int i=0; i<5; i++)
			set_dt.add(1);
        System.out.println(set_dt);
        
        
        Treeset sorted_set = new Treeset<Integer>(set_dt);
        System.out.println(sorted_set);
    }
}
