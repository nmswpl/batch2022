package in.co.nmsworks.excercise1;

public class PowerFor {
        public static void main(String[] args)
        {
            int base, exponent, expo;
            base=2;
            exponent=3;
            expo=exponent;
            long power = 1;
            for (;exponent != 0; --exponent)
            {
                power = power * base;
            }
            System.out.println(base +" to the power " +expo + " is: "+power);
        }
}
