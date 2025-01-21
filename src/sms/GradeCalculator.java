package sms;

import java.util.List;

public class GradeCalculator {
    public static double calculateAverageGrade(List<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
