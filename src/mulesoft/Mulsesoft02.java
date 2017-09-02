package mulesoft;

public class Mulsesoft02 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        IntList intList4 = new IntList();
        intList4.value = 4;
        intList4.next = null;
        
        IntList intList3 = new IntList();
        intList3.value = 3;
        intList3.next = intList4;
        
        IntList intList2 = new IntList();
        intList2.value = 2;
        intList2.next = intList3;
        
        IntList intList1 = new IntList();
        intList1.value = 1;
        intList1.next = intList2;
        
        Solution solution = new Solution();
        int result = solution.solution(intList1, 10);
        
        System.out.println(result);
        
    }

}
