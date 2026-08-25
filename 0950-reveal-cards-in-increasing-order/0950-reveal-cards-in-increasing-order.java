class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int [] answer = new int[n];

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0 ; i < n ; i++){
            q.add(i);
        }

        // 1st 

        for(int card : deck){

            int index = q.poll();

            answer[index] = card;

            if(!q.isEmpty()){
                q.add(q.poll());
            }
        }

        return answer;
    }
}