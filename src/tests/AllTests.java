/**
 * Cuidado ao usar a seguinte classe nos Casos de Testes:
 *  import org.junit.jupiter.api.Test;
 *  
 *  Pode gerar erros do tipo no-runnable-methods ou simplesmente nao executar os testes
 *  Substituia por:
 *  import org.junit.Test;
 *  Ref.: https://www.yawintutor.com/java-lang-exception-no-runnable-methods/
 * 
 */
package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({
	FatorialTest.class,
	FibonacciTest.class,
	WaterTest.class
})
public class AllTests {
	// no code here, apenas usada para manter as anotações acima.
	
	
}
