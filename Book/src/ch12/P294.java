package ch12;

public class P294 {
	public static void main(String[] args) {
		//자바버전
		System.out.println(System.getProperty("java.version"));
		//jdk 경로
		System.out.println(System.getProperty("java.home"));
		//os
		System.out.println(System.getProperty("os.name"));
		//파일 구분자
		System.out.println(System.getProperty("file.separator"));
		//사용자명
		System.out.println(System.getProperty("user.name"));
		//사용자 홈디렉토리
		System.out.println(System.getProperty("user.home"));
		//현재 워크스페이스 디렉토리 위치
		System.out.println(System.getProperty("user.dir"));
		
		
		System.out.println();
		for(String var : System.getenv().keySet()) {
			System.out.println(var+"="+System.getenv(var));
		}
		
		
		
		
		
		
		
		
		
		
	}

}
