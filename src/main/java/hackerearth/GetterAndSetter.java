package hackerearth;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class GetterAndSetter {
 public static void settingValues(Product prod, Product product) {
 
  // Getting fields of the class
  Field[] fields = prod.getClass().getDeclaredFields();  
  for(Field f : fields){	  
   String fieldName = f.getName();
   System.out.println("Field Name --- " + fieldName);
   if(! fieldName.equals("product_id"))
     callSetter(prod, fieldName, callGetter(product,fieldName ));
  } 
 } 
 /**
  * 
  * @param obj
  * @param fieldName
  * @param value
  */
 
 
 private static void callSetter(Object obj, String fieldName, Object value){
  PropertyDescriptor pd;
  try {
	  
	  System.out.println("value to set "+value);
   pd = new PropertyDescriptor(fieldName, obj.getClass());
   pd.getWriteMethod().invoke(obj, value);
   System.out.println("");
  } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
 
 /**
  * 
  * @param obj
  * @param fieldName
  * @param value
  */
 private static Object callGetter(Object obj, String fieldName){
  PropertyDescriptor pd;
  Object value=null;
  try {
   pd = new PropertyDescriptor(fieldName, obj.getClass());
   System.out.println("" + pd.getReadMethod().invoke(obj));
   value=pd.getReadMethod().invoke(obj);
   System.out.println(" value fetched !!!  : "+value);
  } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  System.out.println("Returning value to set !! ");
return value;
 }
}