Feature:


  Scenario:

    Given user enters valid username
    When  user  enters valid password
    Then  user click on the login Button


    Given user choose product1
    When   user click on Add to cart Button
    And   user click on cart Icon
    Then  the product should appear in the cart list




    Given user click on checkout Button
    When  user fill in firstname
    And   user fill in lastname
    And   user fill in  postal code
    Then  user click on continue Button


    Given user check the Product name
    When  user check the Payment Information
    And   user check the Shipping Information
    And   user check the Price Total
    And   user check the Total
    And  user click on Finish Button
    Then A success message should be displayed "Thank you for your order"





