Feature: Login

  Scenario: Login to Mach23
    When I perform a login as
      | userName | jimmy.romero@fundacion-jala.org |
      | password | Deviljin0309                    |
    Then I will have a user logged
