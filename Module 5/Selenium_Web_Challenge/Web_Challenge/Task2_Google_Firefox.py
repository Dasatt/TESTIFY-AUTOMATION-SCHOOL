# Using    the    firefox    browser    navigate    to https://www.google.com/  enter
# the  text  Python  in  the search  box,  then  send  the  Enter  key.
# Get  the  text  from  the Wikipedia  brief  on  the  right  side  and  print
# the  value  in  the console.
import time
from selenium import webdriver
from selenium.webdriver.firefox.service import Service
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.by import By


def enter_search_query(driver):
    search_box_element = driver.find_element(By.ID, "APjFqb")
    search_box_element.send_keys("Python")


def search_button(driver):
    # Click around webpage to remove suggestion list
    driver.find_element(By.XPATH, "//body/div[1]/div[2]").click()
    time.sleep(5)
    search_button_element = driver.find_element(By.NAME, "btnK")
    search_button_element.submit()
    time.sleep(5)


def get_wiki_text(driver):
    div_element = driver.find_element(By.CLASS_NAME, "kno-rdesc")
    # span_element = div_element.find_element(By.TAG_NAME, "span")
    print(div_element.text)


def main():
    s = Service(GeckoDriverManager().install())
    driver = webdriver.Firefox(service=s)
    driver.get("https://google.com")
    enter_search_query(driver)
    search_button(driver)
    get_wiki_text(driver)


if __name__ == "__main__":
    main()
