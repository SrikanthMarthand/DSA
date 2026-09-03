class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left=0;
        Arrays.sort(people);
        int right=people.length-1;
        int count=0;
        while(left<=right){
           if(people[right]==limit){
             count++;
             right--;
           }
           else{
             int sum=people[left]+people[right];
             if(sum==limit){
             count++;
             left++;
             right--;
            }
           else if(sum>limit){
            count++;
            right--;
           }
           else{
             left++;
             right--;
             count++;
           }
        }
    }
    return count;
    }
}
