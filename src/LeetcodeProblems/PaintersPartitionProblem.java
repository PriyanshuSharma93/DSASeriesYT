package LeetcodeProblems;

public class PaintersPartitionProblem {
    public static boolean isValidSolution(int boards[],int k,int maxLength){
        int painterCount=1;
        int paintedLength=0;

        for(int i=0;i<boards.length;i++){
            if(paintedLength+boards[i]<=maxLength){
                paintedLength=paintedLength+boards[i];
            }
            else{
                painterCount++;
                paintedLength=0;
                if(painterCount>k||boards[i]>maxLength){
                    return false;
                }
                else{
                    paintedLength=paintedLength+boards[i];
                }
            }
        }
        return true;
    }
    public static int minTime(int[] boards,int k){
        int sum=0;
        for(int i=0;i<boards.length;i++){
            sum+=boards[i];
        }
        int ans=-1;
        int s=0;
        int e=sum;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(isValidSolution(boards,k,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []boards={10,20,30,40};
        int ans=minTime(boards,2);
        System.out.println(ans);
    }
}
