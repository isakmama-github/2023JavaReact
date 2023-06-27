package exam05.hankook;

public class Tire {
    private int count;
    
    public int getCount() {
    	return count;
    }
    
    public void setCount(int count) {
    	if (count <= 4) {
    	   this.count = count;
    	} else {
    		System.out.println("바퀴는 4개 이하로 제작이 됩니다.");
    	}
    	
    }
}
