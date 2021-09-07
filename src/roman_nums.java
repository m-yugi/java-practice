public class roman_nums {
    public static void main(String[] args) {
        int num = 58;
        String total = "";
        while (num > 0) {
            if(num >= 1000) {
                total += "M";
                num -= 1000;
            }
            else if (num >=900) {
                total += "CM";
                num -= 900;
            }
            else if( num >=500) {
                total += "D";
                num -= 500;
            }
            else if( num >=400) {
                total += "CD";
                num -= 400;
            }
            else if( num >=100) {
                total += "C";
                num -= 100;
            }
            else if(num >=90) {
                total += "XC";
                num -= 90;
            }
            else if( num >=50) {
                total += "L";
                num -= 50;
            }
            else if( num >=40) {
                total += "XL";
                num -= 40;
            }
            else if(num >=10) {
                total += "X";
                num -= 10;
            }
            else if(num >=9) {
                total += "IX";
                num -= 9;
            }
            else if(num >=5) {
                total += "V";
                num -= 5;
            }
            else if(num >=4) {
                total += "IV";
                num -= 4;
            }
            else if(num >=1) {
                total += "I";
                num -= 1;
            }
        }
        System.out.println(total);
    }
}
