/**
 * Implement countEvenNum method which receives an array of integer and return the count of even number.
 **/
public class Hw1_1 {
    public int countEvenNum(int[] inputs)
    {
        int num,count=0;
        for(num=0;num<inputs.length;num++)
        {
            if(inputs[num]%2==0)
            {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Hw1_1 h = new Hw1_1();
        int[] inputs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("Number of even number is %d\n", h.countEvenNum(inputs));
    }
}
