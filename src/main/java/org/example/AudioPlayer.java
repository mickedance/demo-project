package org.example;
import org.example.KeyBoardListener;
import java.awt.event.KeyListener;
import java.awt.*;
import java.io.File;
import java.io.IOException;
//import java.lang.
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class AudioPlayer  {

     Long currentFrame;
     Clip clip;
     String status;
     AudioInputStream audioInputStream;
     static String filePath;
     static Frame frame;
     int keyPressed;


     public AudioPlayer() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
     }
    public void start(){


        System.out.println("start playing");
         clip.start();
    }
    public  void stop(){
         clip.stop();
    }
     public static void main(String[] args){

         try{
             filePath = "src/main/java/org/example/song.wav";
             AudioPlayer player =new AudioPlayer();
             frame = new Frame("my demo");
             frame.setLayout(new FlowLayout());
             frame.setSize(120, 60);
             frame.setVisible(true);
             KeyBoardListener k = new KeyBoardListener();
             frame.addKeyListener(k);
             player.start();
             boolean run= true;
             System.out.println("1: Play");
             System.out.println("2: Pause");
             System.out.println("3: Stop");
             System.out.println("4: Restart");
             System.out.println("4: Exit");

             while(run){

             }
             player.stop();
            frame.dispose();
         }catch (Exception ex){
             System.out.println("Error: ");
             ex.printStackTrace();

         }

     }
}
