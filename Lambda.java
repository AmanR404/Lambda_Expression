@FunctionalInterface
interface NumberPlayList{
    void meth(int[] array);
}

public class Lambda{
    public static void main(String[] args) {
        int[] array = {2,5,65,87};
        NumberPlayList playlist = new NumberPlayList() {

            @Override
            public void meth(int[] array) {
                for (int element : array) {
                    System.out.println(element);                    
                }
            }
            playlist.meth(array);  
        };
    }
}