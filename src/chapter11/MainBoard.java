package chapter11;

public class MainBoard {

	public static void main(String[] args) {
         
		//기본 게임 레벨1단계
		Player player = new Player();
		player.play(1);
		
		//레벨 2단계
		AdvancedLevel aLevel = new AdvancedLevel();
		//player클래스를 상속받았으므로 AdvancedLevel 객체대입 가능
		player.upgradeLevel(aLevel);//중급자 레벨 입니다 출력후 level에 aLevel 세팅  
		player.play(2);//aLevel.go 실행 즉 AdvancedLevel의 메소드 실행
		
		//레벨3단계
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);//고급자 레벨 입니다 출력후 level에 sLevel 세팅
		player.play(3);//sLevel.go 실행 즉 SuperLevel의 메소드 실행
		
	}
}
