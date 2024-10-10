Feature: Checking file Upload

  Background:
  Scenario: UploadFile & Check Result
    Given Going To Url
    When Upload File "C:\\Users\\m2.hasan\\Downloads\\upload_image.jpg"
    Then Check Message



