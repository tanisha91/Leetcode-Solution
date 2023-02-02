class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
       for(int i = 0; i < words.length - 1; i++)
        {
            String word1 = words[i];
            String word2 = words[i+1];

            //finding the max len for traversing
            int len = Math.max(word1.length(), word2.length());

            for(int j = 0; j < len; j++)
            {
                //as the index starts from 0
                int index1 = -1;
                int index2 = -1;

                //getting the order
                if(j < word1.length())
                    index1 = order.indexOf(word1.charAt(j));

                if(j < word2.length())
                    index2 = order.indexOf(word2.charAt(j));

                //order of word 1 is less than word 2, then break.
                //as its in lexographic order
                if(index1 < index2)
                    break;

                //if word 2's order is larger than word 1 order
                else if(index2 < index1)
                    return false;
            }
        }
        return true;
    }
}