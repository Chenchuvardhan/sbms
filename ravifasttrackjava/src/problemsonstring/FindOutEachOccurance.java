package problemsonstring;



public class FindOutEachOccurance {
	public static void main(String[] args) {
		String str="java";
		StringBuilder sb=new StringBuilder();
		str.chars().distinct().forEach(i->sb.append((char)i));
		System.out.println(sb);
	}
}
