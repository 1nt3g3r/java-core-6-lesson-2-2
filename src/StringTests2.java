public class StringTests2 {
    public static void main(String[] args) {
        String x = "a\nbc";
        System.out.println(x);
        System.out.println(x.length());

        //Concatenate
        String concatenateResult = "ab" + "cd" + 66 + 77;
        System.out.println("concatenateResult = " + concatenateResult);

        //Change case
        String diffCase = "aBcDeF";
        System.out.println("diffCase.toLowerCase() = " + diffCase.toLowerCase());
        System.out.println("diffCase.toUpperCase() = " + diffCase.toUpperCase());

        //Contains
        String text = "Java is great programming language";
        System.out.println("search(text, \"jAvA\") = " + search(text, "jAvA"));

        //Compare
        String java1 = "Java";
        String java2 = "java";
        System.out.println("java1.equals(java2) = " + java1.equalsIgnoreCase(java2));

        //Char index
        String sentence = "It's raining";
        char at5 = sentence.charAt(5);
        System.out.println("at5 = " + at5);

        //startsWith, endsWith
        System.out.println("\"someText.\".endsWith(\".\") = " + "someText.".endsWith("."));
        System.out.println("\"###TEST###\".startsWith(\"##\") = " + "###TEST###".startsWith("##"));

        //isEmpty, isBlank
        String emptyText = "\n    \n";
        System.out.println("emptyText = " + emptyText);
        System.out.println("emptyText.isEmpty() = " + emptyText.isEmpty());
        System.out.println("emptyText.isBlank() = " + emptyText.isBlank());

        //replace
        String weather = "cold, raining";
        weather = weather
                .replace("cold", "warm")
                .replace("raining", "sunny");
        System.out.println("weather = " + weather);

        //trim, strip
        String dirtyString = "    \n   text     \n";
        System.out.println("dirtyString = " + dirtyString.trim());
        System.out.println("dirtyString.strip() = " + dirtyString.strip());

        //substring
        System.out.println("\"ab123cd\".substring(2, 4) = " + "ab123cd".substring(2, 5));
    }

    private static boolean search(String text, String search) {
        return text.toLowerCase().contains(search.toLowerCase());
    }
}
