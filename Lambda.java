@FunctionalInterface
interface NumberPlayList{
    void meth(int[] array);
}

public class Lambda{

    static void isEvenFunction(int element){
        if(element%2 == 0){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        NumberPlayList playlist = new NumberPlayList() {

            @Override
            public void meth(int[] array) {
                for (int element : array) {
                    isEvenFunction(element);
                    }                   
                } 
        };
    }
}