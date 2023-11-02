# Navigate any browser to https://weather.com/ get the
# current  temperature  and  print  it  out  in  the  terminal.
# Then print out the temperature for Morning, Afternoon, Evening,and Overnight.

import time
from selenium import webdriver
from selenium.webdriver.firefox.service import Service
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.by import By


def current_temperature(driver):
    current_temp_div_element = driver.find_element(By.CLASS_NAME, "CurrentConditions--primary--2DOqs")
    current_temp_val_element = current_temp_div_element.find_element(By.TAG_NAME, "span")
    print("Current Temperature is: ", current_temp_val_element.text)


def forecast_data(driver):
    forecast_div_element = driver.find_element(By.CLASS_NAME, "TodayWeatherCard--TableWrapper--globn")
    ul_element = forecast_div_element.find_element(By.TAG_NAME, "ul")
    forecast_list = ul_element.find_elements(By.TAG_NAME, "li")
    for data in forecast_list:
        time_of_day = data.find_element(By.TAG_NAME, "h3").find_element(By.TAG_NAME, "span").text
        time_of_day_data = data.find_element(By.TAG_NAME, "div").find_element(By.TAG_NAME, "span").text
        print(time_of_day + ": " + time_of_day_data)


def main():
    s = Service(GeckoDriverManager().install())
    driver = webdriver.Firefox(service=s)
    driver.get("https://weather.com/")
    current_temperature(driver)
    forecast_data(driver)


if __name__ == "__main__":
    main()
