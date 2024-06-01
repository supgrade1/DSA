public class MissingNumber{
    public static void main(String[]args){
        int []a={1,2,4,3,6,7};
        int n =a.length;
        int sum=0;

        for(int i=0;i<n;i++){
        sum+=a[i];
        }
        int sumOfNaturalNumbers=((n+1)*(n+2))/2;

        int result=sumOfNaturalNumbers-sum;

        System.out.println("Missing number is: "+result);
        
    }
}