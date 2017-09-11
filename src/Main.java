import java.util.Date;
public class Main {

	public static void main(String[] args) {

		StudentGroup a=new StudentGroup(30);

	Date v=new Date(1996,2,3);
	Student xy=new Student(9,"Shyam",v,63.8);

                a.addFirst(xy);

              System.out.println(a.getStudent(0).getId());



		//You may test that your code works find here
		//Please check that your code works and has no
		//compilation problems before to submit
	}

}
