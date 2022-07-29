package chapter17;

public class Person {
	// 한 사람의 정보를 담당하는 Person클래스를 정의
		private String name;
		private int age;
		private String tel;

		public void setAge(int age) {
			this.age = age;
		}

		public int getAge() {
			return age;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public String getTel() {
			return tel;
		}
	}
