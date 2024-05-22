package class08_dto;
//회원 객체 생성 및 데이터 전송을 위한 DTO
public class Member {
   private String id;
   private String password;
   private String name;
   private int age;
   private boolean login; // session

   public Member(String id, String password, String name, int age) {
      super();
      this.id = id;
		this.password = password;
      this.name = name;
      this.age = age;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public boolean isLogin() {
      return login;
   }

   public void setLogin(boolean login) {
      this.login = login;
   }
//
//public void login() {
//   login = !login;
//}

   @Override
   public String toString() {
      return "id=" + id + "name=" + name + ", age=" + age + ", login=" + login;
   }

}