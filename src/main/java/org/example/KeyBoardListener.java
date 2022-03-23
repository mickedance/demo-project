package org.example;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KeyBoardListener implements KeyListener
{

    int key;
    @Override
    public void keyTyped(KeyEvent e)
    {

    }
    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.isActionKey())
            System.exit(0);
        key = e.getKeyChar();
        System.out.println("The key pressed was: " + key);
    }
    @Override
    public void keyReleased(KeyEvent e)
    {
    }

    public static void main(String[] args)
    {


        //Creating and adding the key listener
        KeyBoardListener k = new KeyBoardListener();
        //f.addKeyListener(k);
    }
}
