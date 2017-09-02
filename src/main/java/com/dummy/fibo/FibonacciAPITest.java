package com.dummy.fibo;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

/**
 * FibonacciAPITest
 *
 * @author Nicolas L. Di Benedetto
 * @version ($Revision$)
 * @date 05/10/2012
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath*:applicationContext-test.xml")
public class FibonacciAPITest {

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Fields ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

	/**
	 * The Subject Under Test.
	 */
	//@Autowired
	IFibonacciApi sut;

	/**
	 * Initial sequence term.
	 */
	private static final int STARTING_TERM = 0;

	/**
	 * Number of terms in expected sequence.
	 */
	private static final short TERMS = 9;

	/**
	 * Expected sequence.
	 */
	private List<Integer> expectedSequence = new ArrayList<Integer>(FibonacciAPITest.TERMS) {
		{
			this.add(0);
			this.add(1);
			this.add(1);
			this.add(2);
			this.add(3);
			this.add(5);
			this.add(8);
			this.add(13);
			this.add(21);
		}
	};

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Constructors ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
	/**
	 * Default constructor.
	 */
	public FibonacciAPITest() {}

	/**
	 * @throws java.lang.Exception
	 */
	//@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	/**
	 * @throws java.lang.Exception
	 */
	//@Before
	public void setUp() throws Exception {}

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Business Methods ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
	//@Test
	public void shouldGenerateSequence() {
		// GIVEN
		IFibonacciApi fibonacci = this.sut;

		// WHEN
		List<Integer> sequence = fibonacci.generateSequence(FibonacciAPITest.STARTING_TERM, FibonacciAPITest.TERMS);

		// THEN
		Assert.assertTrue(sequence.containsAll(this.expectedSequence));
		Assert.assertTrue(this.expectedSequence.containsAll(sequence));
	}

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Getters & Setters ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

}

