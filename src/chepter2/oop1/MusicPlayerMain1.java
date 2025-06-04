package chepter2.oop1;

import java.util.Scanner;

public class MusicPlayerMain1 {

    public static void main(String[] args) {

        boolean isOn = false;

        int volume = 0;

       // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어 시작");

        // 볼륨 증가
        volume++;

        System.out.println("음악 플레이어 볼륨 : " + volume);

        // 볼륨 증가
        volume++;

        System.out.println("음악 플레이어 볼륨 : " + volume);

        // 볼륨 증가
        volume--;

        System.out.println("음악 플레이어 볼륨 : " + volume);

        System.out.println("음악 플레이어 상태 확인");

        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF, 볼륨: " + volume);
        }

        isOn = false;
        System.out.println("음악 플레이어 종료");


    }
}
