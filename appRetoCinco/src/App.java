import java.awt.EventQueue;
import views.Index;

public class App {
    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                try{
                    Index frame = new Index();
                    frame.setVisible(true);
                } catch(Exception e){
                    e.printStackTrace();
                }                
            }            
        });
        
    }
}
