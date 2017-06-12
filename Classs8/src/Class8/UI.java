package Class8;

public class UI implements Bankomat.OnBankomatListener{
    
    private Bankomat.OnBankomatListener listener = new Bankomat.OnBankomatListener() {
            @Override
            public void onSetMoney(boolean isOk) {
                if(isOk){
            System.out.println("деньги отправлены на счет");
        }
        else{
            System.out.println("ошибка, обратитесь в банк");
            
        }    
            }

            @Override
            public void onGetMoney(int money) {if(money>0){
            System.out.println("деньги получены");
        }
        else{
            System.out.println("ошибка, обратитесь в банк");
        }
                
            }
        };
    public void startUi() {
        Bankomat bankomat = new Bankomat();
        bankomat.setUi(listener);
        bankomat.getMoney(70);
        bankomat.setMoney(100);   
    }
    
    public void onGetMoney(int money){
        if(money>0){
            System.out.println("деньги получены");
        }
        else{
            System.out.println("ошибка, обратитесь в банк");
        }
    }
    
    public void onSetMoney(boolean isOk){
        if(isOk){
            System.out.println("деньги отправлены на счет");
        }
        else{
            System.out.println("ошибка, обратитесь в банк");
            
        }        
    }
    
}
