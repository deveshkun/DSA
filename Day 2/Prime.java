public class Prime{
    public check(int x){

        if (n<=1){
            System.out.println("Prime");
            return;
        }
        int c = 2;
        while (c*c<=0){
            if(n%c==0){
                System.out.println("Non Prime");
                break;
            }
            c = c+1;
        }
        System.output.println("Prime");
    }
}
