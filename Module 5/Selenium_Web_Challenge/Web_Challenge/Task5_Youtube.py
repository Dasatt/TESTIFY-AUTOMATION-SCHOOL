# Using any browser navigate to any Youtube video of your choice,
# allow your script to wait for the comments to load then get the first two comments,
# and print them in the terminal.


import time
from selenium import webdriver
from selenium.webdriver.firefox.service import Service
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.by import By


def get_comments(driver):
    comment_text_element = driver.find_elements(By.ID, "content-text")
    index = 1
    for comments in comment_text_element[:2]:  # print only first 2:
        print("Comment " + str(index) + ": " + comments.text)
        index += 1

def main():
    s = Service(GeckoDriverManager().install())
    driver = webdriver.Firefox(service=s)
    driver.get("https://www.youtube.com/watch?v=j_Neq2nBJ8Q")
    time.sleep(3)
    driver.execute_script("window.scrollTo(200, window.innerHeight);")
    time.sleep(5)
    get_comments(driver)


if __name__ == "__main__":
    main()
