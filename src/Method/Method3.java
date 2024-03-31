package Method;

public class Method3 {

	public static void main(String[] args) {
		//multidiamention 
		
		Method3 ob=new Method3();
		Object [][] list= ob.ns_4();
		
		for(Object []onedim:list) {
			for(Object singlebox:onedim) {
				System.out.println(singlebox);
			}
		}
	}
	// kathia 25, urmin 26, kukon 27
	
	public Object [][] ns_4(){
		Object [][] studentlist= {{"kathia",25},{"urmin",26},{"kukon",27}};
		return studentlist;
	}

}
