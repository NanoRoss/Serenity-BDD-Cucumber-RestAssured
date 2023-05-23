Feature: Validaciones sobre GET requests en sonplaceholder_typicode_com

  Scenario Outline: GET request with post id
    Given Get Rrequest by id <Post ID>
    Then Status code ShouldBe 200
    And The tittle should contain "<Title>"
    Examples:
      | Post ID |  Title                                                          |
      | 1       | sunt aut facere repellat provident occaecati excepturi          |
      | 2       | qui est esse                                                  |
      | 3       | ea molestias quasi exercitationem repellat qui ipsa sit aut     |
