package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class KaKao_PersonalityTest {

    public String solution(String[] survey, int[] choices) {
        Map<String, Integer> typeScore = scoreSum(survey, choices);
        return whatMyType(typeScore);
    }

    private Map<String, Integer> scoreSum(String[] survey, int[] choices){
        Map<String, Integer> typeScore = new LinkedHashMap<>();
        typeScore.put("R", 0);
        typeScore.put("T", 0);
        typeScore.put("C", 0);
        typeScore.put("F", 0);
        typeScore.put("J", 0);
        typeScore.put("M", 0);
        typeScore.put("A", 0);
        typeScore.put("N", 0);

        int[][] scoreArray = {{1,3}, {2,2}, {3,1}, {4,0}, {5,1}, {6,2}, {7,3}};

        for(int j=0; j < survey.length; j++){
            String[] splitType = survey[j].split("");
            String firstType = splitType[0];
            String secondType = splitType[1];
            int myChoice = choices[j];
            int score = scoreArray[myChoice - 1][1];

            if(myChoice > 4){
                typeScore.put(secondType, typeScore.get(secondType) + score);
            }else if(choices[j] < 4){
                typeScore.put(firstType, typeScore.get(firstType) + score);
            }
        }

        return typeScore;
    }

    private String whatMyType (Map<String, Integer> typeScore) {
        String myType = "";

        if(typeScore.get("R") >= typeScore.get("T")){
            myType += "R";
        }else{
            myType += "T";
        }

        if(typeScore.get("C") >= typeScore.get("F")){
            myType += "C";
        }else{
            myType += "F";
        }

        if(typeScore.get("J") >= typeScore.get("M")){
            myType += "J";
        }else{
            myType += "M";
        }

        if(typeScore.get("A") >= typeScore.get("N")){
            myType += "A";
        }else{
            myType += "N";
        }

        return myType;
    }
}
