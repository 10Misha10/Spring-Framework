package org.example;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"//этот файл обязательно должен быть в папке помеченной как папка с ресурсами
        );//этот класс обращается к файлу applicationContext, считывает его и поещает все бины в applicationContex
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);//то есть внедрили зависимость не вручную а доверили спрингу с помощью тега constuctor-arg
        musicPlayer.playMusic();

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);//то есть внедрили зависимость не вручную а доверили спрингу с помощью тега constuctor-arg
        musicPlayer.playMusic();

        boolean t = musicPlayer1 == musicPlayer;//сейчас false

        /*MusicPlayer musicPlayer1  =new MusicPlayer();
        musicPlayer1.setMusic();*///по факту то же самое что и в 10 трочке только сделано с помощью Spring

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
