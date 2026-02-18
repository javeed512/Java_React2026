package com.hexaware.junit.suites;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectClasses({AdditionTest.class, SubtractionTest.class})
@SelectPackages(value = {"com.hexaware.junit.suites"})
@IncludeTags({"Development"})
//@IncludeTags({"t1","t2"})
@ExcludeTags("t2")
public class CalculatorTestSuite {

}
