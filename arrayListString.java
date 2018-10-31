import java.util.ArrayList;


public class arrayListString {

	public static void main(String[] args) {
		ArrayList<String> arls= new ArrayList<String>();
		// menambahkan
		arls.add("AINUNBERLIAN");
		arls.add("RAMLAH");
		arls.add("FATMAWATI");
		System.out.println(arls);
		//menghapus
		arls.remove("FATMAWATI");
		System.out.println(arls);
		
		ArrayList<String> arlS= (ArrayList<String>)arls.clone();
		arlS.add("LISKA");
		System.out.println("arls" +arls);
		System.out.println("arlS" +arlS);
		
		System.out.println("kosongkah:" + arls.isEmpty());
		if (arls.contains("FATMAWATI"))
			System.out.println(" ada FATMAWATI");
		else{
			System.out.println("tak ada FATMAWATI");
		}
		System.out.println("arl1" +arls);
		System.out.println("arl2" +arlS);
			
	}

}
