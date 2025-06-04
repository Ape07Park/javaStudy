package chepter2.oop1;

/**
 * 음악 플레이어와 관련된 데이터 묶기
 */
public class MusicPlayerMain2 {

    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();


        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어 시작");

        // 볼륨 증가
        data.volume++;

        System.out.println("음악 플레이어 볼륨 : " + data.volume);

        // 볼륨 증가
        data.volume++;

        System.out.println("음악 플레이어 볼륨 : " + data.volume);

        // 볼륨 증가
        data.volume--;

        System.out.println("음악 플레이어 볼륨 : " + data.volume);

        System.out.println("음악 플레이어 상태 확인");

        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF, 볼륨: " + data.volume);
        }

        data.isOn = false;
        System.out.println("음악 플레이어 종료");


    }
}
