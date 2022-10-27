from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager
import time
from os.path import exists
import re

USERNAME = 'admin_'
PASSWORD = ''
BASEURL  = 'http://' + open('url.txt','r').read()
SECRET   = 'POW_TEST'

def genDriver():
  options = webdriver.ChromeOptions()
  options.add_argument('--headless')
  options.add_argument('--disable-logging')
  options.add_argument('--disable-dev-shm-usage')
  options.add_argument('--no-sandbox')

  driver = webdriver.Chrome(ChromeDriverManager().install(), options=options)
  driver.get('http://google.com')

  driver.implicitly_wait(3)
  return driver

driver = genDriver()

if not exists('register.lock'):
  driver.get(f'{BASEURL}/register')
  driver.find_element(By.ID, 'inputID').send_keys(USERNAME)
  driver.find_element(By.ID, 'inputPW').send_keys(PASSWORD)
  driver.find_element(By.ID, 'inputComment').send_keys("ADMIN BOARD")

  driver.find_element(By.ID, 'submitBtn').click()
  time.sleep(1)
  alert = driver.switch_to.alert
  alert.accept()
  f = open('register.lock', 'wb')
  f.write(b'')
  f.close()
  time.sleep(2)

def doLogin():
  driver.get(f'{BASEURL}/login')
  driver.find_element(By.ID, 'inputID').send_keys(USERNAME)
  driver.find_element(By.ID, 'inputPW').send_keys(PASSWORD)

  driver.find_element(By.ID, 'submitBtn').click()
  time.sleep(1)
  alert = driver.switch_to.alert
  alert.accept()
  time.sleep(1)
doLogin()

p = re.compile("acceptRequest\('(.*)'\)")
while True:
  try:
    print('Refresh')
    driver.get(f'{BASEURL}/friends')
    time.sleep(1)
    receive = driver.find_element(By.ID, 'receive')
    receiveList = receive.get_attribute('innerHTML')
    receiveList = receiveList.split('</tr>')
    first = receiveList[0]
    username = p.findall(first)

    if len(username) != 0:
      username = username[0]
      print(username)
      driver.execute_script(f'acceptRequest("{username}", "{SECRET}")')
      time.sleep(1)
      alert = driver.switch_to.alert
      alert.accept()
      time.sleep(2)

      driver.execute_script(f'visit("{username}")')
      time.sleep(3)
      driver.quit()
      time.sleep(2)
      driver = genDriver()

      doLogin()

    time.sleep(10)
  except Exception as e:
    print(e)
    driver.quit()
    time.sleep(2)
    driver = genDriver()
    doLogin()

driver.quit()
