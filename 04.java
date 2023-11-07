public class Students {
int id,passoutYear;
String name,contactNo,collegeName;
Students(String contactNo, String collegeName, int passoutYear){
this.contactNo = contactNo;
this.collegeName = collegeName;
this.passoutYear = passoutYear;
}
Students(int id, String name){
this("9899234455", "IIT Kanpur", 2018);
this.id = id;
this.name = name;
}
public static void main(String[] args) {
Students s = new Students(101, "John");
System.out.println("Printing Student Information: \n");
System.out.println("Name: "+s.name+"\nId: "+s.id+"\nContact No.: "+s.contactNo+"\nCollege Name: "+s.collegeName+"\nPassing Year: "+s.passoutYear);
}
}