package Class8;

public class Bankomat {
 private int count20 = 10;
 private int count50 = 5;
 private int count100 = 2;
 
 private OnBankomatListener ui = null;

    public void setUi(OnBankomatListener ui) {
        this.ui = ui;
    }
 
 public void getMoney(int value){
     // progress - wait
     ui.onGetMoney(value);
 }
 
 public void setMoney(int value){
     ///also long wait
     ui.onSetMoney(false);
 }

 public interface OnBankomatListener {
    
    public void onSetMoney(boolean isOk);
    public void onGetMoney(int money);

}
}
