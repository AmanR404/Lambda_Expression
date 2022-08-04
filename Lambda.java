@FunctionalInterface
interface Addition{
    void meth(int a, int b);
}
@FunctionalInterface
interface Subtraction{
    void meth(int a, int b);
}

@FunctionalInterface
interface Division{
    void meth(int a, int b);
}


public class Lambda{
    public static void main(String[] args) {
        Addition add = (a,b)->{
            System.out.println("Addition is " + a+b);
        };

        Subtraction sub = (a,b)->{
            System.out.print("Subtraction is ");
            System.out.println(a-b);
        };

        Division div = (a,b)->{
            System.out.println("Division is " + a/b);
        };

        add.meth(2, 4);
        sub.meth(4, 2);
        div.meth(10, 2);
    }

}