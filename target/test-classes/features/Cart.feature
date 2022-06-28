@Cart
Feature: Add & Update Cart

  @updatecart
  Scenario Outline: Verify the customer is able to add products to cart and remove one or more added products from cart
		Given I add four random items to my cart
		When I view my cart
		Then I find total four items listed in my cart
    And I am able to remove the lowest price item from my cart
 		Then I am able to verify three items in my cart

    Examples: 
			|test_id | num_prod_tobe_added | num_prod_tobe_removed |
			|001  	 | 4                   | 1                     |