package loveProgramming;

public class Calculate {

    private int c1, c2, c3;

    public Calculate(){

        System.out.println("Can not calculate without input");
    }

    public Calculate(int n1){
        c1 = n1;
        System.out.println("Calculator Output is "+ c1);
    }

    public Calculate(int n1, int n2){
        c2 = n1+n2;
        System.out.println("Calculator Output is "+ c2);
    }

    public Calculate(int n1, int n2, int n3){
        c3 = n1+n2+n3;
        System.out.println("Calculator Output is "+ c3);
    }

    public void PrintCal(){

    }
}
