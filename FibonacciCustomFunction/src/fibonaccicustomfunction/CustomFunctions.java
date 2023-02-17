package fibonaccicustomfunction;

import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "Custom Functions", prefix = "src", namespace = "http://www.fibonacci.com", helpText = "Custom defined function")
public class CustomFunctions {

	@XPathFunction(helpText = "Description", parameters = {
			@XPathFunctionParameter(name = "range", optional = false, optionalValue = "") })
	public String FiboCustomFun(int range) {
		int a= 0 ;
        int b= 1 ;
        int c;
        String result = a+", "+b;
       
        
                 for (int i= 2 ; i< range;i++)
            
                            {
                	 		c=a+b;
                            result= result+", "+c;
                            a = b;
                            b = c;
                            }
                 
            
                 return result;
    }
}