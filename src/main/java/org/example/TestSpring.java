package org.example;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


    public class TestSpring {
        public static void main(String[] args) {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music =context.getBean("classicalMusic",Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        Music music2 =context.getBean("rockMusic",Music.class);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//        musicPlayer.playMusic();


//            MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//            MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

//            firstmusicPlayer.playMusic();
//            System.out.println(firstmusicPlayer.getVolume());



//            MusicPlayer player =     context.getBean("musicPlayer", MusicPlayer.class);
//            player.playMusic();
//
//            Commputer commputer = context.getBean("commputer", Commputer.class);
//            System.out.println(commputer);


//            MusicPlayer player =  context.getBean("musicPlayer", MusicPlayer.class);
//            System.out.println(player.getVolume());
//            System.out.println(player.getName());
            ClassicalMusic classicalMusic =  context.getBean("classicalMusic", ClassicalMusic.class);
            ClassicalMusic classicalMusic2 =  context.getBean("classicalMusic", ClassicalMusic.class);
            System.out.println(classicalMusic==classicalMusic2);
            context.close();
        }
    }
