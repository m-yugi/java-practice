public class roman_nums {
    public static void main(String[] args) {
        int num = 58;
        StringBuilder total = new StringBuilder();
        while (num > 0) {
            if(num >= 1000) {
                total.append("M");
                num -= 1000;
            }
            else if (num >=900) {
                total.append("CM");
                num -= 900;
            }
            else if( num >=500) {
                total.append("D");
                num -= 500;
            }
            else if( num >=400) {
                total.append("CD");
                num -= 400;
            }
            else if( num >=100) {
                total.append("C");
                num -= 100;
            }
            else if(num >=90) {
                total.append("XC");
                num -= 90;
            }
            else if( num >=50) {
                total.append("L");
                num -= 50;
            }
            else if( num >=40) {
                total.append("XL");
                num -= 40;
            }
            else if(num >=10) {
                total.append("X");
                num -= 10;
            }
            else if(num >=9) {
                total.append("IX");
                num -= 9;
            }
            else if(num >=5) {
                total.append("V");
                num -= 5;
            }
            else if(num >=4) {
                total.append("IV");
                num -= 4;
            }
            else if(num >=1) {
                total.append("I");
                num -= 1;
            }
        }
        System.out.println(total);
    }
}
