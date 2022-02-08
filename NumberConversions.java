public class NumberConversions{
    /**
     * Converts decimal int to binary String.
     * @param dec decimal value
     * @return binary value
     */
    public static String decToBin(int dec){
        String bin = "";

        int product = dec;

        //Repeated division
        while(product > 0){
            bin += Integer.toString(product % 2);
            product = product / 2;
        }

        //Flips the string because its really cringe and i can't add numbers backwards
        String revStr = "";
        for (int i = bin.length()-1; i >= 0; i--)
        {
            revStr += bin.charAt(i);
        }

        return revStr;
    }
}