
public class Lab2 {
    private static float getWeightOnMars(float weightOnEarth)
    {
        return weightOnEarth * 0.38f;
    }

    public static void main(String[] args)
    {
        float weightOnEarth = 5.97f;
        //Calculating weight on Mars according to weight on Earth
        float weightOnMars = getWeightOnMars(weightOnEarth);
        System.out.println("Declaring main variables");
        System.out.println("weightOnEarth = " + weightOnEarth);
        System.out.println("weightOnMars = " + weightOnMars);

        double d_weightOnEarth = weightOnMars;
        System.out.printf("Converting weightOnMars variable from float to double. double d_weightOnEarth = %.4f\n" , d_weightOnEarth);

        int i_weightOnEarth = (int)d_weightOnEarth;
        System.out.printf("Converting d_weightOnEarth variable from double to int. int i_weightOnEarth = %d\n" , i_weightOnEarth);

        char ch_weightOnEarth = (char)i_weightOnEarth;
        System.out.printf("Converting i_weightOnEarth variable from int to char. char i_weightOnEarth = %c\n" , ch_weightOnEarth);
        //Addition operation
        ch_weightOnEarth += 1;
        int newWeight = ch_weightOnEarth;

    }
}
