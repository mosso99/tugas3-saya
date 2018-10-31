
public class mainQueueString {

	public static void main(String[] args) {
		queueString nama = new queueString();
		nama.cetak();
		
		nama.insert("AINUNBERLIAN");
		nama.cetak();
		
		nama.insert("RAMLAH");
		nama.cetak();
		
		nama.insert("FATMAWATI");
		nama.cetak(); 
		
		String o1 = nama.get();
		System.out.println(o1);
		nama.cetak();
		
		String o2 = nama.get();
		System.out.println(o2);
		nama.cetak();
		
		String o3 = nama.get();
		System.out.println(o3);
		nama.cetak();
		
		String o4 = nama.get();
		System.out.println(o4);
		nama.cetak();
	

	
	}

}
