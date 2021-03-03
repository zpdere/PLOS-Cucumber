Feature: Home
  On the home page, verify that the following type of modules are present.
  Modules: Publish with PLOS, Research Communities, Open Science, Resources,About PLOS

@WIP
  Scenario Outline: Type of "<module>" is present
    Given User on the home page
    Then Verify that "<module>" is present


    Examples:
      | module               |
      | Publish with PLOS    |
      | Research Communities |
      | Open Science         |
      | Resources            |
      | About PLOS           |

