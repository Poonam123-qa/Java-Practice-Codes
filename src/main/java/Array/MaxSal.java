package Array;

public class MaxSal {
    public static void main(String args[]){
        int sal[]={20, 30, 10, 50, 40, 30, 80, 90};
        int max =1;
       // int min= sal[0];

        for(int i=0;i<sal.length;i++){
            if(sal[i]>max){
                max=sal[i];
            }
        }

        System.out.println("The max sal is..."+max);
    }
}
