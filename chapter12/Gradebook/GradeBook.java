package chapter12.Gradebook;

import java.util.Map;

public class GradeBook {

    public static void main(String[] args){
        Map<String, Integer> gradeBook = TestResults.getOriginalGrades();
        Map<String, Integer> makeUpTest = TestResults.getMakeUpGrades();

        for(var entry : gradeBook.entrySet()){
            Integer firstGrade = gradeBook.get(entry.getKey());
            Integer secondGrade = makeUpTest.get(entry.getKey());

            if(secondGrade > firstGrade){
                gradeBook.put(entry.getKey(), secondGrade);
            }
            System.out.println("Student: " + entry.getKey() + "  |  Grade: " + entry.getValue());
        }
    }
}