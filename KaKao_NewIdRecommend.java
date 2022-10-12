class Solution {
    public String solution(String new_id) {
        // 1단계 - 대문자를 소문자로 전환
        String answer = new_id.toLowerCase();

        // 2단계 - 쓸 수 없는 문자 제거 (!, @, #, *)
        answer = answer.replaceAll("[^a-z0-9-_.]","");

        // 3단계 - . 연속 사용 불가 1개만 남기기
        answer = answer.replaceAll("[.]{2,}", ".");

        // 4단계 - 마침표 처음과 끝에 위치하면 제거
        if(answer.startsWith(".")){
            answer = answer.replaceFirst(".","");
        }

        // 5단계 - 빈 문자열이면 a 대입
        if(answer.equals("")){
            answer = "a";
        }
        // 6단계 - 16자 이상이면 15자만 남기고 다 제거
        if(answer.length() >= 16){
            answer = answer.substring(0,15);
        }

        if(answer.endsWith(".")){
            answer = answer.substring(0, answer.length() - 1);
        }

        // 7단계 - 2자 이하라면 마지막 문자를 길이가 3이 될때까지 반복해서 끝에 붙임.
        while(answer.length() < 3){
            answer = answer.concat(String.valueOf(answer.charAt(answer.length() - 1)));
        };

        return answer;
    }
}
