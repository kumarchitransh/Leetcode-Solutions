class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<Boolean>(candies.length);
        int temp=candies[0];
        for(int j=0;j<candies.length;j++){
            if(temp<candies[j]){
                temp=candies[j];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=temp){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
        
    }
}
