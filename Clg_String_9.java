
// String Operation Using Various String Functions  ::

public class Clg_String_9 {
    public static void main(String[] args) {

        System.out.println();

        char str1[] = { 'A', 'R', 'N', 'Q', 'U', 'X', 'F' };
        String str2 = new String(str1);

        // FIND LENGTH OF GIVEN STRING :
        System.out.println("Find length of String : ");
        System.out.println("Given string is : " + str2);
        System.out.println("Length of Given string : " + str2.length());
        System.out.println();

        // REVERSE STRING :
        System.out.println("Given String is : " + str2);
        System.out.println("Reverse String  is: ");
        for (int i = str2.length() - 1; i >= 0; i--) {
            System.out.print(str1[i]);
        }
        System.out.println();

        // CONCATE STRING :
        System.out.println();
        System.out.println("Concate of two String : ");
        String str4 = new String("My Name is ");
        System.out.println("String 1 : " + str4);
        String str5 = new String("Mitesh R.Vaghela");
        System.out.println("String 2 : " + str5);
        System.out.println(str4.concat(str5));
        System.out.println();

        // COMPARISON OF STRINGS :
        System.out.println("Comparison of two String : ");
        String str6 = new String("Mitesh");
        String str7 = new String("mitesh");
        System.out.println(str6.compareTo(str7)); // here give negative output that means str6 bigger than str7
        System.out.println();

        // STRINGS EQUALITY :
        System.out.println("equal Function : ");
        String str8 = new String("Mitesh");
        String str9 = new String("miTesH");
        if (str8.equalsIgnoreCase(str9) == true) {
            System.out.println("Given two strings are equal..!");
        } else {
            System.out.println("String are not same...!");
        }
        System.out.println();

        // SEARCHING IN STRING :
        System.out.println("Searchong String also give sub String : ");
        String str10 = new String("Java programming is one of the best....!");
        System.out.println(str10.substring(5, 26) + " :- is Substring of Given string!");
        System.out.println();

        // TRIMMING STRING :
        System.out.println("Trimming Function : ");
        String str11 = new String("        hello! I am college student!");
        System.out.println("Before trim : " + str11);
        System.out.println("After trim : " + str11.trim());
        System.out.println();

        // REPLACE CHARACTER :
        System.out.println("Replace character : a --> A");
        String str12 = new String("Java programmer....!");
        System.out.println("Before replace : " + str12);
        System.out.println("After replace : " + str12.replace('a', 'A'));
        System.out.println();

        // INDEXOF METHOD :
        System.out.println("indexof Function : ");
        String str13 = new String("Vaghela Mitesh R.");
        System.out.println(str13.indexOf("sh"));
        System.out.println();

        // LASTINDEXOF METHOD :
        System.out.println("lastIndexOf Function : ");
        String str14 = new String("Vaghela Mitesh R.");
        System.out.println(str14.lastIndexOf(" M", 7));
        System.out.println();
    }
}