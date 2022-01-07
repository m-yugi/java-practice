import java.io.*;
import java.util.*;


public class cypher {

    char Table[][] = new char[26][26];
    public void generateTable() {
        char alpharray[] = new char[26];
        char c ='a';
        for(int x = 0; x<26;x++) {
            alpharray[x]= c;
            c++;
        }

        int i=0,j,k;
        while(i<26) {
            k=i;
            for(j=0;j<26;j++) {
                if(k>=26) {
                    k=0;
                }
                Table[i][j] = alpharray[k++];
            }
            i++;
        }


    }

    private String key;
    public cypher(String k) {
        key = k;
    }

    public String encrypt(String plainText) {

        char[] plainTextArr = plainText.toCharArray();
        while(key.length()<plainText.length()) {
            key +=key;

        }
        key = key.substring(0,plainText.length());
        System.out.println(key);
        char[] keyArray = key.toCharArray();
        String cipherText = "";
        for(int i = 0;i<plainText.length();i++) {
            int rowpos=keyArray[i]-'a';
            int colpos = plainTextArr[i]-'a';
            cipherText +=Table[rowpos][colpos];
        }
        return cipherText;
    }


    public String decrypt(String cipherText) {
        String plainText="";

        char[] cipherTextArr = cipherText.toCharArray();
        char[] keyArray = key.toCharArray();
        char [] plainTextArr = new char[keyArray.length];
        for(int i =0; i<keyArray.length; i++) {
            int rowpos = keyArray[i]-'a';
            int cipherpos = new String(Table[rowpos]).indexOf(cipherTextArr[i]);
            plainTextArr[i] = Table[0][cipherpos];
        }
        plainText = new String(plainTextArr);
        return plainText;


    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key");
        String keyText = sc.nextLine();
        cypher p = new cypher(keyText);
        p.generateTable();
        System.out.println("Enter plain text");
        String plainText = sc.nextLine();
        String cipherText = p.encrypt(plainText);
        System.out.println("The encrypted text is "+ cipherText);
        plainText = p.decrypt(cipherText);
        System.out.println("The Decrypted text is "+ plainText);

    }




}
