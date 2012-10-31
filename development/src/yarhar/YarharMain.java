package yarhar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import pwnee.*;

/** The main window for this Pwnee game example. */
public class YarharMain extends JFrame implements WindowListener, WindowFocusListener {
    
    public YarharMain() {
        super("YarHar!");
        int screenX = 640;    
        int screenY = 480;
        this.setSize(screenX,screenY);
        this.setJMenuBar(new YarharMenuBar(this));
        
        this.addWindowListener(this);
        this.addWindowFocusListener(this);
        

        // Create main window panel and add it into the window.
    //    helloPanel = new HelloPanel();
    //    this.add(helloPanel);
        
        // finishing touches on Game window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        System.err.println("Game Window successfully created!!!");
    }
     
    
    // WindowListener interface stuff
    
    public void windowActivated(WindowEvent e) {
        System.err.println("Window Activated");
    }
    
    public void windowClosed(WindowEvent e)  {
        System.err.println("program terminated. Restoring original display settings.");
    }
    
    public void    windowClosing(WindowEvent e) {
        System.err.println("Window closing");
    }
    
    public void windowDeactivated(WindowEvent e) {
        System.err.println("Window deactivated");
    }
    
     public void windowDeiconified(WindowEvent e) {
        System.err.println("Window Deiconified");
        // helloPanel.requestFocusInWindow();
    }
    
     public void windowIconified(WindowEvent e) {
        System.err.println("Window Iconified");
    }
    
     public void windowOpened(WindowEvent e) {
        System.err.println("Window opened");
    }
    
    public void windowGainedFocus(WindowEvent e) {
        System.err.println("Window gained focus");
        // helloPanel.requestFocusInWindow();
    }
    
    public void windowLostFocus(WindowEvent e)  {
        System.err.println("Window lost focus");
    }
    
    public void close() {
        // do some cleaning up.
        System.err.println("cleaning up before closing...");
        
        // terminate.
        System.exit(0);
    }
    
    
    /** Creates the game window and makes it fullscreen if the user provided the argument "fullscreen". */
    public static void main(String[] args) {
        YarharMain window = new YarharMain();
    }

}