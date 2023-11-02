import time

from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys


def fill_data(driver):
    email_element = driver.find_element(By.ID, "email")
    email_element.send_keys("test@gmail.com")
    password_element = driver.find_element(By.ID, "pass")
    password_element.send_keys("tester123")


def login(driver):
    login_button_element = driver.find_element(By.NAME, "login")
    time.sleep(5)
    login_button_element.click()


def main():
    s = Service(ChromeDriverManager().install())
    # s = Service(
    #     r"C:\Users\YEMISI\OneDrive\Documents\Software Testing\Testify Academy\Testify Automation School Repo\Module 5\Selenium_Web_Challenge\Webdrivers\chromedriver-win64\chromedriver.exe")
    driver = webdriver.Chrome(service=s)
    driver.get("https://facebook.com")
    fill_data(driver)
    login(driver)


if __name__ == "__main__":
    main()
