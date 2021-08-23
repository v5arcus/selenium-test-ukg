package com.knoldus.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends AbstractTest {

  @Test
  public void verifyTitle () {
    Assert.assertEquals(page.getTitle(), "Knoldus Inc. - Product Engineering Done Right", "Testing if title is QualityWorks Consulting Group");
  }

}
