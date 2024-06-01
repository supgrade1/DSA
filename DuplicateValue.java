public class DuplicateValue{
    public static void main(String[]args){
        int a[]={1,2,3,4,4,5,5};
        int n=a.length;
    
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]==a[j]){
                System.out.println("Duplicate value is " +a[i]);
                
            }
        }
    }
    
    }
    }
