package org.bzs.enculette;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * TODO apaquin This type ...
 *
 * @author apaquin
 */
public class HelloWorldTest {

  /**
   *
   */
  @Test
  public void test() {

    HelloWorld tester = new HelloWorld();

    assertEquals("Hello", tester.sayhello());
  }

}
