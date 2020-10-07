package io.github.mrkulisav.HeadFirst.Chapter1;

public class PraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"multi-Tier","B-to-B","win-win","six-sigma"};
        String[] wordListTwo = {"empowered","sticky","value-added","focused","aligned"};
        String[] wordListThree = {"solution","space","vision","portal"};
        
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        int random1 = (int) (Math.random() * oneLength);
        int random2 = (int) (Math.random() * twoLength);
        int random3 = (int) (Math.random() * threeLength);
        
        String phrase = wordListOne[random1] + " " +
        wordListTwo[random2] + " " + wordListThree[random3];
        
        System.out.println(phrase);
    }
}
