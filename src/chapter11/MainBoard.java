package chapter11;

public class MainBoard {

	public static void main(String[] args) {
         
		//�⺻ ���� ����1�ܰ�
		Player player = new Player();
		player.play(1);
		
		//���� 2�ܰ�
		AdvancedLevel aLevel = new AdvancedLevel();
		//playerŬ������ ��ӹ޾����Ƿ� AdvancedLevel ��ü���� ����
		player.upgradeLevel(aLevel);//�߱��� ���� �Դϴ� ����� level�� aLevel ����  
		player.play(2);//aLevel.go ���� �� AdvancedLevel�� �޼ҵ� ����
		
		//����3�ܰ�
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);//����� ���� �Դϴ� ����� level�� sLevel ����
		player.play(3);//sLevel.go ���� �� SuperLevel�� �޼ҵ� ����
		
	}
}
