import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] coins = {2,3,6,7};
        int amt = 12;
        System.out.println(minCoinChange(coins,amt));
    }

    public static int minCoinChange(int[] coins,int amount){
        int[] minCoins = new int[amount+1];
        int[] k = new int[amount+1];
        Arrays.fill(minCoins,Integer.MAX_VALUE - 1);
        minCoins[0] = 0;
        for (int coin: coins) {
            for (int i = 0 ; i <= amount ;i++){
                if((i - coin) >= 0){
                    minCoins[i] = Math.min(minCoins[i],minCoins[i - coin] +1);
//                    if(minCoins[i]<=(minCoins[i-coin]+1)){
//                        k[i] = minCoins[i-coin]+1;
//                    }else k[i]=minCoins[i];
                }
            }
        }
        System.out.println(Arrays.toString(minCoins));
//        System.out.println();
        return minCoins[amount] != Integer.MAX_VALUE-1 ? minCoins[amount] : -1;
    }
}