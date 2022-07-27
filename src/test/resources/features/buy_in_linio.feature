Feature: Buy items online
  as a user
  I need to select items from the platform
  to buy the item

  @Case1
  Scenario Outline: Buy the item
    Given as a user access the platform page
    When I select the article <article>  to add to the cart
    Then valid that the article <article> is in the cart

    Examples:
      | article                              |
      | "Nevera MABE 360 Lt RMP360FYCU Inox" |

  @Case2
  Scenario Outline:Select category to Buy the item
    Given as a user access the platform page
    When I select the category and the article <article> to add to the cart
    Then valid that the article <article> is in the cart

    Examples:
      | article                                                       |
      | "Protector De Pantalla Para iPhone 6 Plus/6s Plus Posh Clear" |

