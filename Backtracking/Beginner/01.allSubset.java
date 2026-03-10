class Subset{
    static void allSubset (char [] arr, String res, int index){

        if(index == arr.length) {
            System.out.print("{"+res+"} ");
            return;
        }

            char el = arr[index];
            allSubset(arr, res+el, index+1);
            allSubset(arr, res, index+1);
        
    }
    public static void main(String[]args){
        char [] arr = {'A','B','C'};
        allSubset(arr, "", 0);
    }
}