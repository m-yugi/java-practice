public class test3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "Ciphering.";
        int num=26;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' || s.charAt(i)=='!' || s.charAt(i)=='_' ||s.charAt(i)=='@'||s.charAt(i)=='.' ||s.charAt(i)=='=') {
                sb.append(s.charAt(i));
            } else {
                if(Character.isUpperCase(s.charAt(i))){
                    int i1 = (s.charAt(i) + num) - 'A';
                    char c;
                    if (i1 >=26) {
                        c = (char) ((i1 % 26) + 'A');
                    } else {
                        c = (char) ((s.charAt(i) + num));
                    }
                    sb.append(c);
                }
                else {
                    int i1 = (s.charAt(i) + num) - 'a';
                    char c;
                    if (i1 >=26) {
                        c = (char) ((i1 % 26) + 'a');
                    } else {
                        c = (char) ((s.charAt(i) + num));
                    }
                    sb.append(c);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
