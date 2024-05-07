package ncs.test8;

public class UserTest {
	public static void main(String[] args) {
		
		// User ��ü�� ���� �� �ִ� �迭�� �����ϱ�
		User[] users = new User[3];
		
		// 3���� User ��ü�� �����Ͽ� �迭�� ����ֱ�
		users[0] = new User("user01", "pw01", "��ö��", 32, 'M', "010-1234-5678");
		users[1] = new User("user02", "pw02", "�̿���", 25, 'F', "010-5678-9123");
		users[2] = new User("user03", "pw03", "������", 20, 'F', "010-7777-8888");
		
		// users �迭�� ��� ���� ��� ���
		for(User user : users) {
			System.out.println(user.toString());
		}
		
		// ���� ���� ���� ������ �״�� �����Ͽ�, ���簡 �� �Ǿ����� ����ϱ�
		User[] userClone = new User[users.length];
		
		// ������ ó������ ������ ��� �����ϱ�
		for(int i = 0; i < users.length; i++) {
			userClone[i] = users[i].clone(); // ���� ����
			System.out.println(userClone[i].toString());
		}
		
	}
}
