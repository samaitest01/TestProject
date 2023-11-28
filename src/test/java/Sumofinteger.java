public class Sumofinteger {
    int a =10; int sum = 0;
    void sumofint()

    {
        for(int i =1;i<=a;i++) {

            sum = sum+i;
            System.out.println("  Sum of Integer  "  + "=" +  sum);

        }

    }

    public static void main(String[] args){

        Sumofinteger si = new Sumofinteger();
        si.sumofint();


    }
}
