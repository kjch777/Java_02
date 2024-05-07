package ncs.test8;

public class UserTest {
	public static void main(String[] args) {
		
		// User 객체를 담을 수 있는 배열을 선언하기
		User[] users = new User[3];
		
		// 3개의 User 객체를 생성하여 배열에 집어넣기
		users[0] = new User("user01", "pw01", "김철수", 32, 'M', "010-1234-5678");
		users[1] = new User("user02", "pw02", "이영희", 25, 'F', "010-5678-9123");
		users[2] = new User("user03", "pw03", "박유리", 20, 'F', "010-7777-8888");
		
		// users 배열에 담긴 값들 모두 출력
		for(User user : users) {
			System.out.println(user.toString());
		}
		
		// 내가 만든 유저 정보를 그대로 복사하여, 복사가 잘 되었는지 출력하기
		User[] userClone = new User[users.length];
		
		// 유저를 처음부터 끝까지 모두 복사하기
		for(int i = 0; i < users.length; i++) {
			userClone[i] = users[i].clone(); // 유저 복사
			System.out.println(userClone[i].toString());
		}
		
	}
}
