package fasttrackjava;

public class PassByReference {
	public void showHostelDetails() {
		Hostel hs=new Hostel();
		hs.setHstlId("HSL41A-RAC");
		hs.setHstlName("Venkata Siva");
		passByHstl(hs);
		hs.setHstlRooms(10);
		System.out.println(hs);
	}
	public void passByHstl(Hostel hos) {
		hos.setHstlName("Raja Hstl");
		hos=new Hostel();
		hos.setHstlId("1a0ioi2");
		hos.setHstlName("Durga rao");
		hos.setHstlRooms(12);
		System.out.println(hos);
	}
	public static void main(String[] args) {
		new PassByReference().showHostelDetails();
	}
}
