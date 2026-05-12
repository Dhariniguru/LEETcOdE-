class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        int k = 0;

        for(int i = 0; i < order.length; i++) //compares orders and increments after it checks all the value in friends
        {
            for(int j = 0; j < friends.length; j++) 
            {
                if(order[i] == friends[j]) //checks the values from order & friends
                {
                    result[k] = friends[j]; //stores the value in result
                    k++; //moves to next space in result to store the next element
                    
                }
            }
        }
        return result; // retrns the required order
    }
}