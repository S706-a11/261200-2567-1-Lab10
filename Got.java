import java.awt.*;

public class Got implements Runnable {

    private final Turtle Got;
    public Got(){
        this.Got = new Turtle();
        Got.fillColor(Color.RED);
    }



    @Override
    public void run() {

        for (int i=0; i<3 ;i++){
            Got.forward(100);
            Got.left(90);
        }
        Got.forward(100);
    }
}
