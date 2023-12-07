Feature: Test for PA2(http://127.0.0.1:8000/login)
		
    Given open chrome and start application
    When I enter valid username and valid password
    Then I can login succesfully
    And I click menu table
    And I click button tambah
    And I enter valid nama
    And I enter valid nomor meja
    And I enter valid deskripsi
    Then I can tambah barang succesfully