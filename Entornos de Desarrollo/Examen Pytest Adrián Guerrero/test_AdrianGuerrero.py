import pytest
from adrian_funcion import is_valid_email_address

def test_is_valid_email_address1():
    assert is_valid_email_address ("adrian@gmail.com") == True
def test_is_valid_email_address2():
    assert is_valid_email_address ("adriangmail.com") == False
def test_is_valid_email_address3():
    assert is_valid_email_address ("adrian@gmail") == False
    #Este test lo he puesto como un email invalido pero el programa se equivoca y me lo cuenta como que es valido, para estos casos de email el programa no serviría. 
def test_is_valid_email_address4():
    assert is_valid_email_address ("joniko@gmail.com") == True
def test_is_valid_email_address5():
    assert is_valid_email_address ("@gmail.com") == False
    #Este test lo he puesto como un email invalido pero el programa se equivoca y me lo cuenta como que es valido, para estos casos de email el programa no serviría.