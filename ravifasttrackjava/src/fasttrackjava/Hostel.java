package fasttrackjava;

public class Hostel {
private String hstlId;
@Override
public String toString() {
	return "Hostel [hstlId=" + hstlId + ", hstlName=" + hstlName + ", hstlRooms=" + hstlRooms + "]";
}
private String hstlName;
private int hstlRooms;
public String getHstlId() {
	return hstlId;
}
public void setHstlId(String hstlId) {
	this.hstlId = hstlId;
}
public String getHstlName() {
	return hstlName;
}
public void setHstlName(String hstlName) {
	this.hstlName = hstlName;
}
public int getHstlRooms() {
	return hstlRooms;
}
public void setHstlRooms(int hstlRooms) {
	this.hstlRooms = hstlRooms;
}
}
