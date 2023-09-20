package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// Online IDE - Code Editor, Compiler, Interpreter
// 2 utility's
//intersection and distinct union
public class InterviewCode
{
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(4,6,7,8);
        List<Integer> allElements = distinctUnion(list1,list2);
        System.out.println(allElements);
    }


    public static int[] findIntersection(List<Integer> list1, List<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : list1) {
            set.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : list2) {
            if (set.contains(num)) {
                result.add(num);
                set.remove(num); // Prevent duplicate entries in result
            }
        }

        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }

        return intersection;
    }

    public static List<Integer> distinctUnion(List<Integer> list1, List<Integer> list2) {
        List<Integer> finalUnionList  = new ArrayList<Integer>();
        finalUnionList.addAll(list1);
        finalUnionList.addAll(list2);
        return removeDuplicates(finalUnionList);
    }

    public static List<Integer> removeDuplicates(List<Integer> finalUnionList) {
        List<Integer> finalUnionUniqueList  = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<>();
        for (Integer item : finalUnionList) {
            if (!set.contains(item)) {
                set.add(item);
                finalUnionUniqueList.add(item);
            }
        }
        return finalUnionUniqueList;

    }

}
