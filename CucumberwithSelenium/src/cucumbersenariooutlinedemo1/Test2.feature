Feature: Login with multipule users

  Scenario Outline: Title of your scenario outline
    Given I want to write a step with "<username>"
    When I check for the "<password>" in step
    Then I verify the "<status>" in step

    Examples: 
      | username        | password    | status  |
      | admin           | admin123    | success |
      | pradeep         | pradeep6223 | Fail    |
      | RBGTechnologies | RBG456      | Pass    |
