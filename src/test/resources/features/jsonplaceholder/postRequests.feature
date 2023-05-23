Feature: Validaciones sobre POST requests en sonplaceholder_typicode_com

  Scenario Outline: POST requests on Api
    Given POST request with json data
    Then Status code ShouldBe 201
    And "<title>" in the response body is correct
    And The "<body>" in the response body is correct
    Examples:
      | title         | body  |
      | new Tittle    | barto |

