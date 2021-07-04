package _2OOPs._6Enum;

import java.util.Arrays;
import java.util.HashMap;

public enum Program {

	HOME_SCHOOL(""), 
	DAYCARE(""), 
	NURSARY("LKG,UKG & 1st"), 
	PRIMARY("2nd,3rd,4th & 5th"), 
	JUNIOR("6th,7th & 8th"),
	HIGH_SCHOOL("9th & 10th"), 
	INTERMEDIATE("11th & 12th");

	private String value;
	private static HashMap<String,String> valueNameMap;
	private static HashMap<String,Program> valueEnumMap;
	
	Program(String value) {
		this.value = value;
	}
    
	public String getValue() {
		return this.value;
	}
	
	static {
		createMapOfValueAndName();
		createMapOfValueAndEnum();
	}
	
	private static void createMapOfValueAndName() {
		valueNameMap=new HashMap<>();
		for(Program p:Program.values()) {
			valueNameMap.put(p.getValue(), p.name());
		}
	}
	
	public static String getEnumName(String  value) {
		return valueNameMap.get(value);
	}
	public static String getEnumName2(String  value) {
		String enumName="";
		for(Program program:Program.values()) {
			if(program.getValue().equals(value)) {
				enumName= program.name();
			}
		}
		if(enumName.equals("")) {
			throw new RuntimeException("Enumname not found.");
		}
		return enumName;
	}
	
	private static void createMapOfValueAndEnum() {
		valueEnumMap=new HashMap<>();
		for(Program p:Program.values()) {
			valueEnumMap.put(p.getValue(), p);
		}
	}
	public static Program getEnum(String  value) {
		return valueEnumMap.get(value);
	}
	public static Program getEnum2(String  value) {
		Program enumType=null;
		for(Program program:Program.values()) {
			if(program.getValue().equals(value)) {
				enumType= program;
			}
		}
		if(enumType==null) {
			throw new RuntimeException("enumType not found.");
		}
		return enumType;
	}
	
	
	@Override
	public	String toString(){
		return Program.HIGH_SCHOOL.name();
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(Program.values()));//[HIGH_SCHOOL, HIGH_SCHOOL, HIGH_SCHOOL, HIGH_SCHOOL, HIGH_SCHOOL, HIGH_SCHOOL, HIGH_SCHOOL]
		//internally using Program.toString() method
		
		for(Program program:Program.values()) {
			System.out.print(program.name()+"\t");//HOME_SCHOOL	DAYCARE	NURSARY	PRIMARY	JUNIOR	HIGH_SCHOOL	INTERMEDIATE
		}
		System.out.println("\n"+Program.NURSARY.ordinal());//2
		
		System.out.print(Program.NURSARY.name()+"\t");//NURSARY
		System.out.print(Program.NURSARY.toString()+"\t");//Not reliable because may be overridden
		System.out.println(Program.NURSARY.getValue());//LKG,UKG & 1st
		
		System.out.print(Program.valueOf("NURSARY").name()+"\t");//NURSARY
		System.out.print(Program.valueOf(Program.class, "NURSARY").name()+"\t");	//NURSARY	
		System.out.println(Program.valueOf("NURSARY").getValue());//LKG,UKG & 1st
		
		System.out.print(Program.getEnumName("LKG,UKG & 1st")+"\t");//NURSARY
		System.out.println(Program.getEnumName2("LKG,UKG & 1st"));//NURSARY
		
		System.out.print(Program.getEnum("LKG,UKG & 1st").toString()+"\t");//HIGH_SCHOOL
		System.out.print(Program.getEnum("LKG,UKG & 1st").name()+"\t");//NURSARY
		System.out.println(Program.getEnum("LKG,UKG & 1st").value);//LKG,UKG & 1st
		
		System.out.print(Program.getEnum2("LKG,UKG & 1st").toString()+"\t");//HIGH_SCHOOL
		System.out.print(Program.getEnum2("LKG,UKG & 1st").name()+"\t");//NURSARY
		System.out.println(Program.getEnum2("LKG,UKG & 1st").value);//LKG,UKG & 1st
	}

}
