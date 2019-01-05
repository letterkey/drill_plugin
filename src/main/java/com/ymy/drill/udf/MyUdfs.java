package com.ymy.drill.udf;
import org.apache.drill.exec.expr.DrillSimpleFunc;
import org.apache.drill.exec.expr.annotations.FunctionTemplate;
import org.apache.drill.exec.expr.annotations.FunctionTemplate.FunctionScope;
import org.apache.drill.exec.expr.annotations.FunctionTemplate.NullHandling;
import org.apache.drill.exec.expr.annotations.Output;
import org.apache.drill.exec.expr.annotations.Param;
import org.apache.drill.exec.expr.holders.BigIntHolder;
import org.apache.drill.exec.record.RecordBatch;
public class MyUdfs {
	@FunctionTemplate(name = "addint", scope = FunctionScope.SIMPLE, nulls = NullHandling.NULL_IF_NULL)
	  public static class Add1 implements DrillSimpleFunc{
	    
	    @Param BigIntHolder input1;
	    @Param BigIntHolder input2;
	    @Output BigIntHolder out;
	    public void setup(RecordBatch b){}
	         
	    public void eval(){
	      out.value = input1.value + input2.value;
	    }

		@Override
		public void setup() {
			
		}
	}
}
