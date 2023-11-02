# Navigate to https://www.bbc.com/  and  print  out  the
# top 10 latest news from the home page.

import time
from selenium import webdriver
from selenium.webdriver.firefox.service import Service
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.by import By


def top_headlines(driver):
    media_summary_elements = driver.find_elements(By.CLASS_NAME, "media__summary")
    index = 1
    for news in media_summary_elements[:10]:  # print only first 10
        print("Headline " + str(index) + ": " + news.text)
        index += 1


def main():
    s = Service(GeckoDriverManager().install())
    driver = webdriver.Firefox(service=s)
    driver.get("https://www.bbc.com/")
    top_headlines(driver)


if __name__ == "__main__":
    main()
