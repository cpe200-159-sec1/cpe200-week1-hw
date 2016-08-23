/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        if (credit.length != grade.length)
            throw new IllegalArgumentException("Invalid credit or grade");

        float point = 0.0f;
        int credits = 0;

        for (int i = 0; i < credit.length; i++) {
            credits += credit[i];
            point += grade[i] * credit[i];
        }

        float gpa = point / credits;

        return gpa;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
