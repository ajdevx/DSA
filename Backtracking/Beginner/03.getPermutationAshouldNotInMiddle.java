 class PermutationWithoutA {
    static void getPermutationwithoutA(char[] arr, String res, int index, boolean[] isVisited){

        if(index == arr.length){
            System.out.print("{"+res+"} ");
            return;
        }

        for(int i=0; i<arr.length; i++){

            if(isVisited[i] == true) continue;
            if(index==0 && arr[i]=='A') continue;

            isVisited[i] = true;
            getPermutationwithoutA(arr, res+arr[i], index+1, isVisited);
            isVisited[i] = false;
        }
    }
    public static void main(String[]args){
        char [] arr = {'A','B','C'};
        boolean[] isVisited = new boolean[arr.length];
        getPermutationwithoutA(arr, "", 0, isVisited);
    }
}
