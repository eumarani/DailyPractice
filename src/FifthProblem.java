public class FifthProblem {
    public static void median(int[] arr1, int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int[] result=new int[n1+n2];
        int i=0,j=0,k=0;
        int r= result.length;
        int median=0;

        while(i<n1 && j<n2) {
            if (result[k] < arr1[i]) {
                result[k] = arr1[i];
                i++;
                k++;
            }
            else{
                result[k] = arr2[j];
                j++;
                k++;
            }
        }
while(i<n1){
    result[k] = arr1[i];
    i++;
    k++;
}

        while(j<n2){
            result[k] = arr2[j];
            j++;
            k++;
        }
            if(r%2==0){
               median=result[(r/2)+((r/2)-1)]/2;

            }else{
                median=result[r/2];
        }


      System.out.println(median);

    }
    public static void main(String[] args){
        int[] arr1={2,3,5,8};
        int[] arr2={10,12,14,16,18,20};
       median(arr1,arr2);


    }
}
