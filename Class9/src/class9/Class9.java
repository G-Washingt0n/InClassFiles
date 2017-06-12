package class9;

public class Class9 {

    public static void main(String[] args) {
        

    }
    private int a = 1;
    private static int b = 5;
    public void testInnerClass(){
        Inner in = new Inner();
        in.test();
    }
    
public static class Inner{
    private int in = 10;
    
    private void test(){

    }
}    
}
