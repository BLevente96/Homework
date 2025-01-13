public class HarmasFeladat {
    public static void main(String[] args) {

        String word = "flibbertigibbet";
        char[] wordArray = word.toCharArray();
        int countB = 0;


        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i] == 'b') {
                countB++;
                System.out.println("'B' letter found, position: " + i);


            }
        }
        System.out.println("The number of 'b's in the word is: " + countB);


    }
}
