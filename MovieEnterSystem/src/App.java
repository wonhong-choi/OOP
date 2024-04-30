import Model.Audience;
import Model.Theater;

public class App {
    public static void main(String[] args) throws Exception {
        Theater megaBox = new Theater();
        Audience munju = new Audience();
        Audience wonhong = new Audience();
        
        megaBox.enter(munju);
        megaBox.enter(wonhong);
    }
}
