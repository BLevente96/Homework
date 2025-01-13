public class KettesFeladat {
    public static void main(String[] args) {

        String word = "management";
        boolean wordgotA = false;
        char[] charArray = word.toCharArray();
        int position = 0;


        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a') {
                wordgotA = true;
                position = i;
                break;


            }


        }
        if (wordgotA) {
            System.out.println("The word got 'A' in it");
            System.out.println("The first 'A' position is: " + position);
        } else System.out.println("The word got no 'A' in it");


    }

}
