package com.intheeast.classes.lambda;

import java.util.function.Consumer;

public class ConsumerWithoutAndThenExample {

	static class User {
        private String username;
        private boolean isAdmin;
        private boolean isEmailVerified;

        public User(String username, boolean isAdmin, boolean isEmailVerified) {
            this.username = username;
            this.isAdmin = isAdmin;
            this.isEmailVerified = isEmailVerified;
        }
		public String getUsername() { return username; }
        public boolean isAdmin() { return isAdmin; }
        public boolean isEmailVerified() { return isEmailVerified; }
    }
	
	public static void callAccept(Consumer<User> c, User user) {
		// void accept(User user) {
		//     if (u.isAdmin()) {
		//			System.out.println("[알림] 관리자 계정 접근 감지: " + u.getUsername());
		//     }
		// }
		c.accept(user);
	}

    public static void main(String[] args) {
        User user = new User("sophia", true, false);

        callAccept( u -> {
		        			  if (u.isAdmin()) {
		        			      System.out.println("[알림] 관리자 계정 접근 감지: " + u.getUsername());
		        			  }
        			},
        			user);
        
        
        
        // 각각의 Consumer 정의
        // Consumer<User> {
        // void accept (User t) {
        //     System.out.println("[로그] 사용자 '" + u.getUsername() + "' 로그인 시도");
        // }
        // lambda statement
//      Consumer<User> logAccess = u -> {
//          System.out.println("[로그] 사용자 '" + u.getUsername() + "' 로그인 시도");
//      };
        // lambad expression
        Consumer<User> logAccess = 
        		u -> System.out.println("[로그] 사용자 '" + u.getUsername() + "' 로그인 시도"); 
        
        // lambda statement
        Consumer<User> checkEmail = u -> {
            if (!u.isEmailVerified()) {
                System.out.println("[경고] 이메일 인증이 완료되지 않았습니다.");
            }
        };

        // lambda statement
        Consumer<User> notifyIfAdmin = u -> {
            if (u.isAdmin()) {
                System.out.println("[알림] 관리자 계정 접근 감지: " + u.getUsername());
            }
        };

        // Consumer 직접 순차 실행
        System.out.println("=== 사용자 로그인 처리 시작 ===");
        logAccess.accept(user);
        checkEmail.accept(user);
        notifyIfAdmin.accept(user);
    
        callAccept(checkEmail, user);
    }
}
