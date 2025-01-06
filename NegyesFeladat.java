public class NegyesFeladat {
    public static void main(String[] args) {
        String spaceWord = "Theres    a     lot    of    spaces";
        String result =spaceWord.replaceAll("\\s+"," ");
        char[] noSpace= result.toCharArray();
        System.out.println(noSpace);


    }
}
