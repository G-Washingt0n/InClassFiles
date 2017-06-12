package Class7_1;

public class Main implements OnClickListener{
    
    public static void main(String[] args){
        Main main = new Main();
        System.err.println("new Button");
        Button button = new Button();
        System.err.println("setListener in Main");
        button.setListener(main);
        
        
        
        System.err.println("onTouch in Main");
        button.onTouch();
        
    }

    @Override
    public void onClick() {
        System.err.println("OnClick{} in Main");
    }
}
