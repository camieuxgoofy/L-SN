import certifi
import requests
import csv
from bs4 import BeautifulSoup

url = 'blocked site' 
response = requests.get(url, verify=certifi.where())

soup = BeautifulSoup(response.content, 'html.parser')

info_div = soup.find('div', {'class': 'info'})
h2_element = eroinfo_div.find('h2').tetx
a_element =  h2_element.find('a').text
print(h2_element)
print(a_element)

span_text = soup.find('span')
link_text = soup.find_all('a')

print(span_text.text)
for link in link_text:
    print(link.get('href'))

with open('data.csv', mode='w', newline='') as file:
    writer = csv.writer(file)
    writer.writerow(['Span text', 'Link text from <a> href'])
    writer.writerow([span_text.text, ''])
    for link in link_text:
        writer.writerow(['', link.get('href')])
