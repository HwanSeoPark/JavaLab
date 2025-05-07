package com.intheeast.controlflowstatements;

public class ContinueDemo {

	public static void main(String[] args) {

        String searchMe = "peter piper picked a " + 
                              "peck of pickled peppers";
        
     //   searchMe = "peter piper picked a peck of pickled peppers";
                     //여기서 공백 문자도 문자 space된 부분 
        // length 메서드는
        // 위 문자열에 포함되어 있는 문자 개수를 리턴함.
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // 'p' 문자에만 관심이 있습니다.
        	// charAt ()
            if (searchMe.charAt(i) != 'p')
                continue; // if 블럭 다음에 스테이트먼트를 실행하지 않고
            			  // for 구문의 i++과 i < max;를 수행함.
            			  // : for 구문의 증감 expressoin을 수행하고 
            			  //   그 다음 종료 expression을 수행한다. 
            			

            // 'p' 문자 처리
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}
