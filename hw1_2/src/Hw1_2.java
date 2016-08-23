/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        float gpa, sCmG = 0, sCredit = 0;
        for(int i = 0; i < credit.length; i++)
        {
            sCmG += credit[i] * grade[i];
            sCredit += credit[i];
        }
        gpa = sCmG / sCredit;
        return gpa;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
