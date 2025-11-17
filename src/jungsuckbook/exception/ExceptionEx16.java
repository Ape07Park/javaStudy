package jungsuckbook.exception;

import java.io.File;
import java.util.Scanner;

public class ExceptionEx16 {

	public static void main(String[] args)  {

		String fileNm;

		Scanner scanner = new Scanner(System.in);

		System.out.print("파일 명을 입력하시오 :");

		fileNm = scanner.nextLine();

		try {
		// CMD에 입력받은 값을 이름으로 하는 파일 생성
		File f = createFile(fileNm);
		System.out.println(f.getName() + " 파일 생성 성공");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " 파일 명을 다시 입력해주세요");
		}
	}

	/**
	 * 파일 이름 받기 및 파일이름 유효성 체크
	 * @param fileName
	 * @return
	 */
	static File createFile(String fileName) throws Exception{

		if (fileName == null ||  fileName.equals("")) {
			throw new Exception("파일 이름이 유효하지 않습니다");
		}

		File f = new File(fileName);
		f.createNewFile();
		return f;
	}




}
