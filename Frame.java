import javax.swing.JFrame;
//public class Frame extends JFrame {
//    Frame(){
//        this.add(new Panel());
//        this.setTitle("Snake_Game");
//        this.setVisible(true);
//        this.setResizable(false);
//        this.pack();
//    }
//}


//import javax.swing.JFrame;

public class Frame extends JFrame{
    Frame(){
        this.setTitle("SnakeGame");
        this.add(new Panel());
        this.setVisible(true);
        this.setResizable(false);
        this.pack();

    }
}
