package ch2.music;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Play {
    //这里播放sin.wav
    public void sin_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/sin.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
//            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放cos.wav
    public void cos_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/cos.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放tan.wav
    public void tan_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/tan.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放clear.wav
    public void clear_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/clear.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放kaifang.wav
    public void kaifang_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/kaifang.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放equal.wav
    public void equal_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/equal.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放plus.wav
    public void plus_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/plus.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放minus.wav
    public void minus_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/minus.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放multiply.wav
    public void multiply_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/multiply.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放divide.wav
    public void divide_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/divide.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放num0.wav
    public void num0_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/num0.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放num1.wav
    public void num1_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/num1.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放num2.wav
    public void num2_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/num2.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放num3.wav
    public void num3_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/num3.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放num4.wav
    public void num4_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/num4.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放num5.wav
    public void num5_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/num5.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放num6.wav
    public void num6_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/num6.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放num7.wav
    public void num7_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/num7.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放num8.wav
    public void num8_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/num8.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放num9.wav
    public void num9_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/num9.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    //这里播放point.wav
    public void point_music(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound/point.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
}
