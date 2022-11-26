package proyecto_junit.proyecto_junit;

import org.testng.annotations.Test;
import proyecto_junit.*;

public class PizzaOrdenTest {

  @Test
  public void desplegarIngredientesTest() {
	  System.out.println("Probando método desplegarIngredientes...");
	  PizzaOrden nuevaOrden = new PizzaOrden();	  
	  try {
		  nuevaOrden.desplegarIngredientes();
	  } catch( Exception e ) {		  
		  throw new RuntimeException("Test falló");		  
	  }	 
  }

  @Test
  public void desplegarResumenOrdenTest() {
	  System.out.println("Probando método desplegarResumenOrden...");
	  PizzaOrden nuevaOrden = new PizzaOrden();	  
	  try {
		  nuevaOrden.desplegarResumenOrden();
	  } catch( Exception e ) {		  
		  throw new RuntimeException("Test falló");		  
	  }	 
  }

  @Test
  public void guardarIngredientesTest() {
	  System.out.println("Probando método guardarIngredientes...");
	  PizzaOrden nuevaOrden = new PizzaOrden();	  
	  try {
		  nuevaOrden.guardarIngredientes();
	  } catch( Exception e ) {		  
		  throw new RuntimeException("Test falló");		  
	  }	   
  }

  @Test
  public void preguntarPizzaVegetarianaTest() {
	  System.out.println("Probando método preguntarPizzaVegetariana...");
	  PizzaOrden nuevaOrden = new PizzaOrden();	  
	  try {
		  nuevaOrden.preguntarPizzaVegetariana();
	  } catch( Exception e ) {		  
		  throw new RuntimeException("Test falló");		  
	  }	 
  }

  @Test
  public void setIngrediente1Test() {
	  System.out.println("Probando método setIngrediente1...");
	  PizzaOrden nuevaOrden = new PizzaOrden();	  
	  try {
		  nuevaOrden.setIngrediente1( "W" );
	  } catch( Exception e ) {		  
		  throw new RuntimeException("Test falló");		  
	  }	  
  }

  @Test
  public void setIngrediente2Test() {
  
	  System.out.println("Probando método setIngrediente2...");
	  PizzaOrden nuevaOrden = new PizzaOrden();	  
	  try {
		  nuevaOrden.setIngrediente2( "1" );
	  } catch( Exception e ) {		  
		  throw new RuntimeException("Test falló");		  
	  }	
	  
  }

  @Test
  public void setIngrediente3Test() {
	  System.out.println("Probando método setIngrediente3...");
	  PizzaOrden nuevaOrden = new PizzaOrden();	  
	  try {
		  nuevaOrden.setIngrediente3( "b" );
	  } catch( Exception e ) {		  
		  throw new RuntimeException("Test falló");		  
	  }	  }

  @Test
  public void setOpcionVegTest() {
	  
	  System.out.println("Probando método setOpcionVegTest...");
	  PizzaOrden nuevaOrden = new PizzaOrden();
	  
	  try {
		  nuevaOrden.setOpcionVeg( null );
	  } catch( Exception e ) {
		  throw new RuntimeException("Test falló");		  
	  }
  }
}
