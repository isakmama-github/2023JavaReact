package exam87;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Random_member {

    public List<String> spilt_user(String[] arr, int n){
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
     
        return user;
        
    }
    
    public List<String> spilt_user2(String[] arr, int n){
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
     
        return user;
        
    }
    public static void main(String[] args){
    	
    	String[] nameStringA = {"문수찬","유승민","조상용","차승현"};
        String[] nameStringB = {"곽호성","서경원","최석호","박주현"};
        String[] nameStringC = {"장현수","오세원","김성진","장은비"};
        String[] nameStringD = {"김세훈","김용운","정효영","김동완"};
        String[] nameStringE = {"김나영","성다영","안병준","조규범","한승현"};

        Random_member random_member = new Random_member();

        String[][] mem = new String[4][5];
        
        List<String> user = random_member.spilt_user(nameStringA,4);
        String[] arr = user.toArray(String[]::new);
        
        for (int i=0; i<4; i++) {
        	mem[i][0] = arr[i];        	
        }
        
        user = random_member.spilt_user(nameStringB,4);
        arr = user.toArray(String[]::new);

	      for (int i=0; i<4; i++) {
	      	mem[i][1] = arr[i];        	
	      }
        user = random_member.spilt_user(nameStringC,4);
        arr = user.toArray(String[]::new);

	      for (int i=0; i<4; i++) {
	      	mem[i][2] = arr[i];        	
	      }
        user = random_member.spilt_user(nameStringD,4);
        arr = user.toArray(String[]::new);

	      for (int i=0; i<4; i++) {
	      	mem[i][3] = arr[i];        	
	      }
        user = random_member.spilt_user2(nameStringE,5);
        arr = user.toArray(String[]::new);

	      for (int i=0; i<4; i++) {
	      	mem[i][4] = arr[i];        	
	      }
	      
	      for (int i=0; i<4; i++) {
	    	  System.out.print((i+1)+ "조 : ");
	    	  for (int j=0; j<5 ;j++) {
	    		  if (j <4) System.out.print(mem[i][j]+", ");
	    		  else System.out.print(mem[i][j]);
	    	  }
	    	  System.out.println(" ");
	      }
        
        Random in = new Random();
        int sp = in.nextInt(4)+1;
        System.out.println("조추첨 : " + sp + "조, "+ arr[4]);

        // String[] nameString = {"곽호성","김나영","김동완","김성진","김세훈","김용운","문수찬","박주현",
        // "서경원","성다영","안병준","오세원","유승민","장은비","장현수","정효영","조규범","조상용","차승현","최석호","한승현"};
        
    }
}
