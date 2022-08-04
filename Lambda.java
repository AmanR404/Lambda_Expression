@FunctionalInterface
interface NumberPlayList{
    void meth(int[] array);
}

public class Lambda{
    public static void main(String[] args) {
        NumberPlayList playlist = new NumberPlayList() {

            @Override
            public void meth(int[] array) {
                for (int element : array) {
                    System.out.println(element*element);                    
                }
            }  
        };
    }
}