class Solution {
    public boolean isHappy(int n) {

    Set<Integer> seen = new HashSet<>();

    while (n != 1) {

        if (seen.contains(n)) {
            return false;
        }

        seen.add(n);

        int sum = 0;
        int tmp = n;

        while (tmp > 0) {
            int digit = tmp % 10;
            sum += digit * digit;
            tmp = tmp / 10;
        }

        n = sum;
    }

    return true;
}
}