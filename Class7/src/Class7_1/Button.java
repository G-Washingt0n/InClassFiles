package Class7_1;

public class Button {
    
    private OnClickListener listener;

    public void setListener(OnClickListener listener) {
        System.err.println("setListener in Button");
        this.listener = listener;
    }
    
public void onTouch(){ //метод вызывается при нажатии на кнопку 
   System.err.println("Listener in Button");
   listener.onClick();
}    
}
