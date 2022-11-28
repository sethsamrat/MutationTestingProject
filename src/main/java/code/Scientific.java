package code;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

import code.Scientific;

/*
This code demonstrates most of the functionalities of a scientific calculator.
*/
public class Scientific {

    /* add two numbers */
    public float addition(float a,float b)
    {
        return a+b;
    }

    /* subtract two numbers */
    public float subtraction(float a,float b)
    {
        return a-b;
    }

    /* multiply two numbers */
    public float multiply(float a,float b)
    {
        return a*b;
    }

    /* divide two numbers */
    public float division(float a,float b)
    {
        if(b==0)
        {
            System.err.println("Error: cannot divide a number with zero.");
            return (float) 0.0;
        }
        return a/b;

    }

    /* find n1 modulo n2 */
    public int modulo(int a,int b)
    {
        if(b<=0)
        {
            return -1;
        }
        return a%b;
    }

    /* square of number */
    public float square_it(float x)
    {
        return multiply(x,x);
    }

    /* cube of number */
    public float cube_it(float x)
    {
        return (float)(square_it(x)*x);
    }

    /* find square root of number */
    public float square_root_it(float x)
    {
        if(x<0)
            return -1;
        else
            return (float)Math.sqrt(x);
    }

    /* find cube root of number */
    public float cube_root_it(float x)
    {
        return (float)Math.cbrt(x);
    }

    /* find factorial of number */
    public int factorial_of_it(int x)
    {
        int i=1,ans=1;
        if(x<0)
            return -1;

        while(i<=x)
        {
            ans=ans*i;
            i=i+1;
        }
        return ans;
    }

    /* find inverse of number */
    public float inverse_of_it(int x)
    {
        if(x==0)
        {
            System.err.println("Error: Cannot find inverse 0.");
            return (float) 0.0;
        }
        else
        {
            return division(1,(float)x);
        }

    }
    /* find 10th power of number */
    public float power_base_10(int x)
    {
        Scientific g=new Scientific();
        int ans=1;
        int i;
        if(x<0)
        {
            x=-x;
            for(i=0;i<x;i++)
            {
                ans*=10;
            }
            return g.inverse_of_it(ans);

        }
        for(i=0;i<x;i++)
        {
            ans=ans*10;
        }
        return ans;
    }

    /* find exponentiation of number */
    public float exponent_of(int x)
    {
        return (float) Math.exp(x);
    }

    /* evaluate nPr */
    public int permutations_of(int n, int r)
    {
        int diff=n-r,c=1,fact_1=1,fact_2=1;
        if(n<0)
            return -1;
        if(r<0)
            return -1;
        if(n<r)
            return -1;

        while(c<=n)
        {
            fact_1=fact_1*c;
            c=c+1;
        }
        c=1;
        while(c<=diff)
        {
            fact_2=fact_2*c;
            c=c+1;
        }
        return fact_1/fact_2;
    }

    /* evaluate nCr */
    public int combinations_of(int n, int r)
    {
        int diff=n-r,c=1,fact_1=1,fact_2=1,fact_3=1;
        if(n<0)
            return -1;
        if(r<0)
            return -1;
        if(n<r)
            return -1;
        while(c<=n)
        {
            fact_1=fact_1*c;
            c=c+1;
        }
        c=1;
        while(c<=diff)
        {
            fact_2=fact_2*c;
            c=c+1;
        }
        c=1;
        while(c<=r)
        {
            fact_3=fact_3*c;
            c=c+1;

        }
        return fact_1/(fact_2*fact_3);
    }

    /* solve given quadratic equation for x */
    public float solve_equations(int a, int b, int c)
    {
        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
        int	d = b * b - 4 * a * c;
        float root1=(float) 0.0, root2=(float) 0.0;
        if(d > 0)

        {

            System.out.println("Roots are real and unequal");

            root1 = (float) (( - b + Math.sqrt(d))/(2*a));

            root2 = (float) ((-b - Math.sqrt(d))/(2*a));

            System.out.println("First root is:"+root1);

            System.out.println("Second root is:"+root2);

        }

        else if(d == 0)

        {

            System.out.println("Roots are real and equal");

            root1 = (float) ((-b+Math.sqrt(d))/(2*a));

            System.out.println("Root:"+root1);

        }

        else

        {

            System.out.println("Roots are imaginary");

        }

        return root1;

    }


