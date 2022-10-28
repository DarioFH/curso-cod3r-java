package generics;

import java.util.TreeSet;

public class ComparableTeste {

    public static void main(String[] args) {

        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(3);
        nums.add(2);
        nums.add(11);
        nums.add(6);
        nums.add(9);
        nums.add(-12);


        for(Integer n: nums){
            System.out.println(n);
        }
    }


}
