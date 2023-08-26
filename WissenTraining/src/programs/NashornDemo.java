package programs;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornDemo {
	public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException{
		
		//engine manger
		ScriptEngineManager mgr=new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("nashorn");
		
		engine.eval(""
				+ "for(i=0;i<10;i++){\n"
				+ "	print(\"Executing javascript from java... \"+i+\"...\");\n"
				+ "}");
		
		//providing path of js file
		//engine.eval(new FileReader("/Users/aditya/Documents/eclipse-workspace/WissenTraining/src/programs/Test.js"));
		
//		Invocable inv=(Invocable) engine;
//		
//		double result=(double) inv.invokeFunction("sum", 20,30);
//		System.out.println(result);
//		//inv.invokeFunction("displayData");
	}
}
