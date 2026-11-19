class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> stack =new Stack<>();
        for (String s : operations) {
            if (s.equals("C")) {
                stack.pop();
            }
            else if (s.equals("D")) {
                stack.push(stack.peek()*2);
            }
            else if (s.equals("+")) {
                int a=stack.pop();
                int b=stack.peek();
                stack.push(a);
                stack.push(a+b);
            }
            else {
                stack.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        for (int score : stack) {
            sum +=score;
        }
        return sum;  
    }
}