    /* convert angle in radian to angle in degree */
    public float rad_to_degree(int x)
    {
        return (float)((x*180)/3.14);
    }


    /* convert angle in degree to angle in angle */
    public float degree_to_rad(int deg)
    {
        return (float)(deg * 3.14)/180;
    }


    /* find sine of an angle */
    public float trigo_sin(int x)
    {
        return (float)Math.sin(x);

    }

    /* find cosine of an angle */
    public float trigo_cosin(int x)
    {
        return (float)Math.cos(x);
    }

    /* find tangent of an angle */
    public float trigo_tan(int x)
    {
        return (float)Math.tan(x);
    }

    /* convert given decimal number to hexadecimal number */
    public String dec_to_hex(int x)
    {
        String ans="";
        if(x<0)
        {
            System.out.println("Please Enter a positive number");
            return "-1";
        }
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(x>0)
        {
            ans=hex[x%16]+ans;
            x=x/16;
        }
        return ans;
    }


    /* convert given hexadecimal number to decimal number */
    public int hex_to_dec(String s)
    {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for(int i = 0; s.length()>i; i++)
        {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            if(d==-1)
            {
                System.out.println("Invalid hex string");
                return -1;
            }
            val = 16*val + d;
        }
        return val;
    }


    /* convert given binary number to decimal number */
    public int bin_to_dec(int n)
    {
        int dec =0, p = 0;
        while(n!=0)
        {
            dec += ((n%10)*Math.pow(2,p));
            n=n/10;
            p++;
        }
        return dec;

    }


    /* convert given octal number to decimal number */
    public int oct_to_dec(int n)
    {
        int oct;
        int d=0;
        int i = 0;
        int orig;
        oct = n;
        orig = oct;
        while(oct != 0)
        {
            d = d + (oct%10)*(int)Math.pow(8, i);
            i++;
            oct = oct/10;
        }
        return d;
    }

    /* convert given binary number to hexadecimal number */
    public String bin_to_hex(int d)
    {
        int binnum, rem;
        String hexdecnum="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        binnum=d;
        while(binnum>0)
        {
            rem = binnum%16;
            hexdecnum = hex[rem] + hexdecnum;
            binnum = binnum/16;
        }
        return hexdecnum;
    }

    /* convert given octal number to binary number */
    public int oct_to_bin(int d)
    {
        int decimalNumber = 0, i = 0;
        int binaryNumber = 0;
        int octalNumber = d;
        while(octalNumber != 0)
        {
            decimalNumber += (octalNumber % 10) * Math.pow(8, i);
            ++i;
            octalNumber/=10;
        }

        i = 1;

        while (decimalNumber != 0)
        {
            binaryNumber += (decimalNumber % 2) * i;
            decimalNumber /= 2;
            i *= 10;
        }

        return binaryNumber;
    }


    /* convert given octal number to hexadecimal number */
    public String oct_to_hex(int q)
    {
        char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        String hexdec="";
        while(q != 0)
        {
            rem=q%16;
            hexdec= a[rem] + hexdec;
            q= q/16;
        }
        return hexdec;
    }



    public String reScaleDouble(double answerNum)
    {
        //round to the 10th decimal place (like actual 10th not first decimal)
        //if the number is too high or low it ends as zero which is bad
        if((answerNum<1.0E7 && answerNum>1.0E-7) || (answerNum>-1.0E7 && answerNum<-1.0E-7))
        {
            answerNum=Math.round(answerNum*10000000000.0)/10000000000.0;
        }

        //if double is just .0 then it's an int otherwise keep it
        if(Double.toString(answerNum).endsWith(".0"))
        {
            return Integer.toString((int)answerNum);
        }
        else
            return Double.toString(answerNum);
    }

