package practice.ex03;

import java.util.Arrays;

public class Line {
	
	private int length;
	private static int max_length;
	
	public Line() {}
	
	public Line(int length) {
		if(length > 0) {
			if(length > max_length){
				max_length = length;
			}
			this.length = length;
		}else {
			System.out.println("0이상의 길이를 입력하세요.");
		}
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		if(length > 0) {
			if(length > max_length){
				max_length = length;
			}
			this.length = length;
		}else {
			System.out.println("0이상의 길이를 입력하세요.");
		}
	}
	//매개변수를 연속으로 받아 배열로 처리
	public int whichIsLong(int ... lengths) {
		Arrays.sort(lengths);
		if(lengths[lengths.length-1] <= 0) {
			return -1;
		}else {
			return lengths[lengths.length-1];
		}
	}
	//static변수를 활용
	public int whichIsLong() {
		if(max_length == 0) {
			return -1;
		}
		return max_length;
	}
}
