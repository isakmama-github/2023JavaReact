package practice.ex05;

/*
 * 호텔의 객실 예약과 예약 현황을 나타낼 수 있도록 Hotel 클래스를 작성하라
 * 호텔에는 10개의 객실이 있으며, 객실 번호는 1~10번까지이다.
 * add() - 객실 번호와 이름으로 객실을 예약하는 함수
 * show() - 현재 예약된 객실 번호와 고객 이름을 보여 주는 함수
 * 
 * [조건] 호텔에는 다수의 객실이 있지만, 객실은 호텔 내부에서만 사용한다. 
 * 따라서 객실을 위한 Room 클래스는 Hotel 클래스의 중첩 클래스로 작성하면 편리하다.
 */
public class Hotel {
	
	final int MAX_ROOM_SIZE = 10;
	Room[] rooms = new Room[MAX_ROOM_SIZE];

	// 객실을 위한 room 클래스
	class Room {
		public int roomNumber;
		public String reservationName;

	};

	void add(int roomNumber, String reservationName) {
		Room room = new Room();
		room.roomNumber = roomNumber;
		room.reservationName = reservationName;
		
		if(rooms[roomNumber - 1] == null) {
			rooms[roomNumber - 1] = room;
		} else {
			System.out.println(reservationName + "님, " + roomNumber + "번 방은 이미 예약되어 있는 방입니다.");
		}
		
	}

	public void show() {
		for (Room room : rooms) {
			if (room != null) {
				System.out.println(room.roomNumber + "번 방을 " + room.reservationName + "가 예약했습니다.");
			}
		}
	}
}
