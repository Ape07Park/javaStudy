package chepter2.oop1;


public class MusicPlayerMain4 {

    public static void main(String[] args) {

        MusicPlayer data = new MusicPlayer();

        // 음악 플레이어 켜기
        data.on();

        data.volumeUp();

        data.volumeUp();

        data.volumeDown();

        data.showStatus();

        data.off();
    }
}
