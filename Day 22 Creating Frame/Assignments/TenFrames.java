import java.awt.Frame;

// It prints 10 Frames on one another, with Title "Frame 1...10"
public class TenFrames {    
    public static void main(String[] args) {
        for (int i = 1, j = 0; i <= 10; i++, j += 36) {
            Frame f = new Frame();
            f.setSize(600, 300);
            f.setTitle("Frame " + (i));
            f.setLocation(10 + j / 2, 20 + j);
            f.setVisible(true);
            f.setResizable(false);
        }
    }
}
