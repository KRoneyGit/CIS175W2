package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
* @author Kevin Roney - karoney
* CIS 175 - Fall 2023
* Jan 23, 2023
*/
@RunWith(Suite.class)
@SuiteClasses({ TestHigherOperations.class, TestSimpleOperations.class })
public class AllTests {

}
