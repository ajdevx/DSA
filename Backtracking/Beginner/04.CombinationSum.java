 import java.util.*;
 class CombinationSum {

    static void combinationalSum(int []arr, int target, ArrayList<Integer> res, int index){
            if(target == 0){
                System.out.println(res);
                return;
            }
            if(target<0 || index>= arr.length) return;

            res.add(arr[index]);
            combinationalSum(arr,target-arr[index],res,index);
            res.remove(res.size()-1);
            combinationalSum(arr,target,res,index+1);
        
    }
    public static void main(String[]args){
        int [] arr = {1,2,3,4,5};
        int target = 4;

    
        combinationalSum(arr,target, new ArrayList<Integer>(),0);
    }
}
