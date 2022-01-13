package ch12;

public class P285 {
	public static void main(String[] args) {
		
		Obj obj1 = new Obj(100);
		Obj obj2 = new Obj(100);
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 = obj2");
		}else {
			System.out.println("obj1 != obj2");
		}
		
		Obj obj3 = obj1;
		if(obj1.equals(obj3)) {
			System.out.println("obj1 = obj3");
		}else {
			System.out.println("obj1 != obj3");
		}
		ObjOverride obj01 = new ObjOverride(100);
		ObjOverride obj02 = new ObjOverride(100);
				
		if(obj01.equals(obj02)) {
			System.out.println("obj01 = obj02");
		}else {
			System.out.println("obj01 != obj02");
		}
	}
}
class Obj{
	int obj_var;
	
	Obj(int obj_var){
		this.obj_var = obj_var;
	}
}

class ObjOverride{
	int obj_var;
	
	ObjOverride(int obj_var){
		this.obj_var = obj_var;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ObjOverride) {
			return true;
		} else {
			return false;
		}
	}
}


