public class MaxProfit {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int globalprofit = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int currentProfit = arr[j] - arr[i]; //arr[2] arr[1] //arr[3] arr[1] //arr[4] arr[1] //arr[5] arr[1]
                //1-7 //5-7 //3-7 //6-7 //4-7
                //5-1 //3-1 //6-1 //4-1
                //3-5  //6-5 //4-5
                //6-3 //4-3
                //4-4

                if (currentProfit > globalprofit) {
                    globalprofit = currentProfit;
                }
            }
        }
        System.out.println("profit: " + globalprofit);
    }
}
