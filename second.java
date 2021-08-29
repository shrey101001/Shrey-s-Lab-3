public class second {
    public static void main(String args[]){

        int n[];
        n= new int[10];
        int sum=0;

        for(int i=0; i<10; i++){
            n[i]=Integer.parseInt(args[i]);
            n[i]=n[i]*n[i];
            sum=sum+n[i];
        }
        System.out.println(sum);
    }
    
}
