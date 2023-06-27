package exam87;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Random_user {

    public void spilt_user(String[] arr, int n){
        Random in = new Random();
        List<String> user = new ArrayList<>();
        for (int i = 0; i < n;) {
            int key = in.nextInt(4);
            if (!arr[key].equals("")){
                user.add(arr[key]);
                arr[key] = "";
                i++;
            }
        }
     
        System.out.println(user);
        
    }
    
    public void spilt_user2(String[] arr, int n){
        Random in = new Random();
        List<String> user = new ArrayList<>();
        for (int i = 0; i < n;) {
            int key = in.nextInt(5);
            if (!arr[key].equals("")){
                user.add(arr[key]);
                arr[key] = "";
                i++;
            }
        }
     
        System.out.println(user);
        int sp = in.nextInt(5)+1;
        System.out.println("6명 조: " + sp + " 조");
        
    }
    public static void main(String[] args){
    	
    	// String[] nameString = {"곽호성","김나영","김동완","김성진","김세훈","김용운","문수찬","박주현",
       // "서경원","성다영","안병준","오세원","유승민","장은비","장현수","정효영","조규범","조상용","차승현","최석호","한승현"};
    	// backend
        String[] nameStringA = {"문수찬","유승민","조상용","차승현"};
        String[] nameStringB = {"곽호성","서경원","장현수","박주현"};
        String[] nameStringC = {"김동완","오세원","김성진","장은비"};
        String[] nameStringD = {"김세훈","김용운","정효영","최석호"};
        		
     // front
        String[] nameStringE = {"김나영","성다영","안병준","조규범","한승현"};

        Random_user random_user = new Random_user();

        random_user.spilt_user(nameStringA,4);
        random_user.spilt_user(nameStringB,4);
        random_user.spilt_user(nameStringC,4);
        random_user.spilt_user(nameStringD,4);
        random_user.spilt_user2(nameStringE,5);


    }
}
