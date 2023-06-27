package practice.ex05.lhj;

public class Hotel {
	
	Room room = new Room();
	
	public void add(int roomNum, String name) {
		room.rooms[roomNum-1][0] = String.valueOf(roomNum);
		room.rooms[roomNum-1][1] = name;
	}
	
	public void show() {
		for(int i =0; i<room.rooms.length; i++) {
			if(room.rooms[i][0] != null) { //.equals 사용 시 참조변수로 null값이 오게 되면 예외 발생(null.equals 가 되버리므로)
				System.out.printf("%d 번방을 %s가 예약했습니다.\n", Integer.parseInt(room.rooms[i][0]), room.rooms[i][1]);
			}
		}
	}
	
	class Room{
		String[][] rooms = new String[10][2];
		
		Room() {}
	}
}
