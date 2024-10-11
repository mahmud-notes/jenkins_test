Feature: Checking file Upload

  Background:
  Scenario: UploadFile & Check Result
    Given Going To Url
    When Upload File "src/test/resources/Date Validitioni.PNG"
    Then Check Message



