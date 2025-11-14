package jungsuckbook.exception;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class ExceptionEx15 {

	public static void main(String[] args)  {

		String fileNm;

		Scanner scanner = new Scanner(System.in);

		System.out.print("파일 명을 입력하시오 :");

		fileNm = scanner.nextLine();

		// CMD에 입력받은 값을 이름으로 하는 파일 생성
		File f = createFile(fileNm);
		System.out.println(f.getName() + " 파일 생성 성공");
	}

	/**
	 * 파일 이름 받기 및 파일이름 유효성 체크
	 * @param fileName
	 * @return
	 */
	static File createFile(String fileName) {

		try {
			if (fileName == null ||  fileName.equals("")) {
				throw new Exception("파일이름이 유효하지 않습니다");
			}
		} catch (Exception e) {
			fileName = "제목없음" + ".txt";
		} finally {
			File f = new  File(fileName); // File 객체 생성
			createNewFile(f);
			return f;

		}
	}

	/**
	 * 받은 파일 이름으로 파일 생성
	 * @param f 파일이름
	 */
	static void createNewFile(File f)  {
		try {
			f.createNewFile(); // 파일 생성
		} catch(Exception e) {
			// throw new Exception("파일 생성 실패");
		}
	}


}