    public String timeConverter(String equationText, String fromThis, String toThis) {
        String answerText;

        try {
            double answerNum = Double.parseDouble(equationText);
            switch (fromThis) {
                case "Seconds":
                    switch (toThis) {
                        case "Minutes":
                            answerNum /= 60.0;
                            break;
                        case "Hours":
                            answerNum /= 3600.0;
                            break;
                        case "Days":
                            answerNum /= 86400.0;
                            break;
                        case "Weeks":
                            answerNum /= 604800.0;
                            break;
                        case "Months":
                            answerNum /= 2.628e+6;
                            break;
                        case "Years":
                            answerNum /= 3.154e+7;
                            break;
                        default:
                            answerText = "";

                    }
                    break;
                case "Minutes":
                    switch (toThis) {
                        case "Seconds":
                            answerNum *= 60.0;
                            break;
                        case "Hours":
                            answerNum /= 60.0;
                            break;
                        case "Days":
                            answerNum /= 1440.0;
                            break;
                        case "Weeks":
                            answerNum /= 10080.0;
                            break;
                        case "Months":
                            answerNum /= 43800.0;
                            break;
                        case "Years":
                            answerNum /= 525600.0;
                            break;
                        default:
                            answerText = "";

                    }
                    break;
                case "Hours":
                    switch (toThis) {
                        case "Seconds":
                            answerNum *= 3600.0;
                            break;
                        case "Minutes":
                            answerNum *= 60.0;
                            break;
                        case "Days":
                            answerNum /= 24.0;
                            break;
                        case "Weeks":
                            answerNum /= 168.0;
                            break;
                        case "Months":
                            answerNum /= 730.0;
                            break;
                        case "Years":
                            answerNum /= 8760.0;
                            break;
                        default:
                            answerText = "";

                    }
                    break;
                case "Days":
                    switch (toThis) {
                        case "Seconds":
                            answerNum *= 86400.0;
                            break;
                        case "Minutes":
                            answerNum *= 1440.0;
                            break;
                        case "Hours":
                            answerNum *= 24.0;
                            break;
                        case "Weeks":
                            answerNum /= 7.0;
                            break;
                        case "Months":
                            answerNum /= 30.417;
                            break;
                        case "Years":
                            answerNum /= 365.0;
                            break;
                        default:
                            answerText = "";

                    }
                    break;
                case "Weeks":
                    switch (toThis) {
                        case "Seconds":
                            answerNum *= 604800.0;
                            break;
                        case "Minutes":
                            answerNum *= 10080.0;
                            break;
                        case "Hours":
                            answerNum *= 168.0;
                            break;
                        case "Days":
                            answerNum *= 7.0;
                            break;
                        case "Months":
                            answerNum /= 4.345;
                            break;
                        case "Years":
                            answerNum /= 52.143;
                            break;
                        default:
                            answerText = "";

                    }
                    break;
                case "Months":
                    switch (toThis) {
                        case "Seconds":
                            answerNum *= 2.628e+6;
                            break;
                        case "Minutes":
                            answerNum *= 43800.0;
                            break;
                        case "Hours":
                            answerNum *= 730.0;
                            break;
                        case "Days":
                            answerNum *= 30.417;
                            break;
                        case "Weeks":
                            answerNum *= 4.345;
                            break;
                        case "Years":
                            answerNum /= 12.0;
                            break;
                        default:
                            answerText = "";

                    }
                    break;
                case "Years":
                    switch (toThis) {
                        case "Seconds":
                            answerNum *= 3.154e+7;
                            break;
                        case "Minutes":
                            answerNum *= 525600.0;
                            break;
                        case "Hours":
                            answerNum *= 8760.0;
                            break;
                        case "Days":
                            answerNum *= 365.0;
                            break;
                        case "Weeks":
                            answerNum *= 52.143;
                            break;
                        case "Months":
                            answerNum *= 12.0;
                            break;
                        default:
                            answerText = "";

                    }
                    break;
            }
            answerText = reScaleDouble(answerNum);
        } catch (Exception e) {
            e.printStackTrace();
            answerText = "ERROR!";
        }
        return answerText;

    }


//    public static void main(String args[])
//
//    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Choose the operations you want to perform");
//        System.out.println("1.Addition \n"
//                + "2.Subtraction\n"
//                + "3.Multiplication\n"
//                + "4.Division\n"
//                + "5.Mod\n"
//                + "6.Square\n"
//                + "7.Cube\n"
//                + "8.SquareRoot\n"
//                + "9.CubeRoot\n"
//                + "10.Factorial\n"
//                + "11.Inverse\n"
//                + "12.Power10\n"
//                + "13.Exponent\n"
//                + "14.Permutation\n"
//                + "15.Combination\n"
//                + "16.Radian to Degree\n"
//                + "17.Degree to Radian\n"
//                + "18.Sine\n"
//                + "19.Cosine\n"
//                + "20.Tan\n"
//                + "21.Hexadecimal to Decimal\n"
//                + "22.Binary to Decimal\n"
//                + "23.Octal to Decimal\n"
//                + "24.Binary to Octal\n"
//                + "25.Binary to Hexadecimal\n"
//                + "26.Solve Quadratic equation\n"
//                + "27.Decimal to hexadecimal\n"
//                + "28.Decimal to binary\n"
//                + "29.Decimal to octal\n"
//                + "30.Octal to binary\n"
//                + "31.Octal to hexadecimal\n"
//                + "32.Hexadecimal to binary\n"
//                + "33.Hexadecimal to octal\n"
//                + "34. Time Converter"
//        );
//        int ch=sc.nextInt();
//        Scientific g=new Scientific();
//        float a;
//        float b;
//        float res;
//        int a1;
//        int b1;
//        int r;
//        int n[];
//        String str;
//        switch(ch)
//        {
//
//            case 1: System.out.println("Enter two inputs");
//                a=sc.nextFloat();
//                b=sc.nextFloat();
//                res=g.addition(a, b);
//                System.out.println("Result= "+res);
//                break;
//
//            case 2: System.out.println("Enter two inputs");
//                a=sc.nextFloat();
//                b=sc.nextFloat();
//                res=g.subtraction(a, b);
//                System.out.println("Result= "+res);
//                break;
//
//            case 3: System.out.println("Enter two inputs");
//                a=sc.nextFloat();
//                b=sc.nextFloat();
//                res=g.multiply(a, b);
//                System.out.println("Result= "+res);
//                break;
//
//            case 4: System.out.println("Enter two inputs");
//                a=sc.nextFloat();
//                b=sc.nextFloat();
//                res=g.division(a, b);
//                System.out.println("Result= "+res);
//                break;
//
//            case 5: System.out.println("Enter two inputs");
//                a1=sc.nextInt();
//                b1=sc.nextInt();
//                res=g.modulo(a1, b1);
//                System.out.println("Result= "+res);
//                break;
//
//            case 6: System.out.println("Enter input");
//                a=sc.nextFloat();
//                res=g.square_it(a);
//                System.out.println("Result= "+res);
//                break;
//
//            case 7	: System.out.println("Enter input");
//                a=sc.nextFloat();
//                res=g.cube_it(a);
//                System.out.println("Result= "+res);
//                break;
//
//            case 8: System.out.println("Enter input");
//                a=sc.nextFloat();
//                res=g.square_root_it(a);
//                System.out.println("Result= "+res);
//                break;
//
//            case 9: System.out.println("Enter input");
//                a=sc.nextFloat();
//                res=g.cube_root_it(a);
//                System.out.println("Result= "+res);
//                break;
//
//            case 10: System.out.println("Enter input");
//                a1=sc.nextInt();
//                r=g.factorial_of_it(a1);
//                System.out.println("Result= "+r);
//                break;
//
//            case 11	: System.out.println("Enter input");
//                a1=sc.nextInt();
//                res=g.inverse_of_it(a1);
//                System.out.println("Result= "+res);
//                break;
//
//            case 12: System.out.println("Enter input");
//                a1=sc.nextInt();
//                r=(int) g.power_base_10(a1);
//                System.out.println("Result= "+r);
//                break;
//
//            case 13: System.out.println("Enter input");
//                a1=sc.nextInt();
//                res=g.exponent_of(a1);
//                System.out.println("Result= "+res);
//                break;
//
//            case 14: System.out.println("Enter two inputs");
//                a1=sc.nextInt();
//                b1=sc.nextInt();
//                r=g.permutations_of(a1, b1);
//                System.out.println("Result= "+r);
//                break;
//
//            case 15: System.out.println("Enter two inputs");
//                a1=sc.nextInt();
//                b1=sc.nextInt();
//                r=g.combinations_of(a1, b1);
//                System.out.println("Result= "+r);
//                break;
//
//            case 16	: System.out.println("Enter input");
//                a1=sc.nextInt();
//                res=g.rad_to_degree(a1);
//                System.out.println("Result= "+res);
//                break;
//
//            case 17	: System.out.println("Enter input");
//                a1=sc.nextInt();
//                res=g.degree_to_rad(a1);
//                System.out.println("Result= "+res);
//                break;
//
//            case 18	: System.out.println("Enter input");
//                a1=sc.nextInt();
//                res=g.trigo_sin(a1);
//                System.out.println("Result= "+res);
//                break;
//
//            case 19	: System.out.println("Enter input");
//                a1=sc.nextInt();
//                res=g.trigo_cosin(a1);
//                System.out.println("Result= "+res);
//                break;
//
//            case 20	: System.out.println("Enter input");
//                a1=sc.nextInt();
//                res=g.trigo_tan(a1);
//                System.out.println("Result= "+res);
//                break;
//
//            case 21	: System.out.println("Enter Hexadecimal");
//                str=sc.nextLine();
//                str=sc.nextLine();
//                r=g.hex_to_dec(str);
//                System.out.println("Result= "+r);
//                break;
//
//            case 22	: System.out.println("Enter Binary");
//                a1=sc.nextInt();
//                r=g.bin_to_dec(a1);
//                System.out.println("Result= "+r);
//                break;
//
//            case 23	: System.out.println("Enter Octal");
//                a1=sc.nextInt();
//                r=g.oct_to_dec(a1);
//                System.out.println("Result= "+r);
//
//                break;
//
//            case 24: System.out.println("Enter Binary");
//                a1=sc.nextInt();
//                ArrayList<Integer> res1=new ArrayList<Integer>();
//                //res1=g.bin(a1);
//                System.out.println("Result= ");
//                //System.out.print(res1);
//                break;
//
//            case 25:  System.out.println("Enter Binary");
//                a1=sc.nextInt();
//                //String res11=g.binTohex(a1);
//                System.out.println("Result= ");
//                //System.out.print(res11);
//                break;
//
//            case 26: System.out.println("Enter a,b,c values");
//                int a11=sc.nextInt();
//                int b11=sc.nextInt();
//                int c11=sc.nextInt();
//                ArrayList<Float> al=new ArrayList<Float>();
//                float f=g.solve_equations(a11, b11, c11);
//                System.out.println("Result is: ");
//                System.out.println(al);
//                break;
//
//            case 27: System.out.println("Enter decimal:");
//                int d=sc.nextInt();
//                String result=g.dec_to_hex(d);
//                System.out.println("Result is "+result);
//                break;
//
//            case 28: System.out.println("Enter decimal:");
//                int d1=sc.nextInt();
//                ArrayList<Integer> al1=new ArrayList<Integer>();
//                //al1=g.dec_to_bin(d1);
//                System.out.println("Result is"+al1);
//                break;
//
//            case 29: System.out.println("Enter decimal:");
//                int d2=sc.nextInt();
//                ArrayList<Integer> al2=new ArrayList<Integer>();
//                // al2=g.decTooct(d2);
//                System.out.println("Result is: ");
//                break;
//
//            case 30: System.out.println("Enter Octal number");
//                int d3=sc.nextInt();
//                int r1=g.oct_to_bin(d3);
//                System.out.println("Result is "+r1);
//                break;
//
//            case 31: System.out.println("Enter octal number");
//                int d4=sc.nextInt();
//                int d5=g.oct_to_dec(d4);
//                String result1=g.oct_to_hex(d5);
//                System.out.println("Result is: "+result1);
//                break;
//
//            case 32: System.out.println("Enter hexadecimal: ");
//                sc.nextLine();
//                String hex=sc.nextLine();
//                int d6=g.hex_to_dec(hex);
//                ArrayList<Integer> al21=new ArrayList<Integer>();
//                //al21=g.hexTobin(d6);
//                System.out.println("Result is: "+al21);
//                break;
//
//            case 33: System.out.println("Enter hexadecimal");
//                sc.nextLine();
//                String hex1=sc.nextLine();
//                int d7=g.hex_to_dec(hex1);
//                ArrayList<Integer> al3=new ArrayList<Integer>();
//                //al3=g.hex_to_oct(d7);
//                //System.out.println("Result is: "+al3);
//                break;
//
//            case 34:System.out.println("Available Choices are: \n"
//            +"1. Seconds \n"
//            +"2. Minutes \n"
//            +"3. Hours \n"
//            +"4. Days \n"
//            +"5. Weeks \n"
//            +"6. Months \n"
//            +"7. Years");
//            sc.nextLine();
//            System.out.println("Enter the text from which you want to convert: ");
//            String from=sc.nextLine();
//            System.out.println("Enter the text to which you want to convert: ");
//            String to=sc.nextLine();
//            System.out.println("Enter the amount: ");
//            String s=sc.nextLine();
//
//            String ans= g.timeConverter(s,from,to);
//            System.out.println(ans);
//            break;
//
//            default: System.out.println("Wrong choice!!");
//        }
//    }

}
