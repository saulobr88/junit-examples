/**
 * Os testes podem ser executados como uma Java Application, basta seguir o que eh apresentado aqui:
 * Ref.: https://www.guru99.com/create-junit-test-suite.html
 */

package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunAllTests {

	public static void main(String[] args) { 
		Result result = JUnitCore.runClasses(AllTests.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
