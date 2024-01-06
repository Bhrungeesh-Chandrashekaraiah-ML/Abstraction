public class StrAllOperations {
    public static void main(String[] args) {
        String newString = "I am Hungry";

        String firstName = "Bhrungeesh";
        String lastName = "Chandrashekar";
        String fullName = firstName +" "+ lastName;

        String str1 = "Bhru";
        String str2 = "bhru";
        String str3 = new String("bhru");


        if (str2.equals(str3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }


        int length = newString.length();

        String subStr = newString.substring(1);

        char firstLetter = newString.charAt(0);

        String replaced = newString.replace('H', 'V');

        String upperCase = newString.toUpperCase();
        String lowerCase = newString.toLowerCase();

        String sentence = "String is an immutable class";
        String[] words = sentence.split(" ");

        System.out.println("new String: " + newString);
        System.out.println("Full Name: " + fullName);
        System.out.println("Length of new String: " + length);
        System.out.println("Substring from index 3 to 7: " + subStr);
        System.out.println("First character: " + firstLetter);
        System.out.println("Replaced String: " + replaced);
        System.out.println("Uppercase String: " + upperCase);
        System.out.println("Lowercase String: " + lowerCase);
        System.out.println("Words from sentence:");
        for (String word : words) {
            System.out.println("- " + word);
        }
        StringBuffer stringBuf = new StringBuffer("Bhrungeesh");
        stringBuf.append(" ");
        stringBuf.append("Chandrashekar");
        System.out.println(stringBuf);

        StringBuilder stringBuild = new StringBuilder("Bhrungeesh");
        stringBuild.append(" ");
        stringBuild.append("Chandrashekar");
        System.out.println(stringBuild);
    }
}


